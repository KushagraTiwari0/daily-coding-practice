package StriverSheet.Array.Medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestConsecutive {

    public static void optilcs(int a[],int n)
    {
        int l=1;
        Set<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            s.add(a[i]);
        }
        for(int i=0;i<n;i++)
        {
            if(!s.contains(a[i]-1))
            {
                int cnt=1;
                int cc=a[i];
                while(s.contains(cc+1))
                {
                    cc+=1;
                    cnt+=1;
                }
                l=Math.max(l,cnt);
            }
        }
        System.out.println("Max -> "+l);
    }

    public static void lcs(int a[],int n)
    {
        Arrays.sort(a);
        int i=0;
        int l=1;
        int max=1;
        int s=0;
        int cs=0;
        while(i<n-1)
        {
            if(a[i]==a[i+1])
            {
                i++;
            }
            else if(a[i]+1==a[i+1])
            {
                l++;
                i++;
            }
            else
            {
                if(l>max)
                {
                    max=l;
                    s=cs;
                }
                l=1;
                cs=i+1;
                i++;
            }
        }
        if (l > max) 
        {
            max = l;
            s = cs;
        }
        System.out.println("Max -> "+max);
        for(int j=s;j<s+max;j++)
        {
            if(j==s||a[j]!=a[j-1])
            {
                System.out.print(a[j]+" ");
            }
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
        lcs(a,n);
        optilcs(a, n);
    }
}
