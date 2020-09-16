
public class Whale extends Animal implements Swimmer{

    public Whale(String animalType, String animalName, int age, String gender, String environment, double pace) {
        super(animalType, animalName, age, gender, environment, pace);
    }

    @Override
    public void move() {
        System.out.println("Whales move 29 mph ");
    }

    @Override
    public void sound() {
        System.out.println("Whales make whistle sounds");
    }

    @Override
    public void eat() {
        System.out.println("Whales eat small fish");
    }

    @Override
    public void sleep() {
        System.out.println("Whales sleep in Ocean");
    }

    @Override
    public String toString() {
        return "Whale{} " + super.toString();
    }

    @Override
    public void swim() {
        System.out.println("Whales can swim");
    }
}
