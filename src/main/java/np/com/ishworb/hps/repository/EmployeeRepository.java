package np.com.ishworb.hps.repository;

import np.com.ishworb.hps.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
