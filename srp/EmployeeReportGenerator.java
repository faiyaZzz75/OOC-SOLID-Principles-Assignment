package srp;

// SRP Fix: reporting is its own responsibility, out of Employee
public class EmployeeReportGenerator {
    public String generateReport(Employee employee) {
        return "=== Employee Report ===\n" +
               "Name:       " + employee.getName() + "\n" +
               "Department: " + employee.getDepartment() + "\n" +
               "Salary:     $" + employee.getSalary();
    }
}
