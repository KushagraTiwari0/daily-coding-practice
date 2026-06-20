package StriverSheet.Array.Easy;

import java.util.Scanner;

public class IsSorted {

    public static void optiIsSorted(int a[],int n)
    {
        for(int i=1;i<n;i++)
        {
            if(a[i]<a[i-1])
            {
                System.out.println("Not Sorted ");
                return;
            }
        }
        System.out.println("Sorted");
    }

    public static void isSorted(int a[],int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                    System.out.println("Not Sorted");
                    return;
                }
            }
        }
        System.out.println("Sorted");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");

        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("Enter elements of Array -> ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        isSorted(a,n);
        optiIsSorted(a, n);
    }
}
