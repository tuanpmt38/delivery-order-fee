package vn.shippo.deliveryorderfee.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import vn.shippo.deliveryorderfee.model.TransactionHistories;

import java.sql.Timestamp;
import java.util.List;

public interface TransactionHistoriesService {

    List<TransactionHistories> findAll();

    Page<TransactionHistories> findAll(Pageable pageable);

    TransactionHistories findByTransTypeAndCreateAt(String transType, Timestamp createAt);


}
