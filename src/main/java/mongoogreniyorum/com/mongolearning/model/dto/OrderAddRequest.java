package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.*;

@Getter
@Setter
@Builder
public class OrderAddRequest {
    private String productId;
    private int quantity;
    private String userId;

}
