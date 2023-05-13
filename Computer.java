package class21;
/* Create a Class Computer that will have 4 subclasses as Apple, Lenovo, HP, Dell.
Define common behavior within and some fields in parent class and override some of the methods in child classes
Define some methods specific to child classes
Create objects of child classes and store them into array. Loop through each object and execute available methods.

    */
public class Computer {
   void type(){
       System.out.println("typing");
   }
   void turnOn(){
       System.out.println("on");
   }
   void turnOff(){
       System.out.println("off");
   }
   void read(){
       System.out.println("read");
   }
}
class Apple extends Computer {
    @Override
    void type() {
        System.out.println("typing slow");
    }

    void softwareDev() {
        System.out.println("software dev");
    }
}

    class Lenovo extends Computer {
        @Override
        void turnOn() {
            System.out.println("turn on");
        }
    void cyberSecurity(){
        System.out.println("cyber security");
    }
    }

    class HP extends Computer {
        @Override
        void turnOff() {
            System.out.println("turn off");
        }
        void webDev(){
            System.out.println("web dev");
        }

    }
    class Dell extends Computer {
        @Override
        void read() {
            System.out.println("gotta read");
        }
        void systemsAnalyst(){
            System.out.println("systems analyst");
        }

    }