public class overridestring {
    String name;
    int age;
    overridestring(String name, int age){
        this.name = name;
        this.age = age;
    }
    public static void main(String args[]){
        overridestring o = new overridestring("Momo", 20);
        overridestring o2 = new overridestring("Meetu", 20);
        System.out.println(o);
        System.out.println(o.equals(o2));
    }

    public String tosString(){
        return name+" "+age;
    }

    // public boolean equals(Object o){
    //     if(this == 0){
    //         return flase;
    //     }else{
    //         return true;
    //     }
    // }
}
