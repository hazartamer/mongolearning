package mongoogreniyorum.com.mongolearning.service;

import mongoogreniyorum.com.mongolearning.model.dto.OrderAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Order;

public interface OrderService {

    Order findById(String id);

    OrderAddResponse save(OrderAddRequest request);
}
