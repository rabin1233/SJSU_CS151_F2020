package Assignment6;

public class Circle extends Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    @Override
    public double computeArea() {
        return Math.PI * (Math.pow(radius, 2));
    }

    @Override
    public String toString() {
        return "Circle; radius: " + radius;
    }
}
