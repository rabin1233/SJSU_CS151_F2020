

public class Racoon extends Animal implements Scratcher{
    public Racoon(String animalType, String animalName,int age, String gender, String environment, double pace) {
        super(animalType, animalName, age, gender, environment, pace);
    }

    @Override
    public void move() {
        System.out.println("Racoons move 12 mph");
    }

    @Override
    public void sound() {
        System.out.println("Racoons make chittering sound");
    }

    @Override
    public void eat() {
        System.out.println("Racoons eats plants and smaller animals");
    }

    @Override
    public void sleep() {
        System.out.println("Racoons lives in sheds");
    }

    @Override
    public String toString() {
        return "Racoon{} " + super.toString();
    }

    @Override
    public void scratch() {
        System.out.println("Racoon  scratches");
    }
}
