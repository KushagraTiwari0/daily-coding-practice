package StriverSheet.Array.Medium;
import java.util.Scanner;

public class KadaneAlgorithm {

    public static void kadane(int a[],int n)
    {
        int cS=0;
        int maxS=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            cS+=a[i];
            maxS=Math.max(maxS,cS);
            if(cS<0)
            {
                cS=0;
            }
        }
        System.out.println("Maximum Sum -> "+maxS);
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
        kadane(a, n);
    }
}
