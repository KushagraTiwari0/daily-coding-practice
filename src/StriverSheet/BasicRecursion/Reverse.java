package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class Reverse {
    public static void swap(int a,int b,int arr[])
    {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void rev(int N,int []a)
    {
        int p1=0;
        int p2=N-1;
        while(p1<p2)
        {
            swap(p1,p2,a);
            p1++;
            p2--;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter elements -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        rev(n,a);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
