package Stringpck;

public class Man23 {
    public static void main(String[] args) {
        String str = "My name is jitendra Kumar";

        String str4[] = str.split(" ");
        for (String s : str4){
            System.out.println(s);
        }
        for (int i = str4.length-1; i>=0; i--) {
            System.out.print(str4[i]+" ");

        }
    }
}
