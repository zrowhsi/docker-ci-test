package np.com.ishworb.hps.controller;

import np.com.ishworb.hps.model.Employee;
import np.com.ishworb.hps.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;
    @PostMapping("/employeees")
    public Employee addEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return employee;
    }
    @GetMapping("/employees")
    public ResponseEntity<List<Employee>> findAll(){
        return ResponseEntity.ok(employeeRepository.findAll());
    }
   @DeleteMapping("/employee/{id}")
    public ResponseEntity<Employee>findEmployeeId(@PathVariable(value = "id")Integer id){
       Employee employee=employeeRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Employe not Found."+id));
      employeeRepository.delete(employee);
       return ResponseEntity.ok().body(employee);
    }
}
