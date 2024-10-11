package myline;

import mypoint.MyPoint;  // Importing MyPoint class

public class TestMyLine {
    public static void main(String[] args) {
        // Create two MyPoint instances for the line's begin and end
        MyPoint p1 = new MyPoint(0, 0);  // Point at (0, 0)
        MyPoint p2 = new MyPoint(3, 4);  // Point at (3, 4)

        // Create a MyLine instance with p1 and p2
        MyLine line = new MyLine(p1, p2);

        // Test getLength() - Expected result: 5.0 (from Pythagoras: √(3² + 4²) = 5)
        System.out.println("Length of the line: " + line.getLength());

        // Test getMidPoint() - Expected result: (1, 2) (midpoint between (0, 0) and (3, 4))
        System.out.println("Midpoint of the line: " + line.getMidPoint());

        // Test getters and setters
        MyPoint p3 = new MyPoint(5, 5);  // New point
        line.setBegin(p3);  // Change the begin point to (5, 5)
        System.out.println("Updated line begin point: " + line.getBegin());

        line.setEnd(new MyPoint(7, 8));  // Change the end point to (7, 8)
        System.out.println("Updated line end point: " + line.getEnd());

        // Final test of length with new points
        System.out.println("New length of the line: " + line.getLength());
    }
}
