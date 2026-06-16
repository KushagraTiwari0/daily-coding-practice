package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class Print1toNtimes {

    public static void recN(int N)
    {
        if(N>0)
        {
            recN(N - 1);
            System.out.println(N);
        }
        return;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number -> ");
        int n=sc.nextInt();
        recN(n);
    }
}
