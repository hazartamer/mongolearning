package mongoogreniyorum.com.mongolearning.repository;

import mongoogreniyorum.com.mongolearning.model.entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {

}
