package tech.dev.msbarbercommand.services.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tech.dev.msbarbercommand.dtos.CustomerDto;
import tech.dev.msbarbercommand.entities.CustomerEntity;
import tech.dev.msbarbercommand.repositories.CustomerRepository;
import tech.dev.msbarbercommand.services.CustomerService;

@Service
@RequiredArgsConstructor
class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    public CustomerDto create(CustomerDto customerDto) {
        var customerEntity = CustomerEntity.builder()
                .name(customerDto.name())
                .email(customerDto.email())
                .phone(customerDto.phone())
                .build();

        var savedCustomer = customerRepository.save(customerEntity);

        return new CustomerDto(
                savedCustomer.getId(),
                customerDto.name(),
                customerDto.email(),
                customerDto.phone()
        );
    }
}
