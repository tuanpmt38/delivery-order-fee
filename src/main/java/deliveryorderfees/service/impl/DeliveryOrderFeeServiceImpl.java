package deliveryorderfees.service.impl;

import deliveryorderfees.model.DeliveryOrderFee;
import deliveryorderfees.repository.DeliveryOrderFeeRepository;
import deliveryorderfees.service.DeliveryOrderFeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public DeliveryOrderFee save(DeliveryOrderFee deliveryOrderFee) {

        return deliveryOrderFee;
    }
}
