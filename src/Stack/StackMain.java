import java.util.*;
public class StackMain{
	 public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Size");
	int size=sc.nextInt();
	Stacck stack=new Stacck(size);
	for(int i=0;i<size;i++){
	System.out.print("Enter Element: ");
        int data = sc.nextInt();
        stack.push(data);
	}
	stack.display();
	System.out.println("Top Element: " + stack.peek());
    System.out.println("Popped Element: " + stack.pop());

    stack.display();
	sc.close();
	}
}