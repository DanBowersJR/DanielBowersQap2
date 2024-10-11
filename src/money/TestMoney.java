package money;

public class TestMoney {
    public static void main(String[] args) {
        // Create two Money instances
        Money money1 = new Money(5, 75);  // $5.75
        Money money2 = new Money(3, 50);  // $3.50

        // Test toString() method
        System.out.println("Money 1: " + money1);  // Expected: $5.75
        System.out.println("Money 2: " + money2);  // Expected: $3.50

        // Test add() method
        Money money3 = money1.add(money2);
        System.out.println("Money 1 + Money 2: " + money3);  // Expected: $9.25

        // Test subtract() method
        Money money4 = money1.subtract(money2);
        System.out.println("Money 1 - Money 2: " + money4);  // Expected: $2.25

        // Test compareTo() method
        System.out.println("Comparison (Money 1 vs Money 2): " + money1.compareTo(money2));  // Expected: 1 (greater than)
        System.out.println("Comparison (Money 1 vs Money 1): " + money1.compareTo(money1));  // Expected: 0 (equal)

        // Test equals() method
        Money money5 = new Money(5, 75);
        System.out.println("Money 1 equals Money 5: " + money1.equals(money5));  // Expected: true
        System.out.println("Money 1 equals Money 2: " + money1.equals(money2));  // Expected: false
    }
}
