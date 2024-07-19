package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderUpdateRequest {
    private String orderId;
    private String productId;
    private int quantity;
    private String userId;
}
