interface ADD{
    public void add();
}
interface SUB{
    public void add(int a, int b);
}
interface MUL{
    public int add();
}
interface DIV{
    public int add(int a);
}


public class funcInterface {
    public static void main(String[] args) {

        ADD o1 = ()->{
                int a = 5, b = 5;
                System.out.println(a+b);
        };
        o1.add();


        SUB o2 = (int a, int b)->{
            System.out.println(a+b);
        };
        o2.add(2,3);


        MUL o3 = ()->{
            int a = 2, b = 3;
            return a + b;
        };
        o3.add();


        DIV o4 = (int a)->{
            return a + 6;
        };
        o4.add(22);

    }
}
