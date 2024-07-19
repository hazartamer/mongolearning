package mongoogreniyorum.com.mongolearning.service.impl;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.UserAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.UserAddResponse;
import mongoogreniyorum.com.mongolearning.model.dto.UserDeleteResponse;
import mongoogreniyorum.com.mongolearning.model.entity.User;
import mongoogreniyorum.com.mongolearning.repository.UserRepository;
import mongoogreniyorum.com.mongolearning.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User findById(String id) {
        return userRepository.findById(id);
    }

    @Override
    public UserAddResponse save(UserAddRequest request) {

        User user = User.builder()
                .email(request.getEmail())
                .name(request.getName())
                .build();
        userRepository.save(user);
        UserAddResponse userAddResponse = UserAddResponse.builder()
                .name(user.getName())
                .build();
        return userAddResponse;
    }

    @Override
    public UserDeleteResponse delete(String id) {
        User user = userRepository.findById(id);
        userRepository.delete(user);
        UserDeleteResponse response = UserDeleteResponse.builder()
                .name(user.getName())
                .build();
        return response;
    }

}
