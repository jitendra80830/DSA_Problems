package FileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\Jitendra Kumar\\OneDrive\\Documents\\ptintWr\\printwriter.txt");
        BufferedReader br = new BufferedReader(fr);


        int val = Integer.parseInt(br.readLine());
        double d = Double.parseDouble(br.readLine());
        String s = br.readLine();
        System.out.print(val+ " "+d+" "+s);
//        String str = br.readLine();
//        String stt1[] = str.trim().split(" ");
//        int arr[] = new int[stt1.length];
//        for (int i = 0; i < stt1.length; i++) {
//            arr[i] = Integer.parseInt(stt1[i]);
//            System.out.print(arr[i]+" ");
//        }
    }
}
