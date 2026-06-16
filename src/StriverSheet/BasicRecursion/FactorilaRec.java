package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class FactorilaRec {
    public static void Factrec(int N,int i)
    {
        // if(i<=N)
        // {
        //     if(N%i==0)
        //     {
        //         System.out.println(i);
        //     }
        //     Factrec(N,i+1);
        // }
        // return;
        if(i>N)
        {
            return;
        }
        if(N%i==0)
        {
            System.out.println(i);
        }
        Factrec(N, i+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        Factrec(n,1);
    }
}
