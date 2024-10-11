package myrectangle;

import mypoint.MyPoint;  // Importing MyPoint class to use in MyRectangle

public class MyRectangle {
    private MyPoint topLeft;      // Top-left corner of the rectangle
    private MyPoint bottomRight;  // Bottom-right corner of the rectangle

    // Constructor to initialize the rectangle with top-left and bottom-right points
    public MyRectangle(MyPoint topLeft, MyPoint bottomRight) {
        this.topLeft = topLeft;
        this.bottomRight = bottomRight;
    }

    // Getter for top-left point
    public MyPoint getTopLeft() {
        return topLeft;
    }

    // Setter for top-left point
    public void setTopLeft(MyPoint topLeft) {
        this.topLeft = topLeft;
    }

    // Getter for bottom-right point
    public MyPoint getBottomRight() {
        return bottomRight;
    }

    // Setter for bottom-right point
    public void setBottomRight(MyPoint bottomRight) {
        this.bottomRight = bottomRight;
    }

    // Method to calculate the width of the rectangle
    public int getWidth() {
        return Math.abs(bottomRight.getX() - topLeft.getX());
    }

    // Method to calculate the height of the rectangle
    public int getHeight() {
        return Math.abs(bottomRight.getY() - topLeft.getY());
    }

    // Method to calculate the area of the rectangle
    public int getArea() {
        return getWidth() * getHeight();
    }

    // Method to calculate the perimeter of the rectangle
    public int getPerimeter() {
        return 2 * (getWidth() + getHeight());
    }

    @Override
    public String toString() {
        return "MyRectangle[topLeft=" + topLeft + ", bottomRight=" + bottomRight +
                ", width=" + getWidth() + ", height=" + getHeight() + "]";
    }
}
