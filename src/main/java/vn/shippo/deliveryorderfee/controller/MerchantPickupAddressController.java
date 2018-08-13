package vn.shippo.deliveryorderfee.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.EntityLinks;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;
import vn.shippo.deliveryorderfee.service.MerchantPickupAddressService;

import java.util.Optional;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;

@Controller
@RequestMapping("/api")
public class MerchantPickupAddressController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);

//    @Autowired private EntityLinks links;

    private MerchantPickupAddressService merchantPickupAddressService;

    @Autowired
    public MerchantPickupAddressController(MerchantPickupAddressService merchantPickupAddressService){
        this.merchantPickupAddressService = merchantPickupAddressService;
    }

    @RequestMapping(value = "/pickup_address", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<PagedResources<MerchantPickupAddress>> getMerchantPickupAddress(Pageable pageable, PagedResourcesAssembler assembler) {

        Page<MerchantPickupAddress> merchantPickupAddressPage = merchantPickupAddressService.findAll(pageable);
        logger.info("Page Merchant pickup address: " + merchantPickupAddressPage);
        PagedResources < MerchantPickupAddress > pickupAddressPagedResources = assembler.toResource(merchantPickupAddressPage,
                linkTo(MerchantPickupAddressController.class).slash("/pickup_address").withSelfRel());

        return new ResponseEntity < > (assembler.toResource(merchantPickupAddressPage,
                linkTo(MerchantPickupAddressController.class).slash("/pickup_address").withSelfRel()), HttpStatus.OK);

//        return new ResponseEntity<>(merchantPickupAddressPage, HttpStatus.OK);
    }


    @RequestMapping(value = "/pickup_address/{id}", method = RequestMethod.GET, produces = {"application/hal+json"})
    public ResponseEntity<MerchantPickupAddress> getMerchantPickupAddressById(@PathVariable("id") Integer id)  {

        logger.info("Merchant pickup address by id: "+ id);
        Optional<MerchantPickupAddress> pickupAddress = merchantPickupAddressService.findById(id);
        logger.info("Result pickup address: " + pickupAddress);
        if(!pickupAddress.isPresent()){
            return new ResponseEntity<>(pickupAddress.get(), HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(pickupAddress.get(), HttpStatus.OK);
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
        Optional<MerchantPickupAddress> currentMerchantPickupAddress = merchantPickupAddressService.findById(id);
        if(!currentMerchantPickupAddress.isPresent()){
            logger.info("pickup address with "+ id +"not found");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentMerchantPickupAddress.get().setPickupContactName(pickupAddress.getPickupContactName());
        currentMerchantPickupAddress.get().setPickupContactPhone(pickupAddress.getPickupContactPhone());
        currentMerchantPickupAddress.get().setPickupFullAddress(pickupAddress.getPickupFullAddress());
        merchantPickupAddressService.save(currentMerchantPickupAddress.get());
        logger.info("Result current merchant pickup address:" + currentMerchantPickupAddress);
        return new ResponseEntity<MerchantPickupAddress>(currentMerchantPickupAddress.get(),HttpStatus.OK);

    }

    @RequestMapping(value = "/pickup_address/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<MerchantPickupAddress> deleteMerchantPickupAddress(@PathVariable ("id") Integer id){

        logger.info("Fetching and deleting pickup address with id ="+id);
        Optional<MerchantPickupAddress> merchantPickupAddress = merchantPickupAddressService.findById(id);
        merchantPickupAddress.get().setIsDeleted(1);
        merchantPickupAddressService.save(merchantPickupAddress.get());
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @RequestMapping(value = "/pickup_address/", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<MerchantPickupAddress> getAllMerchantPickupAddressByPickupContactNameAndPickupContactPhone(@RequestParam("pickupContactName")String pickupContactName, @RequestParam("pickupContactPhone") String pickupContactPhone) {

        MerchantPickupAddress merchantPickupAddress = merchantPickupAddressService.findAllByPickupContactNameAndPickupContactPhone(pickupContactName, pickupContactPhone );
        logger.info("Merchant pickup address: " + merchantPickupAddress);

        return new ResponseEntity<>(merchantPickupAddress, HttpStatus.OK);
    }


}
