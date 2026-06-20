package StriverSheet.Array.Easy;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size -> ");
        int n=sc.nextInt();
        System.out.println("Enter Elements -> ");
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        int sMax=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                sMax=max;
                max=a[i];
            }
            else if(a[i]>sMax&&a[i]!=max)
            {
                sMax=a[i];
            }
        }
        if(sMax==Integer.MIN_VALUE)
        {
            System.out.println("No 2nd Largest Element");
        }
        else
        {
            System.out.println("Second Largest Element -> " + sMax);

        }
    }
}
