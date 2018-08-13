package vn.shippo.deliveryorderfee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.service.DeliveryOrderService;


@RestController
public class DeliveryOrderController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);


    private DeliveryOrderService deliveryOrderService;

    @Autowired
    public DeliveryOrderController (DeliveryOrderService deliveryOrderService){
        this.deliveryOrderService = deliveryOrderService;
    }

    @RequestMapping(value = "/deliveryorder", method = RequestMethod.GET)
    public ResponseEntity<DeliveryOrder> getAllDeliveryOrderByBarcode(@RequestParam("barCode") String barCode ){

        logger.info("display barcode " + barCode);
        DeliveryOrder deliveryOrder = deliveryOrderService.findByBarCode(barCode);
        logger.info("delivery order " + deliveryOrder);
        return new ResponseEntity<DeliveryOrder>(deliveryOrder, HttpStatus.OK);
    }
}
