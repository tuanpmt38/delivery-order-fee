package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import vn.shippo.deliveryorderfee.model.TransactionHistories;
import vn.shippo.deliveryorderfee.repository.TransactionHistoriesRepository;
import vn.shippo.deliveryorderfee.service.TransactionHistoriesService;

import java.sql.Timestamp;
import java.util.List;

@Service
public class TransactionHistoriesServiceImpl implements TransactionHistoriesService {

    private TransactionHistoriesRepository transactionHistoriesRepository;

    @Autowired
    public TransactionHistoriesServiceImpl(TransactionHistoriesRepository transactionHistoriesRepository){
        this.transactionHistoriesRepository = transactionHistoriesRepository;
    }
    @Override
    public List<TransactionHistories> findAll() {
        return (List<TransactionHistories>) transactionHistoriesRepository.findAll();
    }

    @Override
    public Page<TransactionHistories> findAll(Pageable pageable) {
        return transactionHistoriesRepository.findAll(pageable);
    }

    @Override
    public TransactionHistories findByTransTypeAndCreateAt(String transType, Timestamp createAt) {
        return transactionHistoriesRepository.findByTransTypeAndCreateAt(transType, createAt);
    }
}
