package FileHandling;
import java.io.*;
import java.io.File;
import java.io.IOException;

public class FileClass {
    public static void main(String[] args) throws IOException {
        File fd = new File("C:\\Users\\Jitendra Kumar\\Documents\\Java");
        fd.mkdir();
        File f = new File("C:\\Users\\Jitendra Kumar\\Documents\\Java\\test\\text1.txt");
        f.createNewFile();

        File f2 = new File(fd , "text2.txt");
        f2.createNewFile();
        String str[] = fd.list();
        for(String data : str){
            System.out.println(data);
        }
        String str1[] = fd.list();
        for (String data1 : str1){
            File f11= new File(fd , data1);
            if(f11.isDirectory()){
                System.out.println(data1);
                System.out.println(f11.length());
                //f11.delete();
            }
        }
    }
}
