package FileHandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class PrintWritterClass {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("C:\\Users\\Jitendra Kumar\\OneDrive\\Documents\\ptintWr\\printwriter.txt");
       // pw.print('c');
        pw.print(100);
        pw.println(200.22);
        pw.println(" Jitendra kumar");
        //pw.println(true);
        pw.println("Hello");
        pw.flush();
        pw.close();
    }
}
