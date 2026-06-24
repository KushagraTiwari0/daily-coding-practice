package StriverSheet.Array.Medium;

import java.util.Scanner;

public class Rearrange {

    public static void swap(int a[],int s,int e)
    {
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
    public static void reArrange(int []a,int n)
    {
        int arr[]=new int[n];
        int p=0;
        int e=1;
        for(int i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                arr[p]=a[i];
                p+=2;
            }
            else
            {
                arr[e]=a[i];
                e+=2;
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("No Elements ");
            return;
        }
        System.out.println("Enter elements of Array -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }  
        reArrange(a, n);
    }
}
