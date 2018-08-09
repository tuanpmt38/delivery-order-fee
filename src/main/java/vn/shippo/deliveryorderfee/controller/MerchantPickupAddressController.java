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
import vn.shippo.deliveryorderfee.util.MessageError;

import java.util.List;
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
        logger.info("Page merchantPickupAdresspage: " + merchantPickupAddressPage);
        return new ResponseEntity<Page<MerchantPickupAddress>>(merchantPickupAddressPage, HttpStatus.OK);
    }


    @RequestMapping(value = "/pickup_address/{id}", method = RequestMethod.GET)
    public ResponseEntity<MerchantPickupAddress> getMerchantPickupAddressById(@PathVariable("id") Integer id){

        System.out.printf("MerchantPickupAddressById id: "+ id);
        Optional<MerchantPickupAddress> pickupAddress = merchantPickupAddressService.findById(id);
        if(pickupAddress.isPresent()){
            return new ResponseEntity<>(pickupAddress.get(), HttpStatus.OK);
        }
        return new ResponseEntity(new MessageError("Address not found"), HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/pickup_address", method = RequestMethod.POST)
    public ResponseEntity<Void> createMerchantPickupAddress(@RequestBody MerchantPickupAddress merchantPickupAddress, UriComponentsBuilder builder){

        logger.info("Creating merchantPickupAddress : {}", merchantPickupAddress);
        merchantPickupAddressService.save(merchantPickupAddress);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(builder.path("/pickup_address/{id}").buildAndExpand(merchantPickupAddress.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }
}
