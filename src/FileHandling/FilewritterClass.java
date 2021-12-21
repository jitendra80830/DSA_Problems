package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class FilewritterClass {
    public static void main(String[] args) throws IOException {
        FileWriter fr = new FileWriter("C:\\Users\\Jitendra Kumar\\Documents\\Java\\test\\text1.txt");
        fr.write('a');
        fr.write("\n");
        fr.write("Hello\n");
        fr.write("i am from gaya\n");
        char[] ch = {'h','e','l','o'};
        fr.write(ch);
        fr.write("\n");
        fr.flush();
        fr.close();
    }
}
