package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderClass {
    public static void main(String[] args) throws IOException {
        File f = new File("C:\\Users\\Jitendra Kumar\\Documents\\Java\\test\\text1.txt");
        FileReader fr = new FileReader(f);

        char ch[] = new char[(int) f.length()];
        fr.read(ch);
        for(char c : ch){
            System.out.print(c);
        }
//        int data = fr.read();
//        while (data!=-1){
//            System.out.print((char) data);
//            data = fr.read();
//        }
    }
}
