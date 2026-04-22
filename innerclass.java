class innerclass {
    public static void main(String args[]) {
        // ? Method 1
        // Outer o = new Outer();
        // o.out();
        // Outer.Inner i = o.new Inner();
        // i.in();

        // ? Method 2
        // Outer.Inner obj = new Outer().new Inner();
        // obj.in();

        // -------------------------------------------------------------

        // Outer.Inner obj = new Outer.Inner();
        // obj.in();

        // -------------------------------------------------------------

        // Outer obj = new Outer();
        // obj.out();

        // -------------------------------------------------------------

        //? For an abstract class
        // Demo obj = new Demo() {
        // public void dis1(){
        // System.out.println("I am a dev");
        // }
        // };
        // obj.dis1();

        //? For an interface
        // Demon d1 = new Demon() {
        //     public void display() {
        //         System.out.println("I am an interface: A demon offspring");
        //     }
        // };

        // d1.display();

    }
}

// ! NESTED INNER CLASS
// class Outer {
// class Inner{
// public void in(){
// System.out.println("I am a programmer");
// }
// }
// public void out(){
// System.out.println("I am a dev");
// }
// }

// ! STATIC NESTED CLASS
// class Outer {
// static class Inner{
// public void in(){
// System.out.println("I am a programmer");
// }
// }
// public void out(){
// System.out.println("I am a dev");
// }
// }

// ! LOCAL INNER CLASS
// ? Method 1
// class Outer {
// private class Inner{
// public void in(){
// System.out.println("I am a programmer");
// }
// }
// public void out(){
// System.out.println("I am a dev");
// Inner i = new Inner();
// i.in();
// }
// }

// ? Method 2
// class Outer{
// public void out(){
// class Inner {
// public void in(){
// System.out.println("I am a programmer");
// }
// }
// Inner i = new Inner();
// i.in();
// }
// }

// ! ANONYMOUS INNER CLASS
// abstract class Demo {
//     abstract void dis1();
// }

// interface Demon {
//     void display();
// }


