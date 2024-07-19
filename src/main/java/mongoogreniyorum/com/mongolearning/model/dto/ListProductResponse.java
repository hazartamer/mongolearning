package mongoogreniyorum.com.mongolearning.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class ListProductResponse {
    private String name;
    private double price;
}
