
public abstract class Animal {
    private String animalType;
    private String animalName;
    private int age;
    private String gender;
    private String environment;
    private double pace;

    public Animal(String animalType, String animalName, int age, String gender, String environment, double pace) {
        this.animalType = animalType;
        this.animalName = animalName;
        this.age = age;
        this.gender = gender;
        this.environment = environment;
        this.pace = pace;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "animalType='" + animalType + '\'' +
                ", animalName='" + animalName + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", environment='" + environment + '\'' +
                ", pace=" + pace +
                '}';
    }
    public abstract void move();
    public abstract void sound();
    public abstract void eat();
    public abstract void sleep();


}
