package StriverSheet.Array.Hard;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MajorityElementII {

    public static void mj(int a[],int n)
    {
        int e1=Integer.MIN_VALUE;
        int e2=Integer.MIN_VALUE;
        int cnt1=0;
        int cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(cnt1==0&&a[i]!=e2)
            {
                cnt1++;
                e1=a[i];
            }
            else if(cnt2==0&&a[i]!=e1)
            {
                cnt2++;
                e2=a[i];
            }
            else if(e1==a[i])
            {
                cnt1++;
            }
            else if(e2==a[i])
            {
                cnt2++;
            }
            else
            {
                cnt1--;
                cnt2--;
            }
        }
        List<Integer>l=new ArrayList<>();
        cnt1=0;
        cnt2=0;
        for(int i=0;i<n;i++)
        {
            if(e1==a[i])
            {
                cnt1++;
            }
            if(e2==a[i])
            {
                cnt2++;
            }
        }
        int minimum=(int)(n/3)+1;
        if(cnt1>=minimum)
        {
            l.add(e1);
        }
        if(cnt2>=minimum)
        {
            l.add(e2);
        }
        display(l);
    }

    public static void display(List<Integer> l)
    {
        for(int x:l)
        {
            System.out.println(x);
        }
    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size -> ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("Enter Elements ->");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        mj(a,n);
    }
}
