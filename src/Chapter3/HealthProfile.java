package Chapter3;

/*
 In this exercise, you’ll design a “starter” HealthProfile class for a person.
 The class attributes should include the person’s
 first name,
 last name,
 gender,
 date of birth (consisting of separate attributes for the month, day and year of birth),
 height (in inches) and
 weight (in pounds).
Your class should have a constructor that receives this data.
For each attribute, provide set and get methods.
The class also should include methods that calculate and return the user’s
age in years,
maximum heart rate and
target-heart-rate range (see Exercise 3.16), and
body mass index (BMI; see Exercise 2.33).
Write a Java app that prompts for the person’s information, instantiates an object of class HealthProfile for that person
and prints the information from that object—including the person’s first name, last name, gender, date of birth, height and weight—then calculates and prints the
person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display the BMI values chart from Exercise 2.33.

 */
public class HealthProfile {
    private String firstName;
    private String lastName;
    private String gender;
    private Integer day;
    private Integer month;
    private Integer year;
    private double height;
    private double weight;

    // Constructor
    public HealthProfile(String firstName, String lastName, String gender, Integer day, Integer month, Integer year, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        setDay(day);
        setMonth(month);
        setYear(year);
        setHeight(height);
        setWeight(weight);
    }

    // Method that calculates and returns the person’s age (in years)
    public Integer getUserAge() {
        return (2023 - year);
    }

    //Method that performs BMI calculation
    public void getBmi() {

        double bmi = getWeight() / (getHeight() * getHeight()); // BMI calculation

        System.out.printf("BMI index is %.2f%n", bmi); // %.2f%n - format for float, 2 digits after coma and a new line

        if (bmi < 18.5) {
            System.out.println("Underweight");
        }

        if (18.5 <= bmi && bmi <= 24.9) {
            System.out.println("Normal");
        }
        if (25 <= bmi && bmi <= 29) {
            System.out.println("Overweight");
        }
        if (bmi > 30) {
            System.out.println("Obese");
        }
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
    //method displayData: first name, last name, gender, date of birth, height and weight—then calculates and prints the
    //person’s age in years, BMI, maximum heart rate and target-heart-rate range. It should also display the BMI values chart

    void displayData() {
        System.out.printf("User name: %s %s%n", getFirstName(), getLastName());
        System.out.printf("User gender: %s%n", getGender());
        System.out.printf("Date of birth is: %s/%s/%s%n", getDay(), getMonth(), getYear());
        System.out.printf("Users height: %s%n", getHeight());
        System.out.printf("Users weight: %s%n", getWeight());
        System.out.printf("User age is: %s years%n", getUserAge());
        getBmi();
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

    public void setGender(String gender) {
        this.gender = gender;
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

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
        }
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Invalid weight");
        }
    }

    // Get method
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
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

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
