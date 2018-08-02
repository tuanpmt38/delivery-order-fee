package vn.shippo.deliveryorderfee.controller;


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
    public List<DeliveryOrderFee> listAll(){
        return deliveryOrderFeeService.findAll();
    }
}
