package StriverSheet.Array.Medium;

import java.util.Scanner;

public class MaximumSubarraySum {

    public static void mSARS(int a[],int n)
    {
        int cS=0;
        int si=0;
        int ei=-1;
        int ss=0;
        int mS=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            cS+=a[i];
            if(cS>mS)
            {
                ss=si;
                ei=i;
                mS=Math.max(mS,cS);
            }
            if(cS<0)
            {
                cS=0;
                si=i+1;
            }
        }
        for(int i=ss;i<=ei;i++)
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
        mSARS(a, n);
    }
}
