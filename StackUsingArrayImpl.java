
class StackUsingArrayImpl{

		
	private int stackSize;
	private int top;
	private int[] stackArr;
	

	public StackUsingArrayImpl(int size){
	this.stackSize=size;
	this.stackArr=new int[stackSize];
	this.top=-1;
	}
	

	public void push(int a){
	

		if(isStackFull()){
		
		this.increaseStackCapacity();

		}
	   
	   System.out.println("Adding entry : "+a);
	  
	   this.stackArr[++top]=a;
	
	
	}


	public int pop() throws Exception{
	
	if(isStackEmpty()){
		throw new Exception("cant remove element,Stack is empty");
	}
	int entry=this.stackArr[top--];
	System.out.println("removed value : " +entry);
	return entry;
	
	}

	
	
	public void increaseStackCapacity(){
	int[] newStack = new int[this.stackSize*2];

	for(int i=0;i<stackSize;i++){
	newStack[i]=stackArr[i];
	
	}
	this.stackSize=this.stackSize*2;
	this.stackArr=newStack;
	}



	public boolean isStackFull(){
	return (top == stackSize-1);
	}

	public boolean isStackEmpty(){
	return (top == -1);
	}


	public static void main(String args[]){

	System.out.println("push operation in stack");
	
	StackUsingArrayImpl st = new StackUsingArrayImpl(3);
	
	for(int j=0;j<10;j++){
	st.push(j);
	}
	
	System.out.println("removing from stack pop operation");
	
	for(int i=0;i<4;i++){
	try{
		st.pop();
		}
	catch(Exception e){
		e.printStackTrace();
	}
		
	}

	}




}