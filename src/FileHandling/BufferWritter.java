package FileHandling;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class BufferWritter {
    public static void main(String[] args) throws IOException {
        //bufferWriter can not write directly file for that we need to FileWrite object
        FileWriter fw = new FileWriter("C:\\Users\\Jitendra Kumar\\OneDrive\\Documents\\file.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(120);
        bw.newLine();
        bw.write("java is high level programming language");
        bw.newLine();
        char[] ch = {'x','y','z'};
        bw.write(ch);
        bw.flush();
        bw.close();
    }
}
