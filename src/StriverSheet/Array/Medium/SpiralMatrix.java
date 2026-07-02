package StriverSheet.Array.Medium;

import java.util.Scanner;

public class SpiralMatrix {
    public static void display(int res[])
    {
        for(int i=0;i<res.length;i++)
        {
            System.out.print(res[i]+" ");
        }
    }
    public static void sp(int a[][],int n,int m)
    {
        int top=0;
        int bottom=n-1;
        int right=m-1;
        int left=0;
        int res[]=new int[n*m];
        int c=0;
        while(left<=right&&top<=bottom)
        {
            for(int i=left;i<=right;i++)
            {
                res[c++]=a[top][i];
            }
            top++;

            for(int i=top;i<=bottom;i++)
            {
                res[c++]=a[i][right];
            }
            right--;
            if(top<=bottom)
            {   
                for(int i=right;i>=left;i--)
                {
                    res[c++]=a[bottom][i];
                }
            bottom--;
            }   
                 if(left<=right)
            {
                for(int i=bottom;i>=top;i--)
                {
                    res[c++]=a[i][left];
                }
                left++;
            }
        }
        display(res);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.print("Enter n -> ");
        int n=sc.nextInt();
        System.out.print("Enter m -> ");
        int m=sc.nextInt();
        if(n<1)
        {
            System.out.println("No Elements ");
            return;
        }
        System.out.println("Enter elements of Array -> ");
        int a[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        sp(a,n,m);
    }
}
