package StriverSheet.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
public class FourSum {
    
    public static void sum(int a[],int n,int target)
    {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(i>0&&a[i]==a[i-1])
            {
                continue;
            }
            for(int j=i+1;j<n;j++)
            {
                if(j>i+1&&a[j]==a[j-1])
                {
                    continue;
                }
                int left=j+1;
                int right=n-1;
                while(left<right)
                {
                    long  s=(long) a[i]+a[j]+a[left]+a[right];
                    if(s==target)
                    {
                        ans.add(Arrays.asList(a[i],a[j],a[left],a[right]));
                        while (left<right&&a[left]==a[left+1])
                        {
                            left++;    
                        }
                        while(left<right&&a[right]==a[right-1])
                        {
                            right--;
                        }
                        left++;
                        right--;
                    }
                    else if(s>target)
                    {
                        right--;
                    }
                    else
                    {
                        left++;
                    }
                }
            }
        }
        for(List<Integer> t:ans)
        {
            for(int x:t)
            {
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the size -> ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("Enter Elements ->");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Target -> ");
        int t=sc.nextInt();
        sum(a,n,t);
    }
 }