package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class PrintNto1 {
    public static void recN(int N)
    {
        if(N>0)
        {
            System.out.println(N);
            recN(N-1);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number ->");
        int n=sc.nextInt();
        recN(n);
    }
}
