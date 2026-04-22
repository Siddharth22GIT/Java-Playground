public class objectclass {
    public static void main(String[] args) {
        objectclass o = new objectclass();
        System.out.println(o);
        System.out.println(o.toString());
        System.out.println(o.getClass());
        System.out.println(o.hashCode());
        System.out.println(o.getClass().getName());
        objectclass o2 = new objectclass();
        System.out.println(o.equals(o2));
    }

    public String toString(){
        return "Puku";
    }

    public int hashCode(){
        return 111;
    }

    public boolean equals(Object o){
        return true;
    }
}

class Main extends Object{

}