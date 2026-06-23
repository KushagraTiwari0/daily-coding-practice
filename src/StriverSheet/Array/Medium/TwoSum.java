package StriverSheet.Array.Medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TwoSum {

    public static boolean twoSum(int a[],int t)
    {
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                if(a[i]+a[j]==t)
                {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean optiTwoSum(int a[],int t)
    {
        Arrays.sort(a);
        int n=a.length;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if(a[l]+a[r]==t)
            {
                return true;
            }
            else if(a[l]+a[r]<t)
            {
                l++;
            }
            else
            {
                r--;
            }
        }
        return false;
    }
    
    public static int[] hashTwoSum(int a[],int t)
    {
        HashMap<Integer,Integer> h=new HashMap<>();
        for(int i=0;i<a.length;i++)
        {
            int need=t-a[i];
            if(h.containsKey(need))
            {
                return new int []{h.get(need),i};
            }
            h.put(a[i],i);
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Target Sum -> ");
        int t=sc.nextInt();
        if(optiTwoSum(a, t))
        {
            int[] res=hashTwoSum(a, t);
            System.out.println("Yes Pair exist ["+res[0]+","+res[1]+"]");
        }
        else
        {
            System.out.println("No Pair exist ");
        }
    }
}
