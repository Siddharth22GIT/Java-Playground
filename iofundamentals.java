import java.io.*;

import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class iofundamentals {
    public static void main(String[] args) throws Exception {
        // File f1 = new File("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        // File f2 = new File("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt");
        // f1.createNewFile();
        // f2.createNewFile();
        // System.out.println("Source and destination files created.");

        //! READING THE FILE AND WRITING IN DESTINATION FILE
        //? FILE INPUT STREAM / FILE OUTPUT STREAM
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
        // try (FileInputStream o1 = new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        //         FileOutputStream o2 = new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt")) {
        //     int data;
        //     while ((data = o1.read()) != -1) {
        //         o2.write(data);
        //     }
        // }
        // System.out.println("Byte Stream successful...");


        //! FILE READER / FILE WRITER
        // try( FileReader o1 = new FileReader("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        // FileWriter o2 = new FileWriter("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt")){
            
        //     int data;
        //     while((data = o1.read())!= -1){
        //         o2.write(data);
        //     }
        //     System.out.println("Character Stream successful..");
        // }


        //! BUFFERED INPUT / OUTPUT STREAM
        //? For Byte-stream
        // FileInputStream o1 = new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        // FileOutputStream o2 = new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt");
        // BufferedInputStream x = new BufferedInputStream(o1);
        // BufferedOutputStream y = new BufferedOutputStream(o2);
        //? OR

        // BufferedInputStream x = new BufferedInputStream(new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt"));
        // BufferedOutputStream y = new BufferedOutputStream(new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt"));
        // int data;
        // while((data = x.read()) != -1){
        //     y.write(data);
        // }
        // x.close();
        // y.close();
        //?OR

        // try(BufferedInputStream x = new BufferedInputStream(new FileInputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt"));
        // BufferedOutputStream y = new BufferedOutputStream(new FileOutputStream("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt"))){
        //   int data;
        // while((data = x.read()) != -1){
        //     y.write(data);
        // }  
        // }

        //? For Char-Stream
        // FileReader o1 = new FileReader("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt");
        // FileWriter o2 = new FileWriter("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt");
        // BufferedReader x = new BufferedReader(o1);
        // BufferedWriter y = new BufferedWriter(o2);

        // int data;
        // while((data = x.read())!= -1){
        //     y.write(data);
        // }
        // x.close();
        // y.close();

        //? OR
        // String data;
        // while((data = x.readLine())!=null){
        //     y.write(data);
        // }


        //? OR
        // BufferedReader x = new BufferedReader(new FileReader("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt"));
        // BufferedWriter y = new BufferedWriter(new FileWriter("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt"));
        // String data;
        // while((data = x.readLine())!=null){
        //     y.write(data);
        // }
        // x.close();
        // y.close();

        //? OR
        try( BufferedReader x = new BufferedReader(new FileReader("C:\\Users\\siddh\\OneDrive\\Desktop\\Source.txt"));
        BufferedWriter y = new BufferedWriter(new FileWriter("C:\\Users\\siddh\\OneDrive\\Desktop\\Destination.txt"))){
            String data;
        while((data = x.readLine())!=null){
            y.write(data);
        } 
        }
        System.out.println("Buffered stream successful...");
    }


}
