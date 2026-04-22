public class absinterface {
    public static void main(String[] args) {
       
        // Father.land();

        Son s = new Son();
        s.profession();


    }
}

interface Father{

    //? You cannot create a body
    // public void transport(){
    //     System.out.println("2 Tractors");
    // }

   
    // public static void land(){
    //     System.out.println("100 acres");
    // }

    default void profession(){
        System.out.println("Farmer");
    }
}

class Son implements Father{
    
}
