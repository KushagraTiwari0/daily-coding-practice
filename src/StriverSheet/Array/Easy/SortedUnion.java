package StriverSheet.Array.Easy;

import java.util.ArrayList;
import java.util.Scanner;

public class SortedUnion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of 1st Array -> ");
        int n = sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.print("Enter Size of 2nd Array -> ");
        int m = sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int b[] = new int[m];
        for (int i = 0; i < m; i++)
        {
            b[i] = sc.nextInt();
        }

        ArrayList <Integer> al=new ArrayList<>();

        int i=0;
        int j=0;
        while(i<a.length&&j<b.length)
        {
            if(a[i]!=b[j])
            {
                if(a[i]<b[j])
                {
                    if (al.size() == 0 || al.get(al.size() - 1) != a[i])
                    {
                        al.add(a[i]);
                    }
                    
                    i++;
                }
                else if(b[j]<a[i])
                {
                    if (al.size() == 0 || al.get(al.size() - 1) != b[j])
                    {
                        al.add(b[j]);
                    }
                    j++;
                }
            }
            else{
                if(al.size()==0||al.get(al.size()-1)!=a[i])
                {
                    al.add(a[i]);
                }
                i++;
                j++;
            }
        }
        while(i<n)
        {
            if(al.size()==0||al.get(al.size()-1)!=a[i])
            {
                al.add(a[i]);
            }
            i++;
        }
        while(j<m)
        {
            if (al.size()==0||al.get(al.size()-1)!=b[j]) {
                al.add(b[j]);
            }
            j++;
        }
        for(int x:al)
        {
            System.out.print(x+" ");
        }
    }
}
