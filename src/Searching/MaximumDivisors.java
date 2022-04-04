package Searching;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumDivisors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> lista = new ArrayList<>();
        ArrayList<Integer> listb = new ArrayList<>();
        for (int i = 1; i <=a; i++) {
            if(a%i == 0){
                lista.add(i);

                //System.out.print(i+" ");
            }
        }
        for (int i = 1; i <=b ; i++) {
            if(b%i == 0){
                listb.add(i);
                //System.out.print(i+" ");
            }
        }
        for (int i = 0; i <lista.size() ; i++) {
            System.out.print(lista.get(i)+" ");
        }
        System.out.println();
        for (int i = 0; i <listb.size() ; i++) {
            System.out.print(listb.get(i)+" ");
        }
        ArrayList<Integer> comdiv = new ArrayList<>();
        for (int i = 0; i <lista.size() ; i++) {
           if(listb.contains(lista.get(i))){
               comdiv.add(i);
           }
        }
        System.out.println();
        for (int i = 0; i <comdiv.size() ; i++) {
            System.out.print(comdiv.get(i)+" ");
        }


    }
}
