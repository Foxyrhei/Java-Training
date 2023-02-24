package Chapter3;

/*
(Target-Heart-Rate Calculator) While exercising, you can use a heart-rate monitor to see that
your heart rate stays within a safe range suggested by your trainers and doctors.
According to the American Heart Association (AHA), the
formula for calculating your maximum heart rate in beats per minute is 220 minus your age in years.
Your target heart rate is a range that’s 50–85% of your maximum heart rate.

Create a class called HeartRates.
The class attributes should include the person’s first name, last name and date of birth (consisting of separate attributes for
the month, day and year of birth).
Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods.
The class also should include a method that calculates and returns the person’s age (in years), a method that calculates and returns the person’s
maximum heart rate and a method that calculates and returns the person’s target heart rate. Write a
Java app that prompts for the person’s information, instantiates an object of class HeartRates and
prints the information from that object—including the person’s first name, last name and date of
birth—then calculates and prints the person’s age in (years), maximum heart rate and target-heart-rate
range
 */
public class HeartRates {
    private String firstName;
    private String lastName;
    private Integer day;
    private Integer month;
    private Integer year;

    //Constructor
    public HeartRates(String firstName, String lastName, Integer day, Integer month, Integer year) {
        this.firstName = firstName;
        this.lastName = lastName;
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    // Method that calculates and returns the person’s age (in years)
    public Integer getUserAge() {
        return (2023 - year);
    }

    //Method that calculates and returns the person’s maximum heart rate
    public Integer getMaximumHeartRate() {
        return (220 - getUserAge());
    }

    //Method that calculates and returns the person’s target heart rate
    //Your target heart rate is a range that’s 50–85% of your maximum heart rate.
    public void getTargetHeartRate() {
        double lowHeartRate = getMaximumHeartRate() / 2;
        double highHeartRate = getMaximumHeartRate() * 0.85;

        System.out.printf("Target heart rate range is between %.2f and %.2f bpm%n", lowHeartRate, highHeartRate);
    }

    //method displayData
    void displayData() {
        System.out.printf("User name:%s %s%n", getFirstName(), getLastName());
        System.out.printf("Date of birth is: %s/%s/%s%n", getDay(), getMonth(), getYear());
        System.out.printf("User age is: %s years%n", getUserAge());
        System.out.printf("User maximum heart rate is: %s%n", getMaximumHeartRate());
        getTargetHeartRate();
    }

    // Set method
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDay(Integer day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        } else {
            System.out.println("Invalid day");
        }
    }

    public void setMonth(Integer month) {
        if (month > 0 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month");
        }
    }

    public void setYear(Integer year) {
        if (year > 0) {
            this.year = year;
        } else {
            System.out.println("Invalid year");
        }
    }

    // Get method
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getDay() {
        return day;
    }

    public Integer getMonth() {
        return month;
    }

    public Integer getYear() {
        return year;
    }
}
