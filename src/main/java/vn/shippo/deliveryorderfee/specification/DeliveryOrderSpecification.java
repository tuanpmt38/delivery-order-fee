package vn.shippo.deliveryorderfee.specification;


import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.function.Predicate;

public interface DeliveryOrderSpecification <Deliveryorder>{

    Predicate toPredicate(Root<Deliveryorder> root, CriteriaQuery<?> query,
                          CriteriaBuilder builder);
}
