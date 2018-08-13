package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;
import vn.shippo.deliveryorderfee.repository.DeliveryOrderRepository;
import vn.shippo.deliveryorderfee.service.DeliveryOrderService;

@Service
public class DeliveryOrderServiceImpl implements DeliveryOrderService {

    private DeliveryOrderRepository deliveryOrderRepository;

    @Autowired
    public DeliveryOrderServiceImpl(DeliveryOrderRepository deliveryOrderRepository){
        this.deliveryOrderRepository = deliveryOrderRepository;
    }

    @Override
    public DeliveryOrder findByBarCode(String barCode ) {
        return deliveryOrderRepository.findByBarCode(barCode);
    }
}
