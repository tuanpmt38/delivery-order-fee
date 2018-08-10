package vn.shippo.deliveryorderfee.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.util.UriComponentsBuilder;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;
import vn.shippo.deliveryorderfee.service.MerchantPickupAddressService;
import vn.shippo.deliveryorderfee.exception.ErrorMessage;

import javax.persistence.EntityNotFoundException;
import java.util.Optional;

@Controller
@RequestMapping("/api")
public class MerchantPickupAddressController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);

    private MerchantPickupAddressService merchantPickupAddressService;

    @Autowired
    public MerchantPickupAddressController(MerchantPickupAddressService merchantPickupAddressService){
        this.merchantPickupAddressService = merchantPickupAddressService;
    }

    @RequestMapping(value = "/pickup_address", method = RequestMethod.GET)
    public ResponseEntity<Page<MerchantPickupAddress>> getMerchantPickupAddress(Pageable pageable) {

        Page<MerchantPickupAddress> merchantPickupAddressPage = merchantPickupAddressService.findAll(pageable);
        logger.info("Page Merchant pickup address: " + merchantPickupAddressPage);
        return new ResponseEntity<Page<MerchantPickupAddress>>(merchantPickupAddressPage, HttpStatus.OK);
    }


    @RequestMapping(value = "/pickup_address/{id}", method = RequestMethod.GET, produces = {"application/hal+json"})
    public ResponseEntity<MerchantPickupAddress> getMerchantPickupAddressById(@PathVariable("id") Integer id) throws EntityNotFoundException {

        logger.info("Merchant pickup address by id: "+ id);
        Optional<MerchantPickupAddress> pickupAddress = merchantPickupAddressService.findById(id);
        logger.info("Result pickup address: " + pickupAddress);
        if(pickupAddress.isPresent()){
            return new ResponseEntity<>(pickupAddress.get(), HttpStatus.OK);
        }
        return new ResponseEntity(new ErrorMessage(HttpStatus.NOT_FOUND, "name", "error name"),HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/pickup_address", method = RequestMethod.POST)
    public ResponseEntity<Void> createMerchantPickupAddress(@RequestBody MerchantPickupAddress merchantPickupAddress, UriComponentsBuilder builder){

        merchantPickupAddressService.save(merchantPickupAddress);
        logger.info("Creating merchant pickup address : {}", merchantPickupAddress);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/pickup_address/{id}").buildAndExpand(merchantPickupAddress.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/pickup_address/{id}", method = RequestMethod.PUT)
    public ResponseEntity<MerchantPickupAddress> updateMerchantPickupAddress(@PathVariable("id") Integer id, @RequestBody MerchantPickupAddress pickupAddress){
        logger.info("Fetching and update pickup address with id = "+id);
        Optional<MerchantPickupAddress> currentmerchantPickupAddress = merchantPickupAddressService.findById(id);
        if(!currentmerchantPickupAddress.isPresent()){
            logger.info("pickup address with "+ id +"not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentmerchantPickupAddress.get().setPickupContactName(pickupAddress.getPickupContactName());
        currentmerchantPickupAddress.get().setPickupContactPhone(pickupAddress.getPickupContactPhone());
        currentmerchantPickupAddress.get().setPickupFullAddress(pickupAddress.getPickupFullAddress());
        merchantPickupAddressService.save(currentmerchantPickupAddress.get());
        logger.info("Result current merchant pickup address:" + currentmerchantPickupAddress);
        return new ResponseEntity<MerchantPickupAddress>(currentmerchantPickupAddress.get(),HttpStatus.OK);

    }

    @RequestMapping(value = "/pickup_address/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<MerchantPickupAddress> deleteMerchantPickupAddress(@PathVariable ("id") Integer id){
        logger.info("Fetching and deleting pickup address with id ="+id);
        Optional<MerchantPickupAddress> merchantPickupAddress = merchantPickupAddressService.findById(id);
        merchantPickupAddressService.delete(merchantPickupAddress.get().getId());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
