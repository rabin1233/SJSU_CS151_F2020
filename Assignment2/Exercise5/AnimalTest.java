
public class AnimalTest {
    public static void main(String[] args) {
        Animal catObj = new Cat("Animal", "Cats", 15, "male", "home",30 );
        Animal dogObj = new Dog("Animal", "Dog", 15, "female", "home", 20);
        Animal racoonObj = new Racoon("Animal", "Racoon", 20, "male", "forest",12);
        Animal whaleObj = new Whale("Animal", "Whale", 150, "male", "Ocean", 29);

        System.out.println("Qualities of Cats are: ");
        catObj.move(); catObj.eat(); catObj.sound(); catObj.sleep(); ((Cat)catObj).greetHuman();((Cat) catObj).walk();((Cat) catObj).scratch();
        System.out.println("");
        System.out.println("Qualities of Dogs are: ");
        dogObj.sleep();dogObj.sound();dogObj.move();dogObj.eat();((Dog) dogObj).greetHuman();((Dog) dogObj).walk(); ((Dog) dogObj).bark();
        System.out.println("");
        System.out.println("Qualities of Racoons are: ");
        racoonObj.eat();racoonObj.move();racoonObj.sleep();racoonObj.sound(); ((Racoon) racoonObj).scratch();
        System.out.println("");
        System.out.println("Qualities of Whales are: ");
        whaleObj.eat();whaleObj.sound();whaleObj.sleep();whaleObj.move(); ((Whale) whaleObj).swim();
    }

}
