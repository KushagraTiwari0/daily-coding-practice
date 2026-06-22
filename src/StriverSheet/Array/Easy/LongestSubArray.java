package StriverSheet.Array.Easy;

import java.util.Scanner;

public class LongestSubArray {
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
        System.out.print("Enter K -> ");
        int k=sc.nextInt();
        System.out.println();
        int ls=0;
        int i=0;
        int j=0;
        int s=a[0];
        while(j<n)
        {
            while(i<=n&&s>k)
            {
                s-=a[i];
                i++;
            }

            if(s==k)
            {
                ls=Math.max(ls, j-i+1);
            }
            j++;
            if(j<n)
            {
                s+=a[j];
            }
        }
        System.out.println("Longest SubArray Count -> "+ls);
    }
}
