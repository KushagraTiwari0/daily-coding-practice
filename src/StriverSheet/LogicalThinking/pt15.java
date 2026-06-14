package StriverSheet.LogicalThinking;

public class pt15 {
    public static void main(String[] args) {
     
        int n=5;
        for(int i=n-1;i>=0;i--)
        {
            for(int j='A';j<='A'+i;j++)
            {
                System.out.print((char)j);
            }
            System.out.println();
        }

    }
}
