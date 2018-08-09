package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.TransactionHistories;
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
    public List<TransactionHistories> findAll() {
        return (List<TransactionHistories>) transectionHistoriesRepository.findAll();
    }

    @Override
    public Page<TransactionHistories> findAll(Pageable pageable) {
        return transectionHistoriesRepository.findAll(pageable);
    }
}
