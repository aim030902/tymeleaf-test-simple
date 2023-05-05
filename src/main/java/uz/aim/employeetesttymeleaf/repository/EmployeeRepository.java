package uz.aim.employeetesttymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.aim.employeetesttymeleaf.domains.Employee;

/**
 * @author : Abbosbek Murodov
 * @since : 05/05/23 / 23:31
 * Project : employee-test-tymeleaf / IntelliJ IDEA
 */

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
