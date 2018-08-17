package vn.shippo.deliveryorderfee.service;

import vn.shippo.deliveryorderfee.model.TransactionHistories;

import java.sql.Timestamp;
import java.util.List;

public interface TransactionHistoriesService {

    List<TransactionHistories> findAll();

    List<TransactionHistories> findByBarcode(String barcode);

    List<TransactionHistories> findByAllCreatedAtBetween(Timestamp createAt);

    List<TransactionHistories> findAllByTransType(String transType);

    List<TransactionHistories> findByBarcodeAndTransType(String barcode, String transType);


}
