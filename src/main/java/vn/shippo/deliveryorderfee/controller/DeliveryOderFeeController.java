package vn.shippo.deliveryorderfee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.repository.DeliveryOrderFeeRepository;
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
@RequestMapping("/api/delivery")
public class DeliveryOderFeeController {

    @Autowired
    private DeliveryOrderFeeRepository deliveryOrderFeeRepository;

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);


    private DeliveryOrderFeeService deliveryOrderFeeService;
    public DeliveryOderFeeController(DeliveryOrderFeeService deliveryOrderFeeService){
        this.deliveryOrderFeeService = deliveryOrderFeeService;
    }

    @RequestMapping(value = "/orderfee", method = RequestMethod.GET)
    public ResponseEntity<List<DeliveryOrderFee>> listAll(){

        List<DeliveryOrderFee> deliveryOrderFees = deliveryOrderFeeService.findAll();
        if(deliveryOrderFees.isEmpty()){
            return new ResponseEntity<List<DeliveryOrderFee>>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<DeliveryOrderFee>>(deliveryOrderFees, HttpStatus.OK);
    }

    @RequestMapping(value = "/orderfee/create", method = RequestMethod.POST)
    public DeliveryOrderFee createDeliveryOrderFee (@Valid @RequestBody DeliveryOrderFee deliveryOrderFee){
        return deliveryOrderFeeRepository.save(deliveryOrderFee);
    }

//    @RequestMapping(value = "/orderfee/create", method = RequestMethod.POST)
//    public ResponseEntity<?> createDeliveryOrderFee(@RequestBody DeliveryOrderFee deliveryOrderFee, UriComponentsBuilder ucBuilder){
//        logger.info("Creating DeliveryOrderFee : {}", deliveryOrderFee);
//        HttpHeaders headers = new HttpHeaders();
//
//        if(deliveryOrderFeeService.isDeliveryOrderExist(deliveryOrderFee)){
//            logger.error("Unable to create. A DeliveryOrderFee with name {} already exist", deliveryOrderFee.getFeeName());
//            return new ResponseEntity<String>(headers, HttpStatus.CONFLICT);
//        }
//
//        deliveryOrderFeeService.save(deliveryOrderFee);
//        headers.setLocation(ucBuilder.path("/api/delivery/orderfee/{id}").buildAndExpand(deliveryOrderFee.getId()).toUri());
//        return new ResponseEntity<String>(headers, HttpStatus.CREATED);
//    }

    @RequestMapping(value = "/orderfee/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<DeliveryOrderFee> getDeliveryOrderFeeById(@PathVariable("id") Integer id){
        logger.info("Fetching DeliveryOrderFee with id {}", id);
        Optional<DeliveryOrderFee> deliveryOrderFee = deliveryOrderFeeService.findById(id);
        if(deliveryOrderFee.isPresent()){
            DeliveryOrderFee deliveryOrderFees = deliveryOrderFee.get();
        }
        return deliveryOrderFee;

    }


}
