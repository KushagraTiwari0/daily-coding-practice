package StriverSheet.BasicMaths;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=sc.nextInt();
        int c=0;
        if(n<2)
        {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                c++;
                break;
            }
        }
        if (c == 0) 
        {
            System.out.println("Prime");
        }
        else
        {
            System.out.println("Not Prime");
        }
    }
}
