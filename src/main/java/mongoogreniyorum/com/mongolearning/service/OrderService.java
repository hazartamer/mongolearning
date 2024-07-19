package mongoogreniyorum.com.mongolearning.service;

import mongoogreniyorum.com.mongolearning.model.dto.OrderAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddResponse;
import mongoogreniyorum.com.mongolearning.model.dto.OrderUpdateRequest;
import mongoogreniyorum.com.mongolearning.model.dto.OrderUpdateResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Order;
import org.springframework.web.bind.annotation.RequestBody;

public interface OrderService {

    Order findById(String id);

    OrderAddResponse save(OrderAddRequest request);

    OrderUpdateResponse update(@RequestBody OrderUpdateRequest request);
}
