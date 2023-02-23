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
public class Employee {
    // Instance variables
    private String firstName;
    private String lastName;
    private Double monthlySalary;

    //constructor for three instance variables
    public Employee(String firstName, String lastName, Double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    //Annual salary calculation
    public Double getAnnualSalary() {
        return 12 * monthlySalary;
    }

    //Raised Annual Salary calculation
    public Double getAnnualSalaryRaised() {
        return 12 * monthlySalary * 1.1;
    }

    //Set method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMonthlySalary(Double monthlySalary) {
        this.monthlySalary = monthlySalary;
        if (monthlySalary <= 0) {
            this.monthlySalary = 0.0;
        }

    }

    //Get method
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getMonthlySalary() {
        return monthlySalary;
    }
}
