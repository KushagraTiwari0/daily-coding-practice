package StriverSheet.Array.Medium;

import java.util.Scanner;

public class Sort012 {
    public static void swap(int a[],int s,int e)
    {
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
    public static void sort(int a[],int n)
    {
        int s=0;
        int i=0;
        int e=n-1;
        while(i<=e)
        {
            if(a[i]==0)
            {
                swap(a, s, i);
                i++;
                s++;
            }
            else if(a[i]==2)
            {
                swap(a, i, e);
                e--;
                
            }
            else
            {
                i++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        sort(a,n);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
