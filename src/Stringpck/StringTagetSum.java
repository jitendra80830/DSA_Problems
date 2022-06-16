package Stringpck;

public class StringTagetSum {
    public static void main(String[] args){
        //["123","4","12","34"]
        //"1234"
        String[] str = {"123","4","12","34"};
        String target = "1234";
        System.out.println(numOfPairs(str , target));

    }
    public static int numOfPairs(String[] nums, String target) {
        int n = nums.length;
        int count = 0;
        for(int i=0;i<n;i++){
            for(int j =0;j<n;j++){
                if(i!=j){
                    if(charVal(nums[i],nums[j] ,target)){
                        count++;

                    }
                }
            }
        }
        return count;

    }
    public static boolean charVal(String s1 , String s2 ,String target){
        int targetsum = 0;
        int bothstringSum = 0;
        for(int i =0;i<target.length();i++){
            targetsum+=  target.charAt(i);
        }
        for(int i =0;i<s1.length();i++){
            bothstringSum+=  s1.charAt(i);
        }
        for(int i =0;i<s2.length();i++){
            bothstringSum+=  s2.charAt(i);
        }
        String concate = s1 + s2;
        if(bothstringSum == targetsum && target.equals(concate)){
            return true;
        }else {
            return false;
        }
    }
}