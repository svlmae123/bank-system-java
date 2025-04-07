package service;

import model.Employee;
import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    // Add a new employee
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    // Get all employees
    public List<Employee> getAllEmployees() {
        return employees;
    }

    // Find employee by ID
    public Employee getEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null; // Not found
    }

    // Find employee by username
    public Employee getEmployeeByUsername(String username) {
        for (Employee employee : employees) {
            if (employee.getUsername().equals(username)) {
                return employee;
            }
        }
        return null; // Not found
    }
}
