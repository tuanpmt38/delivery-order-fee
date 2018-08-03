package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.TransectionHistories;
import vn.shippo.deliveryorderfee.repository.TransectionHistoriesRepository;
import vn.shippo.deliveryorderfee.service.TransectionHistoriesService;

import java.util.List;

@Service
public class TransectionHistoriesServiceImpl implements TransectionHistoriesService {

    private TransectionHistoriesRepository transectionHistoriesRepository;

    @Autowired
    public TransectionHistoriesServiceImpl(TransectionHistoriesRepository transectionHistoriesRepository){
        this.transectionHistoriesRepository = transectionHistoriesRepository;
    }
    @Override
    public List<TransectionHistories> findAll() {
        return (List<TransectionHistories>) transectionHistoriesRepository.findAll();
    }

}
