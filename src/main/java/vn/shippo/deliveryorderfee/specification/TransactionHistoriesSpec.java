package vn.shippo.deliveryorderfee.specification;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.domain.Specification;
import vn.shippo.deliveryorderfee.model.DeliveryOrder;
import vn.shippo.deliveryorderfee.model.TransactionHistories;
import vn.shippo.deliveryorderfee.repository.TransactionHistoriesRepository;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.List;

public class TransactionHistoriesSpec {

    @Autowired
    private TransactionHistoriesRepository transactionHistoriesRepository;

    public static Specification<vn.shippo.deliveryorderfee.model.TransactionHistories> findByBarcode(String  barcode) {
        return new Specification<vn.shippo.deliveryorderfee.model.TransactionHistories>() {

            public Predicate toPredicate(Root<vn.shippo.deliveryorderfee.model.TransactionHistories> root, CriteriaQuery<?> query,
                                         CriteriaBuilder builder) {
                return builder.equal(root.get("barcode"),barcode);
            }
        };
    }
    public static Specification<vn.shippo.deliveryorderfee.model.TransactionHistories> findBytransType(String transType) {
        return new Specification<vn.shippo.deliveryorderfee.model.TransactionHistories>() {

            public Predicate toPredicate(Root<vn.shippo.deliveryorderfee.model.TransactionHistories> root, CriteriaQuery<?> query,
                                         CriteriaBuilder builder) {
                return builder.equal(root.get("transType"),transType);
            }
        };
    }

}
