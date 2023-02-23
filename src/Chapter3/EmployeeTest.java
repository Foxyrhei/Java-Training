package Chapter3;

/*
Create a class called Employee that includes three instance variables—
a first name (type String),
a last name (type String) and
a monthly salary (double).
Provide a constructor that initializes the three instance variables.
Provide a set and a get method for each instance
variable. If the monthly salary is not positive, do not set its value.
Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.
Create two Employee objects and display each
object’s yearly salary.
Then give each Employee a 10% raise and display each Employee’s yearly salary
again.
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Duke", "Nukem", 5000.00);
        Employee employee2 = new Employee("B.J.", "Blazkowicz", 7000.00);

        System.out.printf("%s%.2f%n", "Employee 1 Annual Salary: ", employee1.getAnnualSalary());
        System.out.printf("%s%.2f%n", "Employee 2 Annual Salary: ", employee2.getAnnualSalary());
        System.out.printf("%s%.2f%n", "Employee 1 Raised Annual Salary: ", employee1.getAnnualSalaryRaised());
        System.out.printf("%s%.2f%n", "Employee 1 Raised Annual Salary: ", employee2.getAnnualSalaryRaised());

        employee1.setMonthlySalary(-20.00);
        System.out.printf("%s%.2f%n", "Employee 1 Annual Salary: ", employee1.getAnnualSalary());
        System.out.printf("%s%.2f%n", "Employee 1 Raised Annual Salary: ", employee1.getAnnualSalaryRaised());
    }
}
