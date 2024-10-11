package creditcard;

import money.Money;  // Importing Money class

public class TestCreditCard {
    public static void main(String[] args) {
        // Create a Person object for the owner of the credit card
        Person owner = new Person("John", "Doe");

        // Create a Money object for the credit limit (e.g., $1000.00)
        Money creditLimit = new Money(1000, 0);

        // Create a CreditCard object with the owner and credit limit
        CreditCard card = new CreditCard(owner, creditLimit);

        // Print initial credit card details
        System.out.println("Owner: " + card.getOwnerDetails());
        System.out.println("Initial Balance: " + card.getBalance());
        System.out.println("Initial Available Credit: " + card.getAvailableCredit());

        // Test charging the card
        Money chargeAmount1 = new Money(200, 0);  // $200.00
        System.out.println("\nAttempt to charge $200.00:");
        card.charge(chargeAmount1);
        System.out.println("Balance after charge: " + card.getBalance());
        System.out.println("Available credit after charge: " + card.getAvailableCredit());

        // Test another charge
        Money chargeAmount2 = new Money(850, 0);  // $850.00 (exceeds the limit)
        System.out.println("\nAttempt to charge $850.00:");
        card.charge(chargeAmount2);
        System.out.println("Balance after second charge: " + card.getBalance());
        System.out.println("Available credit after second charge: " + card.getAvailableCredit());

        // Test making a payment
        Money paymentAmount = new Money(100, 0);  // $100.00 payment
        System.out.println("\nMaking a payment of $100.00:");
        card.payment(paymentAmount);
        System.out.println("Balance after payment: " + card.getBalance());
        System.out.println("Available credit after payment: " + card.getAvailableCredit());
    }
}
