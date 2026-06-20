package StriverSheet.Array.Easy;

import java.util.Scanner;

public class RemoveDuplicate {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Size of Array -> ");
        int n=sc.nextInt();
        System.out.println("Enter elements of Array -> ");
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        int i=0;
        int j=i+1;
        while(j<n)
        {
            if(a[i]==a[j])
            {
                j++;
            }
            else if(a[i]<a[j])
            {
                a[i+1]=a[j];
                i++;
            }
        }
        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
