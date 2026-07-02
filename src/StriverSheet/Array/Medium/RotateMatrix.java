package StriverSheet.Array.Medium;

import java.util.Scanner;

class RotateMatrix {


    public static void transpose(int a[][],int s,int e)
    {
        int temp=a[s][e];
        a[s][e]=a[e][s];
        a[e][s]=temp;
    }

    public static void mt(int a[][],int n)
    {
        for(int i=0;i<n-1;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                transpose(a, i, j);
            }
        }
        rotate(a, n);
    }


    public static void rotate(int a[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            int l=0;
            int r=n-1;
            while(l<r)
            {
                int temp=a[i][l];
                a[i][l]=a[i][r];
                a[i][r]=temp;
                l++;
                r--;
            }
        }
        display(a, n);
    }

    public static void display(int a[][],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j = 0; j < n; j++)
            {
                System.out.print(a[i][j] + " ");
            }
                System.out.println();
        }
    } 

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n=sc.nextInt();
        if(n<1)
        {
            System.out.println("No Elements ");
            return;
        }
        System.out.println("Enter elements of Array -> ");
        int a[][]=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        mt(a,n);
    }
    
}