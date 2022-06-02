package Graph;

import java.util.*;
import java.io.*;
public class KIngdom {
    public static void DFS (int[][] a,int i,int j,int[][] vis){
        if(i>=a.length|| j>=a[0].length|| i<0 || j<0 || vis[i][j]==1|| a[i][j]==0)
            return;
        vis[i][j]=1;
        DFS(a,i+1,j,vis);
        DFS(a,i-1,j,vis);
        DFS(a,i,j+1,vis);
        DFS(a,i,j-1,vis);
    }
    public static void main(String args[]) throws IOException {
        //write your code here
        Scanner sc=new Scanner(System.in);
        //ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        int count=0;
        int[][] vis=new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(vis[i][j]==0 && mat[i][j]==1)
                {
                    DFS(mat,i,j,vis);
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}