package vn.shippo.deliveryorderfee.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import vn.shippo.deliveryorderfee.model.MerchantPickupAddress;
import vn.shippo.deliveryorderfee.service.MerchantPickupAddressService;

import java.util.List;

@Controller
@RequestMapping("/api")
public class MerchantPickupAddressController {

    private MerchantPickupAddressService merchantPickupAddressService;

    @Autowired
    public MerchantPickupAddressController(MerchantPickupAddressService merchantPickupAddressService){
        this.merchantPickupAddressService = merchantPickupAddressService;
    }

    @RequestMapping(value = "/merchantpickupaddress", method = RequestMethod.GET)
    public ResponseEntity<List<MerchantPickupAddress>> getMerchantPickupAddress(){

        List<MerchantPickupAddress> merchantPickupAddresses = merchantPickupAddressService.findAll();
        if(merchantPickupAddresses.isEmpty()){
            return new ResponseEntity<List<MerchantPickupAddress>>( HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<List<MerchantPickupAddress>>(merchantPickupAddresses, HttpStatus.OK);
    }
}
