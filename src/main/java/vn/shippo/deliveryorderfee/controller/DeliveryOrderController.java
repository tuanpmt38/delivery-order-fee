package vn.shippo.deliveryorderfee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.service.DeliveryOrderService;

import java.util.HashMap;
import java.util.Map;


@RestController
public class DeliveryOrderController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);

    private DeliveryOrderService deliveryOrderService;

    @Autowired
    public DeliveryOrderController (DeliveryOrderService deliveryOrderService){
        this.deliveryOrderService = deliveryOrderService;
    }

    @RequestMapping(value = "/deliveryorder", method = RequestMethod.GET)
    public ResponseEntity<Map<String, DeliveryOrder>> getAllDeliveryOrderByBarcode(@RequestParam("barcode") String barcode){

        logger.info("display barcode " + barcode);
        DeliveryOrder deliveryOrder = deliveryOrderService.findByBarcode(barcode);
        logger.info("delivery order " + deliveryOrder);
        Map<String, DeliveryOrder> map=new HashMap<>();
        map.put("result",deliveryOrder);

        return  ResponseEntity.ok(map);
    }
}
