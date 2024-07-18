package mongoogreniyorum.com.mongolearning.service.impl;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Order;
import mongoogreniyorum.com.mongolearning.model.entity.OrderItem;
import mongoogreniyorum.com.mongolearning.model.entity.Product;
import mongoogreniyorum.com.mongolearning.model.entity.User;
import mongoogreniyorum.com.mongolearning.repository.OrderRepository;
import mongoogreniyorum.com.mongolearning.repository.ProductRepository;
import mongoogreniyorum.com.mongolearning.service.OrderService;
import mongoogreniyorum.com.mongolearning.service.ProductService;
import mongoogreniyorum.com.mongolearning.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {
    private final OrderRepository orderRepository;
    private final ProductService productService;
    private final UserService userService;

    @Override
    public Order findById(String id) {
        return orderRepository.findById(id).orElseThrow();
    }

    @Override
    public OrderAddResponse save(OrderAddRequest request){
        Product product = productService.findById(request.getProductId());

        User user = userService.findById(request.getUserId());

        List<OrderItem> orderItems = new ArrayList<>();

        OrderItem orderItem = new OrderItem();
        orderItem.setProduct(product);
        orderItem.setQuantity(request.getQuantity());
        orderItems.add(orderItem);

        Order order = new Order();
        order.setUser(user);
        order.setOrderItems(orderItems);
        order.setTotalPrice(product.getPrice()* orderItem.getQuantity());

        orderRepository.save(order);

        OrderAddResponse orderAddResponse = OrderAddResponse.builder()
                .totalPrice(order.getTotalPrice())
                .orderItemList(orderItems)
                .build();

        return orderAddResponse;
    }
}