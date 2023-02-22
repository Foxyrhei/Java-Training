package Chapter3;
/*
Create a class called Invoice that a hardware store might use to represent an invoice for an item sold at the store.
An Invoice should include four pieces of information as instance variables—
a part number (type String),
a part description (type String),
a quantity of the item being purchased (type int) and
a price per item (double).

Your class should have a constructor that initializes the four instance variables.
Provide a set and a get method for each instance variable.
In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
multiplies the quantity by the price per item), then returns the amount as a double value. If the
quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
 */

public class Invoice {
    private String partNumber; // instance variable
    private String description; // instance variable
    private int quantity; // instance variable
    private double price; // instance variable


    // Invoice constructor that receives four parameters
    public Invoice(String partNumber, String description, int quantity, double price) {
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }


    public double getInvoiceAmount() {

        return quantity * price;

    }


    // Set method for each variable
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        if (quantity <= 0) {
            this.quantity = 0;
        }
    }

    public void setPrice(double price) {
        this.price = price;
        if (price <= 0) {
            this.price = 0;
        }
    }

    // Get method for each variable
    public String getPartNumber() {
        return partNumber;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
} //End Invoice class
