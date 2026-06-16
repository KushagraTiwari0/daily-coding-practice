package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class PrintNTimes
 {

    public static void recN(int  N,int c)
    {
        if(N>0)
        {
            System.out.println(c);
            recN(N-1,c);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ->");
        int N=sc.nextInt();
        recN(N,N);
    }
 }