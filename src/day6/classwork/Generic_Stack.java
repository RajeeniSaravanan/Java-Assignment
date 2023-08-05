package day6.classwork;

public class Generic_Stack <T extends Object>{
	
		public static int top=-1;
		public int size;
		public T[] a;
		
		Generic_Stack(int size){
			this.a= (T[]) new Object[size];
			this.size=size;
		}
		
		public boolean isFull(){
			return (top==size-1);
		}
		
		public boolean isEmpty(){
			return top==-1;
		}
		
		public void push(String string){
			if(isFull()){
				System.out.println("Stack is full");			
			}else{
				top++;
				a[top]=string;
				
			}
		}
		
		public T pop(){
			T temp=null;
			if(isEmpty()){
				System.out.println("Stack is empty");
			}else{
				temp=a[top];
				top--;			
			}
			return temp;
		}
		
		public T peek(){
			T temp=null;
			if(isEmpty()){
				System.out.println("Stack is empty");
			}else{
				temp=a[top];
				
			}
			return temp;
		}
		
		public void display(){
			if(isEmpty()){
				System.out.println("Stack is empty");
			}else{
				System.out.println("Stack contains");
				for(int i=top;i>=0;i--){
					System.out.println(a[i].toString());
				}
			}
		}
		
//		public void toDisplay(Object obj){
//			Student_Object so= (Student_Object) obj;
//			System.out.println(so.id+ " "+ so.name+ " "+so.marks);
//		}
		
		public static void main(String[] args) {
			Generic_Stack<Integer> s= new Generic_Stack<Integer>(5);
			s.push(1);
			s.push('d');
			s.push("bhb");
			s.push(3.4);
		
			s.push(new Student_Object(12,"hd", 89));
			s.display();
		
			System.out.println(s.peek() + " is the top element");
			System.out.println(".............");
			
			s.pop();
			s.display();
			System.out.println(".............");
			
			s.pop();
			s.display();
			System.out.println(".............");
			
			
			
			
		}

		private void push(double d) {
			// TODO Auto-generated method stub
			
		}

		private void push(int i) {
			// TODO Auto-generated method stub
			
		}

	


}
