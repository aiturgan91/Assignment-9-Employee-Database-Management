package org.example;

import java.time.LocalDate;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EmployeeData employeeData = new EmployeeData();

        try {
            // Create a new employee and add to database
            Employee newEmployee = new Employee("Dzhumabekova Aiturgan", "Management", 950000, LocalDate.of(2023, 1, 15));
            employeeData.createEmployee(newEmployee);

            // Retrieve an employee by ID
            Employee employee = employeeData.getEmployeeById(1);
            System.out.println("Retrieved Employee: " + employee);

            // Retrieve and print all employees
            List<Employee> allEmployees = employeeData.getAllEmployees();
            System.out.println("All Employees:");
            for (Employee emp : allEmployees) {
                System.out.println(emp);
            }

            // Update an employee's details
            if (employee != null) {
                employee.setPosition("Senior Developer");
                employee.setSalary(850000); // Fixed salary typo
                employeeData.updateEmployee(employee);
            }

            // Delete an employee by ID
            employeeData.deleteEmployee(1);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
