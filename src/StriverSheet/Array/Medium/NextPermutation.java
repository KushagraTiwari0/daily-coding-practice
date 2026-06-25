package StriverSheet.Array.Medium;

import java.util.Scanner;

public class NextPermutation {
    public static void swap(int a[],int i,int j)
    {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
    
    public static void rev(int a[],int i,int n)
    {
        int s=i;
        int e=n-1;
        while(s<e)
        {
            swap(a, s, e);
            s++;
            e--;
        }
    }

    public static void nextP(int a[],int n)
    {
        int idx=-1;
        for(int i=n-2;i>=0;i--)
        {
            if(a[i]<a[i+1])
            {
                idx=i;
                break;
            }
        }
        if(idx==-1)
        {
            rev( a,0,n);
            display(a);
            return;
        }
        for(int i=n-1;i>=idx;i--)
        {
            if(a[i]>a[idx])
            {
                swap(a, idx, i);
                break;
            }
        }
        rev(a,idx+1,n);
        display(a);
        return;
    }

    public static void display(int a[])
    {
        for(int i=0;i<a.length;i++)
        {
            System.out.print(a[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n=sc.nextInt();
        if(n<1)
        {
            System.out.println("No Elements ");
            return;
        }
        System.out.println("Enter elements of Array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        nextP(a, n);
    }
}
