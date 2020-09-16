

public class Dog extends Animal implements Domesticated{
    public Dog(String animalType, String animalName, int age, String gender, String environment, double pace) {
        super(animalType, animalName, age, gender, environment, pace);
    }

    @Override
    public void move() {
        System.out.println("Dogs move 20 mph");
    }

    @Override
    public void sound() {
        System.out.println("Dogs bark with vow sound");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meat and bones");
    }

    @Override
    public void sleep() {
        System.out.println("Dogs sleeps in house");
    }

    @Override
    public String toString() {
        return "Dog{} " + super.toString();
    }

    @Override
    public void greetHuman() {
        System.out.println("Dogs greet humans");
    }

    @Override
    public void walk() {
        System.out.println("Dogs can walk");
    }
    public void bark(){
        System.out.println("Dogs bark");
    }
}
