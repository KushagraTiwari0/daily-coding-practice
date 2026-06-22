package StriverSheet.Array.Easy;

import java.util.Scanner;

public class AppearOnce {
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
        int xor=0;
        for(int i=0;i<n;i++)
        {
            xor^=a[i];
        }
        
        System.out.println("Element -> " + xor);
        
    }
}
