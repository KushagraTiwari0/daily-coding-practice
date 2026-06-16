package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class SumOf1stN {
    public static int recSum(int N,int Sum)
    {
        if(N>0)
        {
            Sum+=N;
            return recSum(N-1, Sum);
        }
        return Sum;
    }
    public static void formula(int N)
    {
        System.out.println("Sum using formula -> "+(N*((N+1)/2)));
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number -> ");
        int n=sc.nextInt();
        int s=recSum(n,0);
        System.out.println("Sum -> "+s);
        formula(n);
    }
}
