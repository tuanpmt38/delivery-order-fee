package vn.shippo.deliveryorderfee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.model.Merchant;
import vn.shippo.deliveryorderfee.service.MerchantService;

import java.util.Optional;

@RestController
public class MerchantController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);

    private MerchantService merchantService;

    @Autowired
    public MerchantController(MerchantService merchantService){
        this.merchantService = merchantService;
    }

    @RequestMapping(value = "/merchant/{id}", method = RequestMethod.PUT)
    public ResponseEntity<Merchant> updateMerchant(@PathVariable("id") Integer id, @RequestBody Merchant merchant){

        logger.info("Fetching and update merchant with id "+ id);
        Optional<Merchant> currentMerchant = merchantService.findById(id);
        if(!currentMerchant.isPresent()){
            logger.info("Current merchant with id"+id+" not found");
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }
        currentMerchant.get().setFullName(merchant.getFullName());
        currentMerchant.get().setBirthday(merchant.getBirthday());
        currentMerchant.get().setGender(merchant.getGender());
        currentMerchant.get().setMobile(merchant.getMobile());
        merchantService.save(currentMerchant.get());
        logger.info("Result edit current merchant " +currentMerchant);
        return new ResponseEntity<Merchant>(currentMerchant.get(), HttpStatus.OK);
    }
}
