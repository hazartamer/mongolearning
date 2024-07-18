package mongoogreniyorum.com.mongolearning.service.impl;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.InvoiceAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.InvoiceAddResponse;
import mongoogreniyorum.com.mongolearning.model.dto.OrderAddResponse;
import mongoogreniyorum.com.mongolearning.model.entity.Invoice;
import mongoogreniyorum.com.mongolearning.repository.InvoiceRepository;
import mongoogreniyorum.com.mongolearning.service.InvoiceService;
import mongoogreniyorum.com.mongolearning.service.OrderService;
import mongoogreniyorum.com.mongolearning.service.UserService;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class InvoiceServiceImpl implements InvoiceService {
    private final InvoiceRepository invoiceRepository;
    private final UserService userService;
    private final OrderService orderService;

    @Override
    public InvoiceAddResponse save(InvoiceAddRequest request){

        Invoice invoice = Invoice.builder()
                .order(orderService.findById(request.getOrderId()))
                .user(userService.findById(request.getUserId()))
                .build();
        invoiceRepository.save(invoice);
        OrderAddResponse orderAddResponse = OrderAddResponse.builder()
                .totalPrice(invoice.getOrder().getTotalPrice())
                .orderItemList(invoice.getOrder().getOrderItems())
                .build();
        InvoiceAddResponse addResponse = InvoiceAddResponse.builder()
                .username(invoice.getUser().getName())
                .order(orderAddResponse)
                .build();

        return addResponse;
    }
}
