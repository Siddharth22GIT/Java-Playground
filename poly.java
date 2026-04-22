public class poly {
    public static void main(String[] args) {
        D2 o = new D2();
        o.chat();
    }
}

class ADD{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void add(double a, double b){
        System.out.println(a+b);
    }
    public void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}

class D1{
    public void chat(){
        System.out.println("Old version chat");
    }
}

class D2 extends D1 {
    public void chat(){
        System.out.println("New Version chat");
    } 
}