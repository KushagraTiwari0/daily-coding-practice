package StriverSheet.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountFrequencyOfElementInArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of array -> ");
        int n=sc.nextInt();
        System.out.println();
        System.out.print("Enter elements of array -> ");
        int a[]=new int[n];
        int max=0;
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println();
        
        int freq[]=new int[max+1];

        for(int i=0;i<n;i++)
        {
            freq[a[i]]++;
        }
        
        for(int i=0;i<=max;i++)
        {
            if(freq[i]>0)
            {
                System.out.println("Frequency of "+i+" is -> "+freq[i]);
            }
        }


        //Method 1
        //boolean isVisited[]=new boolean[n];
        // for (int i = 0; i < n; i++) {
        //     if (isVisited[i]) {
        //         continue;
        //     }
        //     int count = 1;
        //     for (int j = i+1; j < n;j++)
        //     {
        //         if(a[i]==a[j])
        //         {
        //             isVisited[j]=true;
        //             count++;
        //         }
        //     }
        //     System.out.println(a[i]+" -> "+count);
        // }
        

        //Using HashMap

        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(a[i],m.getOrDefault(a[i],0)+1);
        }
        for(Map.Entry<Integer,Integer>e:m.entrySet())
        {
            System.out.println(e.getKey()+" -> "+e.getValue());
        }
    }
}
