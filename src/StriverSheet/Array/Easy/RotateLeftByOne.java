package StriverSheet.Array.Easy;

import java.util.Scanner;

public class RotateLeftByOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array -> ");
        int n = sc.nextInt();
        if (n == 0) 
        {
            System.out.println("No Elements");
            return;
        }
        System.out.println("Enter elements of Array -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        int f=a[0];
        for(int i=0;i<n-1;i++)
        {
            a[i]=a[i+1];
        }
        a[n-1]=f;
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
