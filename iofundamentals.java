import java.io.*;

public class iofundamentals {
    public static void main(String[] args) throws Exception {
        // File f1 = new File("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        // File f2 = new File("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt");
        // f1.createNewFile();
        // f2.createNewFile();
        // System.out.println("Source and destination files created.");

        //! READING THE FILE AND WRITING IN DESTINATION FILE
        // FileInputStream o1 = new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        // FileOutputStream o2 = new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt");

        // int data;
        // while ((data = o1.read()) != -1) {
        //     o2.write(data);
        // }
        // o1.close();
        // o2.close();
        // System.out.println("Byte Stream successful...");


        // ? TRY WITH RESOURCES - AUTO CLOSABLE
        try (FileInputStream o1 = new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
                FileOutputStream o2 = new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt")) {
            int data;
            while ((data = o1.read()) != -1) {
                o2.write(data);
            }
        }
        System.out.println("Byte Stream successful...");

    }
}
