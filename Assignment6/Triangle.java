package Assignment6;

public class Triangle extends Shape {
    private double sideLength;

    //Let triangle is an equilateral triangle

    public Triangle(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double computeArea() {
        return (Math.sqrt(3) / 4.0) * Math.pow(sideLength, 2);
    }

    @Override
    public String toString() {
        return "Triangle; side length: " + sideLength;
    }
}