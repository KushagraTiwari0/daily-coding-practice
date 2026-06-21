package StriverSheet.Array.Easy;

import java.util.Scanner;

public class Consicutive {
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
        int c=0;
        int prev=0;
        int l=0;
        while(l<n)
        {
            if(a[l]==0)
            {
                c=0;
            }
            else
            {
                c++;
                prev = Math.max(c, prev);
            }
            l++;
        }
        System.out.println("Maximum Consicutive's -> "+prev);
    }
}
