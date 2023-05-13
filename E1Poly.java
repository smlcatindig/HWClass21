package class21;

public class E1Poly {
    public static void main(String[] args) {
        Animal[] animals={new Dog("Pepper", "Black", "Maltese"),
                new Cat("Kitty", "White", "Persian"),
                new Horse("Jolly", "Brown", "Mustang")};
        for(Animal animal: animals){
            animal.speak();
            animal.eat();
            animal.sleep();
        }
        Animal dogStoredInAnimal=new Dog("Pepper", "Black", "Maltese");
        // we must type cast the dogStoredInAnimal back to a dog to call the run method
        // as this run method only exists in the dog class
        Dog d=(Dog) dogStoredInAnimal;
        d.run();

        // direct way without using a variable
        ((Dog)dogStoredInAnimal).run();
    }
}
