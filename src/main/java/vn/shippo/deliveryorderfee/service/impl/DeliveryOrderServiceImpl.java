package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;
import vn.shippo.deliveryorderfee.repository.DeliveryOrderRepository;
import vn.shippo.deliveryorderfee.service.DeliveryOrderService;

import java.util.Optional;

@Service
public class DeliveryOrderServiceImpl implements DeliveryOrderService {

    private DeliveryOrderRepository deliveryOrderRepository;

    @Autowired
    public DeliveryOrderServiceImpl(DeliveryOrderRepository deliveryOrderRepository){
        this.deliveryOrderRepository = deliveryOrderRepository;
    }

    @Override
    public Optional<DeliveryOrder> findById(Integer id) {
        return deliveryOrderRepository.findById(id);
    }

    @Override
    public DeliveryOrder findByBarcode(String barcode ) {
        return deliveryOrderRepository.findByBarcode(barcode);
    }
}
