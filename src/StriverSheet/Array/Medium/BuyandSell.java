package StriverSheet.Array.Medium;

import java.util.Scanner;

public class BuyandSell {

    public static void bas(int a[],int n)
    {
        int minPrice=Integer.MAX_VALUE;
        int maxPrice=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]<minPrice)
            {
                minPrice=a[i];
            }
            else
            {
                maxPrice=Math.max(maxPrice,a[i]-maxPrice);
            }
        }
        System.out.println("Maximum Profit -> "+maxPrice);
    }
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of Array -> ");
        int n = sc.nextInt();
        if (n < 1) {
            System.out.println("No Elements ");
            return;
        }
        System.out.println("Enter elements of Array -> ");
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }  
        bas( a, n); 
    }
}
