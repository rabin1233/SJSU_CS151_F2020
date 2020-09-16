
public class Cat extends Animal implements Domesticated,Scratcher{
    public Cat(String animalType, String animalName, int age, String gender, String environment, double pace) {
        super(animalType, animalName, age, gender, environment, pace);
    }

    @Override
    public void move() {
        System.out.println("Cats move 30mph");
    }

    @Override
    public void sound() {
        System.out.println("Cats do meow");
    }

    @Override
    public void eat() {
        System.out.println("Cats eat mice");
    }

    @Override
    public void sleep() {
        System.out.println("Cats sleep in house");
    }

    @Override
    public String toString() {
        return "Cat{} " + super.toString();
    }

    @Override
    public void greetHuman() {
        System.out.println("Cats greet human");
    }

    @Override
    public void walk() {
        System.out.println("Cats can walk");
    }

    @Override
    public void scratch() {
        System.out.println("Cats Scratch");
    }
}
