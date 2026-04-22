import java.time.*;

public class practice {
    public static void main(String[] args) {
        // Animal a1 = new Animal();
        // a1.eat();

        // Lion l1 = new Lion();
        // l1.roar();
        // l1.eat();

        // System.out.println(a1.earthPopulation);
        // l1.printPopulation();


        // l1.eat();

        // Women w1 = new Women();
        // Men m1 = new Men();

        // System.out.println(l1 instanceof Animal);
        // System.out.println(w1 instanceof Homosepians);
        // System.out.println(m1 instanceof Homosepians);

        // OBJ o1 = new OBJ();
        // System.out.println(o1);

        //?------------------------------------------------
        //? INNER CLASS
        
        // A.B obj = new A.B();
        // obj.getNumber();

        // Animal a1 = new Animal();
        // a1.features();

        // Lion lion1 = new Lion();
        // lion1.family();

        // Actors a1 = new Actors();
        // a1.bestActors();

        // Aliens alien1 = new Aliens() {
        //     public void sound(){
        //         System.out.println("On..On..On..On");
        //     }
        // };

        // alien1.sound();

        // Marvel marvel1 = new Marvel() {
        //     public void character(){
        //         System.out.println("Iron man was a great one");
        //     }
        // };

        // marvel1.character();

        //? USE OF LAMBDA EXPRESSION
        // Aliens a1 = () -> System.out.println("On.On.On.On");
        // a1.sound();


        LocalDateTime obj1 = LocalDateTime.now();
        System.out.println(obj1);

        LocalDate obj2 = LocalDate.now();
        System.out.println(obj2);

        LocalTime obj3 = LocalTime.now();
        System.out.println(obj3);

    }
    
}

abstract class PeakyBlinders{
    void leader(){}
}


interface Aliens{
   void sound();

   static void legs(){}

   default int table(){
    return 100;
   }

}


abstract class Marvel{
    abstract void character();
}



class Actors{

    void bestActors(){
        class Male{
            void quality(){
                System.out.println("The male actors are good");
            }
        }

        class Female{
            void quality(){
                System.out.println("The female actors are also great");
            }
        }

        Male m1 = new Male();
        m1.quality();
        Female f1 = new Female();
        f1.quality();
    }
}

class Animal{
    final int earthPopulation = 200;

    void features(){
        class Dog{
            void legs(){
                System.out.println("A dog has 4 legs");
            }
        }

        Dog dog1 = new Dog();
        dog1.legs();
    }

    void eat(){
        System.out.println("Animal eats");
    }
}

class Lion extends Animal{
    void printPopulation(){
        System.out.println(super.earthPopulation);
    }
    void roar(){
        System.out.println("Lion is roaring");
    }

    void eat(){
        super.eat();
    }

    void family(){
        class Cubs{
            void size(){
                System.out.println("A lion's baby is called a cub");
            }
        }

        Cubs cub1 = new Cubs();
        cub1.size();
    }

    // void eat(){
    //     System.out.println("When the lion is hungry, HE eats");
    // }
}

class A{
    static int number = 28;

    static class B{
        void getNumber(){
            System.out.println("The static member of class A is: " + number);
        }
    }

    public static void main(String args[]){
        
    }
}

class Women implements Homosepians{
    public void look(){

    }
}
interface Homosepians{
    abstract void look();
}

class Men implements Homosepians{
     public void look(){

    }
}

final class Automobile{
    public void fuel(){
        System.out.println("Petrol/Diesel");
    }
}

class OBJ{
    String name = "Gajodhar";
    int age = 22;

    public String toString(){
        return "{\n Name: " + this.name + ",\n" + " Age: " + this.age + "\n}";
    }
}

