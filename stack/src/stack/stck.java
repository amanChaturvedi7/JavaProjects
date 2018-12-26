package stack;

public class stck {
	private int arr[];
	private int top;
	private int size;
	
	public stck(){
		arr = new int[10];
		top = 0;
		size = 10;
	}
	
	public stck(int n){
		arr = new int[n];
		top = 0;
		size = n;
	}
	
	public void push(int val){
		if(top < size){
			arr[top] = val;
			top++;
		}
		else{
			System.out.println("Stack Overflow");
			System.exit(1);
		}
	}
	
	public int pop(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			top--;
			int v = arr[top];
			return v;
		}
	}
	
	public int peep(){
		if(isEmpty()){
			System.out.println("Stack Underflow");
			return 0;
		}
		else{
			int v = arr[top-1];
			return v;
		}
	}
	
	public boolean isEmpty(){
		if(top == 0)
			return true;
		else 
			return false;
	}
	
	public boolean isFull(){
		if(top == size){
			return true;
		}
		else
			return false;
		}
	
	
	
	
	
} 
