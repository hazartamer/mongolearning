package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import mongoogreniyorum.com.mongolearning.model.entity.OrderItem;

import java.util.List;

@Getter
@Setter
@Builder
public class OrderUpdateResponse {
    private double totalPrice;
    private List<OrderItem> orderItemList;
}
