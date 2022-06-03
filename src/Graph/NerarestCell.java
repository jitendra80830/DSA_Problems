package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
class Nodes3 {

    int i;
    int j;
    int distance;
    Nodes3(int i, int j, int distance)
    {
        this.i=i;
        this.j=j;
        this.distance=distance;
    }
}
public class NerarestCell {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i=i+1)
        {
            int n=sc.nextInt();
            int m=sc.nextInt();
            int matrix[][]=new int[n][m];
            for(int j=0;j<n;j=j+1)
            {
                for(int k=0;k<m;k=k+1)
                {
                    matrix[j][k]=sc.nextInt();
                }
            }

            findMinDistance(matrix);
            printMatrix(matrix);
            System.out.println();
        }
    }

    static void printMatrix(int [][] matrix)
    {
        for(int i=0;i<matrix.length;i=i+1)
        {
            for(int j=0;j<matrix[0].length;j=j+1)
            {
                System.out.print(matrix[i][j]+" ");
            }
        }
    }

    static void findMinDistance(int[][] matrix)
    {
        Queue<Nodes3> queue=new LinkedList<>();
        int [][]visited=new int[matrix.length][matrix[0].length];

        for(int i=0;i<matrix.length;i=i+1)
        {
            for(int j=0;j<matrix[0].length;j=j+1)
            {
                if(matrix[i][j]==1)
                {
                    visited[i][j]=1;
                    matrix[i][j]=0;
                    queue.add(new Nodes3(i,j,0));
                }
            }
        }

        while(!queue.isEmpty())
        {
            Nodes3 temp=queue.poll();

            //Down
            if(isLocationValid(temp.i+1,temp.j,matrix) && visited[temp.i+1][temp.j]!=1)
            {
                if(matrix[temp.i+1][temp.j]==0)
                {
                    matrix[temp.i+1][temp.j]=temp.distance+1;
                }
                visited[temp.i+1][temp.j]=1;
                queue.add(new Nodes3(temp.i+1,temp.j,matrix[temp.i+1][temp.j]));
            }

            //Up
            if(isLocationValid(temp.i-1,temp.j,matrix) && visited[temp.i-1][temp.j]!=1)
            {
                if(matrix[temp.i-1][temp.j]==0)
                {
                    matrix[temp.i-1][temp.j]=temp.distance+1;
                }
                visited[temp.i-1][temp.j]=1;
                queue.add(new Nodes3(temp.i-1,temp.j,matrix[temp.i-1][temp.j]));
            }

            //Left
            if(isLocationValid(temp.i,temp.j-1,matrix) && visited[temp.i][temp.j-1]!=1)
            {
                if(matrix[temp.i][temp.j-1]==0)
                {
                    matrix[temp.i][temp.j-1]=temp.distance+1;
                }
                visited[temp.i][temp.j-1]=1;
                queue.add(new Nodes3(temp.i,temp.j-1,matrix[temp.i][temp.j-1]));
            }

            //Right
            if(isLocationValid(temp.i,temp.j+1,matrix) && visited[temp.i][temp.j+1]!=1)
            {
                if(matrix[temp.i][temp.j+1]==0)
                {
                    matrix[temp.i][temp.j+1]=temp.distance+1;
                }
                visited[temp.i][temp.j+1]=1;
                queue.add(new Nodes3(temp.i,temp.j+1,matrix[temp.i][temp.j+1]));
            }

        }

    }

    static boolean isLocationValid(int i,int j,int matrix[][])
    {
        if(i>=0 && i< matrix.length && j>=0 && j<matrix[0].length)
            return true;
        return false;
    }
}