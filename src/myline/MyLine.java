package myline;

import mypoint.MyPoint;  // Importing MyPoint from the mypoint package

public class MyLine {
    private MyPoint begin;  // Starting point of the line
    private MyPoint end;    // Ending point of the line

    // Constructor to initialize the line with begin and end points
    public MyLine(MyPoint begin, MyPoint end) {
        this.begin = begin;
        this.end = end;
    }

    // Getter for begin point
    public MyPoint getBegin() {
        return begin;
    }

    // Setter for begin point
    public void setBegin(MyPoint begin) {
        this.begin = begin;
    }

    // Getter for end point
    public MyPoint getEnd() {
        return end;
    }

    // Setter for end point
    public void setEnd(MyPoint end) {
        this.end = end;
    }

    // Method to calculate the length of the line using the distance formula
    public double getLength() {
        return begin.distance(end);
    }

    // Method to calculate the midpoint of the line
    public MyPoint getMidPoint() {
        int midX = (begin.getX() + end.getX()) / 2;
        int midY = (begin.getY() + end.getY()) / 2;
        return new MyPoint(midX, midY);
    }

    @Override
    public String toString() {
        return "MyLine[begin=" + begin + ", end=" + end + "]";
    }
}
