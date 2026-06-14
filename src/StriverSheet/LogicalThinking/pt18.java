package StriverSheet.LogicalThinking;

public class pt18 {
    public static void main(String[] args) {
        int n=5;
        for(int i=0;i<n;i++)
        {
            for(int j=(char)('A'+n-1-i);j<='A'+n-1;j++)
            {
                System.out.print((char)(j));
            }
            System.out.println();
        }
    }
}
