package StriverSheet.Array.Medium;

import java.util.Arrays;
import java.util.Scanner;

public class MajorityElement_1 {
    public static void majority(int a[],int n)
    {
        Arrays.sort(a);
        System.out.println("Majority Element -> "+a[n/2]);
    }


    public static void optiMajority(int a[],int n)
    {
        int cnt=0;
        int c=0;
        for(int i=0;i<n;i++)
        {
            if(cnt==0)
            {
                c=a[i];
                cnt=1;
            }
            else if(c==a[i])
            {
                cnt++;
            }
            else
            {
                cnt--;
            }
        }
        int cnt1=0;
        for(int i=0;i<n;i++)
        {
            if(c==a[i])
            {
                cnt1++;
            }
        }
        if(cnt1>n/2)
        {
            System.out.println("Majority elment -> "+c);
        }
        else
        {
            System.out.println("No Majority Element ");
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
        majority(a,n);
        optiMajority(a, n);
    }
}
