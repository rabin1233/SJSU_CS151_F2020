package Assignment6;

public class Hexagon extends Shape{
    private double sideLength;

    public Hexagon(double sideLength) {
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
        return (3.0 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2.0;
    }

    @Override
    public String toString() {
        return "Hexagon; side length: " + sideLength;
    }
}
