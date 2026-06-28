package StriverSheet.Array.Medium;

import java.util.HashMap;
import java.util.Scanner;

public class CountSubArraySum {

    public static void optiCount(int a[],int n,int k)
    {
        HashMap<Integer,Integer> prefixSum=new HashMap<>();
        int c=0;
        int pSum=0;
        prefixSum.put(0,1);
        for(int i=0;i<n;i++)
        {
            pSum+=a[i];
            int re=pSum-k;
            if(prefixSum.containsKey(re))
            {
                c+=prefixSum.get(re);
            }
        prefixSum.put(pSum, prefixSum.getOrDefault(pSum, 0) + 1);
        }
        System.out.println("Count -> "+c);
    }

    public static void count(int a[],int n,int k)
    {
        int c=0;
        for(int i=0;i<n;i++)
        {
            int s=0;
            for(int j=i;j<n;j++)
            {
                s+=a[j];
                if(s==k)
                {
                    c++;
                }
            }
        }
        System.out.println("Max -> "+c);
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
        System.out.println("Enter Sum -> ");
        int k=sc.nextInt();
        count(a, n,k);
        optiCount(a, n, k);
    }
}
