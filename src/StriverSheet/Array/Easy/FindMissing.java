package StriverSheet.Array.Easy;

import java.util.Scanner;

public class FindMissing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[]=new int[n];
        int s=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            s+=a[i];
        }
        int m=n*(n+1)/2;
        System.out.println("Missing number -> "+(m-s));
    }
}
