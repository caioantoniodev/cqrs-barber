package tech.dev.msbarbercommand.controllers;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tech.dev.msbarbercommand.dtos.CustomerDto;
import tech.dev.msbarbercommand.services.CustomerService;

@RestController
@RequestMapping("/customers")
@RequiredArgsConstructor
public class CustomerController {

    private final CustomerService customerService;

    @PostMapping
    ResponseEntity<CustomerDto> create(@RequestBody @Valid CustomerDto customerDto) {
        return ResponseEntity.ok(customerService.create(customerDto));
    }
}
