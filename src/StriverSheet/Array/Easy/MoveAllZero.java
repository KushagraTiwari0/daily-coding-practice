package StriverSheet.Array.Easy;

import java.util.Scanner;

public class MoveAllZero {

    public static void swap(int a[],int s,int e)
    {
        int temp=a[s];
        a[s]=a[e];
        a[e]=temp;
    }
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
        int isZero=0;
        int notZero=1;
        while(isZero<n&& notZero<n)
        {
            if(a[isZero]!=0)
            {
                isZero++;
                if(notZero<=isZero)
                {
                    notZero=isZero+1;
                }
            }
            else{
                while (notZero<n&&a[notZero]==0) {
                    notZero++;
                }
                if(notZero<n)
                {
                    swap(a, isZero, notZero);
                }
            }

        }

        for(int k=0;k<n;k++)
        {
            System.out.print(a[k]+" ");
        }
    }
}
