package vn.shippo.deliveryorderfee.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import vn.shippo.deliveryorderfee.model.TransectionHistories;

@Repository
public interface TransectionHistoriesRepository extends PagingAndSortingRepository<TransectionHistories, Integer> {
}
