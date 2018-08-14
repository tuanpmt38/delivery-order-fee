package vn.shippo.deliveryorderfee.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.service.DeliveryOrderService;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


@RestController
public class DeliveryOrderController {

    private static final Logger logger = LogManager.getLogger(DeliveryOrderFee.class);

    private DeliveryOrderService deliveryOrderService;

    @Autowired
    public DeliveryOrderController (DeliveryOrderService deliveryOrderService){
        this.deliveryOrderService = deliveryOrderService;
    }

    @RequestMapping(value = "/deliveryorder/tl/{barcode}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, DeliveryOrder>> getDeliveryOrderByBarcode(@PathVariable("barcode") String barcode){

        logger.info("Fetching and result with " + barcode);
        DeliveryOrder deliveryOrder = deliveryOrderService.findByBarcode(barcode);
        logger.info("delivery order " + deliveryOrder);
        Map<String, DeliveryOrder> map=new HashMap<>();
        map.put("result",deliveryOrder);

        return  ResponseEntity.ok(map);
    }

    @RequestMapping(value = "/deliveryorder/{id}", method = RequestMethod.GET)
    public ResponseEntity<Map<String, Optional<DeliveryOrder>>> getDeliverOrderById(@PathVariable("id") Integer id){

        logger.info("Fetching and result with " +id);
        Optional<DeliveryOrder> deliveryOrder = deliveryOrderService.findById(id);
        if(!deliveryOrder.isPresent()){
            return new ResponseEntity(deliveryOrder.get(),HttpStatus.NO_CONTENT);
        }
        Map<String, Optional<DeliveryOrder>> map = new HashMap<>();
        map.put("result", deliveryOrder);
        return ResponseEntity.ok(map);
    }
}
