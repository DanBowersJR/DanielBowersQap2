package creditcard;

public class Person {
    private String firstName;
    private String lastName;

    // Constructor to initialize first name and last name
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getter for first name
    public String getFirstName() {
        return firstName;
    }

    // Getter for last name
    public String getLastName() {
        return lastName;
    }

    // toString method to return the full name of the person
    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}
