package training.springinaction_chapter3.tacos.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import training.springinaction_chapter3.tacos.Order;

@Repository
public interface OrderRepository extends CrudRepository<Order, Long> {

}
