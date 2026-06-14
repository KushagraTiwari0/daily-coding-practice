package StriverSheet.LogicalThinking;

public class pt19 {
    public static void main(String[] args) {
        int n=3;
        for(int i=1;i<=n;i++)
        {
            for(int j = n; j >= i; j--)
            {
                System.out.print("x");
            }
            for(int j=1;j<=2*(i-1);j++)
            {
                System.out.print(" ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print("x");
            }
            System.out.println();
        }
        for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print("x");
            }
            for(int j=1;j<=2*(n-i);j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("x");
            }
            System.out.println();
        }
    }
}
