package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UserDeleteResponse {
    private String name;
}