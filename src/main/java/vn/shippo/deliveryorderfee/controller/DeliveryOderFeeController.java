package vn.shippo.deliveryorderfee.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.util.UriComponentsBuilder;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.service.DeliveryOrderFeeService;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/deliveryOrderFee")
public class DeliveryOderFeeController {

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

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public ResponseEntity<Void> createCustomer(@RequestBody DeliveryOrderFee deliveryOrderFee, UriComponentsBuilder ucBuilder) {
        deliveryOrderFeeService.save(deliveryOrderFee);
        HttpHeaders headers = new HttpHeaders();
        headers.setLocation(ucBuilder.path("/deliveryOrderFee/{id}").buildAndExpand(deliveryOrderFee.getId()).toUri());
        return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
    }

//    @RequestMapping(value = "/create", method = RequestMethod.POST)
//    public ResponseEntity<Void> createCustomer(@RequestBody DeliveryOrderFee deliveryOrderFee) {
//
//        DeliveryOrderFee deliveryOrderFeeSave = deliveryOrderFeeService.save(deliveryOrderFee);
//        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
//                .buildAndExpand(deliveryOrderFeeSave.getId()).toUri();
//
//        return ResponseEntity.created(location).build();
//
//    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<DeliveryOrderFee> getDeliveryOrderFee(@PathVariable("id") Integer id){
        Optional<DeliveryOrderFee> deliveryOrderFee = deliveryOrderFeeService.findById(id);
        if(deliveryOrderFee.isPresent()){
            DeliveryOrderFee deliveryOrderFees = deliveryOrderFee.get();
        }
        return deliveryOrderFee;
    }


}
