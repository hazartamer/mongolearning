package mongoogreniyorum.com.mongolearning.controller;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.UserAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.UserAddResponse;
import mongoogreniyorum.com.mongolearning.model.dto.UserDeleteResponse;
import mongoogreniyorum.com.mongolearning.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserAddResponse save(UserAddRequest request){
       return userService.save(request);
    }

    @DeleteMapping
    @ResponseStatus(HttpStatus.OK)
    public UserDeleteResponse delete(String id){
        return userService.delete(id);
    }
}
