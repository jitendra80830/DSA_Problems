package Stringpck;
//print first non repeating character
public class fisrtChar {
    public static void main(String[] args){
        String str[] = {"b","c","a","d","b","c","a","e"};
        int n = str.length;
        for(int i =0;i<n-1;i++){
            String ch = str[i];
            int flag = 0;
            for(int j =i+1;j<n-1;j++){
                if(str[j] == ch){
                    flag =1;
                    break;
                }
            }
            if(flag!=1){
                System.out.println(ch);
                break;
            }


        }
    }

}
