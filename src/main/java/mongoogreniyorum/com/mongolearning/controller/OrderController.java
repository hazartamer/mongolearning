package mongoogreniyorum.com.mongolearning.controller;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddResponse;
import mongoogreniyorum.com.mongolearning.model.dto.OrderUpdateRequest;
import mongoogreniyorum.com.mongolearning.model.dto.OrderUpdateResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Order;
import mongoogreniyorum.com.mongolearning.service.OrderService;
import org.springframework.data.mongodb.repository.Update;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {
    private final OrderService orderService;

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public OrderAddResponse save(@RequestBody OrderAddRequest request){
       return orderService.save(request);
    }
    @Update
    @ResponseStatus(HttpStatus.OK)
    public OrderUpdateResponse update(@RequestBody OrderUpdateRequest request){
        return orderService.update(request);
    }

}
