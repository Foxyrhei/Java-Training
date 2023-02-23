package Chapter3;

/*
(Date Class) Create a class called Date that includes three instance variables
a month (type int),
a day (type int) and
a year (type int).
Provide a constructor that initializes the three instance
variables and assumes that the values provided are correct.
Provide a set and a get method for each instance variable.
Provide a method displayDate that displays the month, day and year separated by forward slashes (/).
Write a test app named DateTest that demonstrates class Date’s capabilities.
 */
public class Date {
    //Instance variables
    private Integer day;
    private Integer month;
    private Integer year;

    //Constructor
    public Date(Integer day, Integer month, Integer year) {
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    //method displayDate
    void displayDate() {
        System.out.printf("%s/%s/%s", getDay(), getMonth(), getYear());
    }

    // Set method
    public void setDay(Integer day) {
        if (day > 0 && day <= 31) {
            this.day = day;
        }
        else {
            System.out.println("Invalid day");
        }
    }

    public void setMonth(Integer month) {
        if (month > 0 && month <= 12) {
                this.month = month;
        }
        else {
            System.out.println("Invalid month");
        }
    }

    public void setYear(Integer year) {
        if (year > 0) {
            this.year = year;
        }
        else {
            System.out.println("Invalid year");
        }
    }

    // Get method
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