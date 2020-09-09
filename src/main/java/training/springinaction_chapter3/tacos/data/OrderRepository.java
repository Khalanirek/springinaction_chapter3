package training.springinaction_chapter3.tacos.data;

import training.springinaction_chapter3.tacos.Order;

public interface OrderRepository {
    Order save(Order order);
}
