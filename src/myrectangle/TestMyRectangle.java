package myrectangle;

import mypoint.MyPoint;  // Importing MyPoint class to use with MyRectangle

public class TestMyRectangle {
    public static void main(String[] args) {
        // Create two MyPoint instances for the rectangle's corners
        MyPoint topLeft = new MyPoint(1, 5);  // Top-left corner at (1, 5)
        MyPoint bottomRight = new MyPoint(4, 1);  // Bottom-right corner at (4, 1)

        // Create a MyRectangle instance with top-left and bottom-right points
        MyRectangle rectangle = new MyRectangle(topLeft, bottomRight);

        // Test getWidth(), getHeight(), getArea(), getPerimeter()
        System.out.println("Width of the rectangle: " + rectangle.getWidth());          // Expected: 3
        System.out.println("Height of the rectangle: " + rectangle.getHeight());        // Expected: 4
        System.out.println("Area of the rectangle: " + rectangle.getArea());            // Expected: 12
        System.out.println("Perimeter of the rectangle: " + rectangle.getPerimeter());  // Expected: 14

        // Test toString() method
        System.out.println("Rectangle details: " + rectangle);
    }
}
