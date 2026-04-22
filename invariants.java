public class invariants {
    public static void main(String[] args) {
        // int age = 19;
        // assert age >= 18:"Age should be above 18";
        // System.out.println("Running..");

//?-----------------------------------------------------
        int b = 1000;
        int w = 1500;
        assert b >= w : "Insufficient balance";
        System.out.println("Transaction successful");


        
    }
}
