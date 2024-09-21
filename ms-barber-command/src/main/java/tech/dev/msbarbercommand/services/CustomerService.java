package tech.dev.msbarbercommand.services;

import tech.dev.msbarbercommand.dtos.CustomerDto;

public interface CustomerService {

    CustomerDto create(CustomerDto customerDto);
}
