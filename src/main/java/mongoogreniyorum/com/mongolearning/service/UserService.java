package mongoogreniyorum.com.mongolearning.service;

import mongoogreniyorum.com.mongolearning.model.dto.UserAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.UserAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.User;

public interface UserService {
    User findById(String id);

    UserAddResponse save(UserAddRequest request);
}
