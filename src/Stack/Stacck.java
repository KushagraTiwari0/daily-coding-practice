public class Stacck{
	private int[] arr;
	private int top;
	private int capacity;
public Stacck(int size){
	arr=new int[size];
	capacity=size;
	top=-1;
	}
public void push(int data){
	if(isFull()){
	System.out.println("Stack Overflow");
	return;
	}
	arr[++top]=data;
	System.out.println(data+" Pushed");
	}
public int pop(){
	if(isEmpty()){
	System.out.println("Stack Underflow");
	return -1;
	}
	return arr[top--];
	}
public int peek(){
	if(isEmpty()){
	System.out.println("Stack is Empty");
	return -1;
	}
	return arr[top];
	}
public boolean isFull(){
	return top== capacity-1;
	}
public boolean isEmpty(){
	return top== -1;
	}
public void display(){
	if(isEmpty()){
	System.out.println("Stack is Empty");
	return;
	}
	System.out.println("Stack elements are: ");
	for(int i=top;i>=0;i--){
	System.out.println(arr[i]);
	}
	}
}

