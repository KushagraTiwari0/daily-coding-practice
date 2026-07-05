package StriverSheet.Array.Hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;

class ThreeSum {

    public static void sum(int a[],int n)
    {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<n;i++)
        {
            if(i>0&&a[i]==a[i-1])
            {
                continue;
            }
            int left=i+1;
            int right=n-1;
            while(left<right)
            {
                int s=a[i]+a[left]+a[right];
                if(s==0)
                {
                    ans.add(Arrays.asList(a[i],a[left],a[right]));
                    left++;
                    right--;
                    while (left<right&& a[left]==a[left-1]) 
                    {
                        left++;
                    }
                    while(left<right && a[right]==a[right+1])
                    {
                        right--;
                    }
                }
                else if(s<0)
                {
                    left++;
                }
                else
                {
                    right--;
                }
            }
        }
        for (List<Integer> triplet : ans) 
        {
            for (int num : triplet) 
            {
                System.out.print(num + " ");
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
        
        sum(a,n);
    }
}
//In this question we are given with set of number like 2 0 1 -1 -2 we have to find unique element whhose sum is 0 and  print them we only have to select 3 numbsers at once
// suppose -1 0 1 2 -1 -4
// -1 + 0 + 1=0 three numbers sum upto 0
// -1  + -1 + 2=0 three numbers sum =0
// wWe need to derive logics and also best way to do it Logical thinking!!