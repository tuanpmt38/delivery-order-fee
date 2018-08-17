package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.TransactionHistories;

import java.sql.Timestamp;
import java.util.List;

@Repository
public interface TransactionHistoriesRepository extends PagingAndSortingRepository<TransactionHistories, Integer>,
        JpaSpecificationExecutor<TransactionHistories> {

    @Query(value = "select * from transaction_histories t where t.barcode = ?1", nativeQuery = true)
    List<TransactionHistories> findByBarcode(String barcode);

    @Query(value = "select * from transaction_histories t where t.create_at between ?1 and ?2",nativeQuery = true)
    List<TransactionHistories> findAllByCreatedAtBetween(Timestamp createAt);

    @Query(value = "select * from transaction_histories t where t.transe_type =?1 ",nativeQuery = true)
    List<TransactionHistories> findAllByTransType(String transType);

    @Query(value = "select * from transaction_histories t where t.barcode = ?1 and t.trans_type = ?2", nativeQuery = true)
    List<TransactionHistories> findByBarcodeAndTransType(String barcode, String transType);


}
