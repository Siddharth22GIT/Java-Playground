class oops{
    public static void main(String[] args) {
        S o1 = new S();
        System.out.println(o1.pen);
 
        Demo o = new Demo();
        o.dis1();
        o.dis2();
    }
}
class S {
    int pen = 10;
    int pencil = 5;
}

class Demo{
    int a = 10;
    String name;
    int b = 20;

    Demo(){
        System.out.println("Constructor called...");
    }

    Demo(int x, int y){
        a = x;
        b = y;
    }

    Demo(Demo s){
        this.name = s.name;
    }

    public void dis1(){
        System.out.println("Dis1");
    }
    public void dis2(){
        System.out.println("Dis2");
    }
}