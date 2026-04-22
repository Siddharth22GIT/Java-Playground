class gettersetter {
    public static void main(String[] args) {
        Appform o = new Appform();
        o.setter("Sohail", 22);
        o.getter();
    }
}

class Appform{
    private String name;
    private int age;
    public void setter(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void getter(){
        System.out.println(name);
        System.out.println(age);
    }
}
