package StriverSheet.Array.Easy;

import java.util.Scanner;

public class LargestElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Array size -> ");
        int n=sc.nextInt();
        System.out.println("Enter Elements -> ");
        int a[]=new int[n];
        int max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("Largest Element -> "+max);
    }
}
