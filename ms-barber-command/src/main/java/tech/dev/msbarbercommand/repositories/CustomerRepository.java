package tech.dev.msbarbercommand.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tech.dev.msbarbercommand.entities.CustomerEntity;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Long> {
}
