package mongoogreniyorum.com.mongolearning.controller;

import lombok.RequiredArgsConstructor;
import mongoogreniyorum.com.mongolearning.model.dto.InvoiceAddRequest;
import mongoogreniyorum.com.mongolearning.model.dto.InvoiceAddResponse;
import mongoogreniyorum.com.mongolearning.service.InvoiceService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/invoices")
@RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService invoiceService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public InvoiceAddResponse save(InvoiceAddRequest request){
       return invoiceService.save(request);
    }
}
