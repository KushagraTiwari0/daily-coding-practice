package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class PrintNamesNtimes {
    public static void recN(int N,String s)
    {
        if(N>0)
        {
            System.out.println(s);
            recN(N-1, s);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Name -> ");
        String s=sc.nextLine();
        System.out.println();
        System.out.print("Enter Number of times -> ");
        int N=sc.nextInt();
        System.out.println();
        recN(N,s);
    }
}
