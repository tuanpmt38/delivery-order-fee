package vn.shippo.deliveryorderfee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
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
    public List<TransactionHistories> findByBarcode(String barcode) {
        return transactionHistoriesRepository.findByBarcode(barcode);
    }

    @Override
    public List<TransactionHistories> findByAllCreatedAtBetween(Timestamp createAt) {
        return transactionHistoriesRepository.findAllByCreatedAtBetween(createAt);
    }

    @Override
    public List<TransactionHistories> findAllByTransType(String transType) {
        return transactionHistoriesRepository.findAllByTransType(transType);
    }

    @Override
    public List<TransactionHistories> findByBarcodeAndTransType(String barcode, String transType) {
        return transactionHistoriesRepository.findByBarcodeAndTransType(barcode,transType);
    }
}
