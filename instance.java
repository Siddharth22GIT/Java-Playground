public class instance {
    public static void main(String[] args) {
        instance o = new instance();
        System.out.println(o instanceof Father);
        Son s = new Son();
        System.out.println(s instanceof Father);
    }
}

interface Father{

}

class Son implements Father{

}