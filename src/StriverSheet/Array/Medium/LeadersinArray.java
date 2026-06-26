package StriverSheet.Array.Medium;

import java.util.ArrayList;
import java.util.Scanner;

public class LeadersinArray {
    public static void leaders(int a[],int n)
    {
        int i=n-1;
        int max=Integer.MIN_VALUE;
        ArrayList<Integer> arr=new ArrayList<>();
        while(i>=0)
        {
            if(max<a[i])
            {
                max=a[i];
                arr.add(max);
            }
            i--;
        }
        for(int k=arr.size()-1;k>=0;k--)
        {
            System.out.print(arr.get(k)+" ");
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
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        leaders(a,n);
    }
}
