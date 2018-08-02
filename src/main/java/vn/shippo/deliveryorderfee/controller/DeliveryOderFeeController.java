package vn.shippo.deliveryorderfee.controller;


import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.service.DeliveryOrderFeeService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/delivery/orderfee")
public class DeliveryOderFeeController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);


    private DeliveryOrderFeeService deliveryOrderFeeService;
    public DeliveryOderFeeController(DeliveryOrderFeeService deliveryOrderFeeService){
        this.deliveryOrderFeeService = deliveryOrderFeeService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<List<DeliveryOrderFee>> listAll(){

        List<DeliveryOrderFee> deliveryOrderFees = deliveryOrderFeeService.findAll();
        if(deliveryOrderFees.isEmpty()){
            return new ResponseEntity<List<DeliveryOrderFee>>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<DeliveryOrderFee>>(deliveryOrderFees, HttpStatus.OK);
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST, consumes = "application/json")
    public DeliveryOrderFee createDeliveryOrderFee (@Valid @RequestBody DeliveryOrderFee deliveryOrderFee){
        return deliveryOrderFeeService.save(deliveryOrderFee);
    }
    public ResponseEntity<Void> createDeliveryOrderFee(@RequestBody DeliveryOrderFee deliveryOrderFee, UriComponentsBuilder ucBuilder) {
        deliveryOrderFeeService.save(deliveryOrderFee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/deliveryorderfee/{id}").buildAndExpand(deliveryOrderFee.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public ResponseEntity<DeliveryOrderFee> createDeliveryOrderFee(@RequestBody DeliveryOrderFee deliveryOrderFee) {
//
//        DeliveryOrderFee deliveryOrderFeeSave = deliveryOrderFeeService.save(deliveryOrderFee);
//        return new ResponseEntity<DeliveryOrderFee>(deliveryOrderFee, HttpStatus.CREATED);
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<DeliveryOrderFee> getDeliveryOrderFeeById(@PathVariable("id") Integer id){
        Optional<DeliveryOrderFee> deliveryOrderFee = deliveryOrderFeeService.findById(id);
        if(deliveryOrderFee.isPresent()){
            DeliveryOrderFee deliveryOrderFees = deliveryOrderFee.get();
        }
        return deliveryOrderFee;

    }


}
