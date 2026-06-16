package StriverSheet.BasicRecursion;

import java.util.Scanner;

public class StringPalindrome {

    public static boolean recPalindrome(String s, int i) {
        if(i>=s.length()/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
        return recPalindrome(s, i+1);
    }

    public static boolean isPalindrome(String s)
    {
        int l=0;
        int r=s.length()-1;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;

    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String -> ");
        String s=sc.nextLine();
        System.out.println(isPalindrome(s));
        System.out.println(recPalindrome(s,0));

    }
}
