package BackTracking;

public class KeyPad {
    static String [] getString = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args){
        keyPaid("27","");

    }
    public static void keyPaid(String ques , String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            return;
        }
        char ch = ques.charAt(0); //at 0 char=1
        String keyString = getString[ch-'2']; //2=50 ascci value ,indexing from 2
        for(int i=0;i<keyString.length();i++){
            keyPaid(ques.substring(1),ans+keyString.charAt(i));
        }



    }
}
