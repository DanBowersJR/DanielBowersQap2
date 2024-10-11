package creditcard;

import money.Money;  // Importing Money class from the money package

public class CreditCard {
    private Person owner;        // Owner of the credit card
    private Money balance;       // Current balance on the card
    private Money creditLimit;   // Credit limit of the card

    // Constructor to initialize the credit card with an owner and credit limit
    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.balance = new Money(0, 0);  // Balance starts at $0.00
    }

    // Getter for the balance (returns a new Money object to avoid exposing internals)
    public Money getBalance() {
        return new Money(balance.getDollars(), balance.getCents());
    }

    // Getter for the available credit (credit limit - balance)
    public Money getAvailableCredit() {
        return creditLimit.subtract(balance);
    }

    // Method to charge the card (adds the charge amount to the balance)
    public void charge(Money amount) {
        if (balance.add(amount).compareTo(creditLimit) > 0) {
            System.out.println("Charge exceeds credit limit.");
        } else {
            balance = balance.add(amount);
            System.out.println("Charge: " + amount);
        }
    }

    // Method to make a payment (subtracts the payment amount from the balance)
    public void payment(Money amount) {
        balance = balance.subtract(amount);
        System.out.println("Payment: " + amount);
    }

    // Getter for the owner details (calls the owner's toString method)
    public String getOwnerDetails() {
        return owner.toString();
    }
}
