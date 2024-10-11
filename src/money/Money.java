package money;

public class Money {
    private int dollars;
    private int cents;

    // Constructor to initialize dollars and cents
    public Money(int dollars, int cents) {
        if (cents >= 100) {  // Normalize cents to always be less than 100
            this.dollars = dollars + cents / 100;
            this.cents = cents % 100;
        } else {
            this.dollars = dollars;
            this.cents = cents;
        }
    }

    // Getter for dollars
    public int getDollars() {
        return dollars;
    }

    // Getter for cents
    public int getCents() {
        return cents;
    }

    // Method to add money
    public Money add(Money other) {
        int totalCents = this.cents + other.cents;
        int totalDollars = this.dollars + other.dollars;
        return new Money(totalDollars, totalCents);
    }

    // Method to subtract money
    public Money subtract(Money other) {
        int totalCents = (this.dollars * 100 + this.cents) - (other.dollars * 100 + other.cents);
        int resultDollars = totalCents / 100;
        int resultCents = totalCents % 100;
        return new Money(resultDollars, resultCents);
    }

    // Method to compare two money objects
    public int compareTo(Money other) {
        if (this.dollars > other.dollars || (this.dollars == other.dollars && this.cents > other.cents)) {
            return 1;
        } else if (this.dollars == other.dollars && this.cents == other.cents) {
            return 0;
        } else {
            return -1;
        }
    }

    // Method to check equality between two money objects
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Money) {
            Money other = (Money) obj;
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }

    @Override
    public String toString() {
        return "$" + dollars + "." + String.format("%02d", cents);
    }
}
