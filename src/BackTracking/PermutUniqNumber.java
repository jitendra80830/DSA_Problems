package BackTracking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PermutUniqNumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<Integer> a=new ArrayList<>();
        ArrayList<ArrayList<Integer> > aList =
                new ArrayList<ArrayList<Integer> >(n);
        for(int i=0;i<n;i++)
        {
            a.add(sc.nextInt());
        }
        aList=  permutation(a,aList,0, n-1);
        Collections.sort(aList, new Comparator<ArrayList<Integer>>() {
            // @Override
            public int compare(ArrayList<Integer> a, ArrayList<Integer> b)
            {
                int p=0;
                for(int i=0;i<n;i++)
                    if( a.get(i).compareTo(b.get(i))==0)
                        continue;
                    else {
                        p=i;
                        break;
                    }
                return a.get(p).compareTo(b.get(p));
            }
        });
        for (int i = 0; i < aList.size(); i++) {
            for (int j = 0; j < aList.get(i).size(); j++) {
                System.out.print(aList.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
    static ArrayList<ArrayList<Integer>> permutation(ArrayList<Integer> a, ArrayList<ArrayList<Integer>> aList, int l, int n) {
        if(l==n)
        {
            ArrayList<Integer> newArr = new ArrayList<>(a);
            // System.out.println("a"+a);
            aList.add(newArr);
        }
        else
        {
            for(int i=l;i<=n;i++)
            {
                Collections.swap(a, l, i);//swaps the element
                permutation (a,aList,l+1,n);
                Collections.swap(a, l, i);//puts the element in correct position
            }
        }
        return aList;
    }
}

