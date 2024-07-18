package mongoogreniyorum.com.mongolearning.repository;

import mongoogreniyorum.com.mongolearning.model.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, Long> {
    User findById(String id);
}
