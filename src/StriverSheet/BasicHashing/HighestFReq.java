package StriverSheet.BasicHashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFReq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array -> ");
        int n=sc.nextInt();
        System.out.print("Enter elements ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        HashMap<Integer,Integer> m=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            m.put(a[i],m.getOrDefault(a[i],0 )+1);
        }
        int maxElement=0;
        int maxFreq=0;
        int minElement=0;
        int minFreq = Integer.MAX_VALUE;
        for(Map.Entry<Integer,Integer>e:m.entrySet())
        {
            int freq=e.getValue();
            int element=e.getKey();

            if(freq>maxFreq)
            {
                maxElement=element;
                maxFreq=freq;
            }
            if(freq<minFreq)
            {
                minElement=element;
                minFreq=freq;
            }
        }
        System.out.println(maxElement+" has Maximum Frequency -> "+maxFreq);
        System.out.println(minElement + " has Minimum Frequency -> " + minFreq);
    }
}
