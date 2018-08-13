package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.TransactionHistories;

import java.sql.Timestamp;

@Repository
public interface TransactionHistoriesRepository extends PagingAndSortingRepository<TransactionHistories, Integer> {

    Iterable<TransactionHistories> findByTransAmount(Integer id);

    @Query(value = "select * from transaction_histories t where t.transType = ?1 and t.createAt = ?2",nativeQuery = true)
    TransactionHistories findByTransTypeAndCreateAt(String transType, Timestamp createAt);
}
