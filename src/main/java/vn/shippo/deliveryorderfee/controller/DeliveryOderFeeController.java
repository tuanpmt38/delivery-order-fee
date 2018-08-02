package vn.shippo.deliveryorderfee.controller;


import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.service.DeliveryOrderFeeService;

import java.util.List;

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
}
