package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.DeliveryOrderFee;
import vn.shippo.deliveryorderfee.repository.DeliveryOrderFeeRepository;
import vn.shippo.deliveryorderfee.service.DeliveryOrderFeeService;

import java.util.List;
import java.util.Optional;

@Service
public class DeliveryOrderFeeServiceImpl implements DeliveryOrderFeeService {

    private DeliveryOrderFeeRepository deliveryOrderFeeRepository;
    @Autowired
    public DeliveryOrderFeeServiceImpl(DeliveryOrderFeeRepository deliveryOrderFeeRepository){
        this.deliveryOrderFeeRepository = deliveryOrderFeeRepository;
    }

    @Override
    public List<DeliveryOrderFee> findAll() {
        return (List<DeliveryOrderFee>) deliveryOrderFeeRepository.findAll();
    }

    @Override
    public Optional<DeliveryOrderFee> findById(Integer id) {
        return deliveryOrderFeeRepository.findById(id);
    }

    @Override
    public void save(DeliveryOrderFee deliveryOrderFee) {

    }
}
