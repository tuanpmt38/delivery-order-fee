package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.TransactionHistories;

@Repository
public interface TransectionHistoriesRepository extends PagingAndSortingRepository<TransactionHistories, Integer> {

    Iterable<TransactionHistories> findByTransAmount(Integer id);

}
