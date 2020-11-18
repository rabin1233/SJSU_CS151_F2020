package Assignment6;

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3.0);
        Circle circle2 = new Circle(4.0);
        Rectangle rectangle1 = new Rectangle(4.0, 5.0);
        Rectangle rectangle2 = new Rectangle(3.0, 4.0);
        Triangle triangle1 = new Triangle(4.0);
        Triangle triangle2 = new Triangle(5.0);
        Hexagon hexagon1 = new Hexagon(6.0);
        Hexagon hexagon2 = new Hexagon(5.0);

        Shapes shapes = new Shapes();
        shapes.add(circle1);
        shapes.add(circle2);
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(triangle1);
        shapes.add(triangle2);
        shapes.add(hexagon1);
        shapes.add(hexagon2);

        shapes.start();

        shapes.max();
        shapes.min();

        shapes.serializeList();
    }
}
