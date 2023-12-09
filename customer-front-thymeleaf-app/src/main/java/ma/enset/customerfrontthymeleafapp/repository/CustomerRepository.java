package ma.enset.customerfrontthymeleafapp.repository;

import ma.enset.customerfrontthymeleafapp.entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
