public class inheritance {
    public static void main(String[] args) {
        Son obj = new Son();
        obj.land();
        obj.home();
    }
}

class Father{
    public void land(){
        System.out.println("Owns a property");
    }
}

class Son extends Father{
    public void home(){
        System.out.println("Lives on that property");
    }
}