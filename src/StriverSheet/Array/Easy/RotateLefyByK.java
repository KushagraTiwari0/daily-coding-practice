package StriverSheet.Array.Easy;

import java.util.Scanner;

public class RotateLefyByK {

    public static void rev(int a[],int s,int e)
    {
        while(s<e)
        {
            int temp=a[s];
            a[s]=a[e];
            a[e]=temp;
            s++;
            e--;
        }
    }

    public static void rotateRev(int a[],int k,int n)
    {
        rev(a,0,k-1);
        rev(a,k,n-1);
        rev(a,0,n-1);
        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }

    public static void basicSolu(int a[],int k,int n)
    {
        int f[] = new int[k];
        for (int i = 0; i < k; i++) {
            f[i] = a[i];
        }
        for (int i = 0; i < n - k; i++) {
            a[i] = a[i + k];
        }
        for (int i = n - k, j = 0; j < k && i < n; j++, i++) {
            a[i] = f[j];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

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
        int b[] = new int[n];
        for (int i = 0; i < n; i++) 
        {
            a[i] = sc.nextInt();
            b[i]=a[i];
        }
        System.out.print("Enter K -> ");
        int k=sc.nextInt();
        k = k % n;
        rotateRev(a, k,n);
        basicSolu(b,k,n);
    }
}
