package StriverSheet.Array.Easy;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Enter Element to be found -> ");
        int f=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++)
        {
            if(a[i]==f)
            {
                System.out.print("Element found at index -> "+i);
                return;
            }
        }
        System.out.println("Element not found ");
    }
}
