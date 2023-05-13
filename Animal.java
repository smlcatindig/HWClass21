package class21;

public class Animal {
    String name;
    String color;
    String breed;

    Animal(String name, String color, String breed) {
        this.name = name;
        this.color = color;
        this.breed = breed;
    }

    void printInfo() {
        System.out.println(name + " " + color + " " + breed);
    }
    void speak(){
        System.out.println("animals speak");
}
    void sleep(){
        System.out.println("animals sleep");
    }
    void run(){
        System.out.println("run");
    }
    void eat(){
        System.out.println("animals eat");
    }
}
    class Cat extends Animal {
    Cat(String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("meow");
    }
    @Override
    void eat(){
        System.out.println("eats tuna");
    }
    @Override
    void sleep(){
        System.out.println("sleeps 10-12 hrs");
    }
    }
    class Dog extends Animal {
        public Dog(String name, String color, String breed) {
            super(name, color, breed);

        }
        @Override
        void speak(){
            System.out.println("arf");
        }
        @Override
        void sleep(){
            System.out.println("sleeps 8 hrs");
        }

        @Override
        void eat() {
            System.out.println("chew bones");
        }
    }
    class Horse extends Animal{
    Horse (String name, String color, String breed){
        super(name, color, breed);
    }
    @Override
    void speak(){
        System.out.println("woo");
    }
    @Override
    void sleep(){
        System.out.println("sleeps 2 hrs");
    }
     @Override
        void eat(){
        System.out.println("likes to eat grass");
    }
    }
    class AnimalTester {
        public static void main(String[] args) {
            Dog dog = new Dog("Shaggy", "Black", "German");
            dog.printInfo();

            Animal dog1 = new Dog("Shaggy", "Black", "German"); // parent class variables can store the objects of child class
            dog.printInfo();

            Animal[] animals = {new Dog("Pepper", "Black", "Maltese"), new Dog("Charlie", "White", "Shihtzu")};
            for (Animal animal : animals) {
                animal.printInfo();
            }
            // type casting (widening)
            double d=10;
            Animal dog2= new Dog("Pepper", "Black", "Maltese");

            int g=(int) 10.5;
           // Dog dog3= new Animal("Pepper", "Black", "Maltese"); not allowed
        }
    }
