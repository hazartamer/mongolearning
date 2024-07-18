package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.*;
import mongoogreniyorum.com.mongolearning.model.entity.OrderItem;

import java.util.List;

@Getter
@Setter
@Builder
public class OrderAddResponse {
    private double totalPrice;
    private List<OrderItem> orderItemList;
}
