package operators;

public class UnaryOperator {
	
	
	public static void main(String[] args) {
		int a;   //Declaration
		a=+5;    //Assignment     +5 indicates reduntant - Not necessay to give + sign
		int b;
		b=-a;    //-ve unary operator
		System.out.println("a => "+a);   //5
		System.out.println("b => "+b);   //-5
		
		int c;
		System.out.println("---PRE DECREMENT---");
		c=--a;    //PRE DECREMENT ---DECREMENT First and then Use
		System.out.println("c => "+c);      //4
		System.out.println("a => "+a);      //4
		
		System.out.println("---PRE INCREMENT---");
		c=++a;    //PRE INCREMENT ---INCREMENT First and then Use
		System.out.println("c => "+c);   //5
		System.out.println("a => "+a);   //5
		
		System.out.println("---POST DECREMENT---");
		c=a--;    //POST DECREMENT ---Use First and then DECREMENT
		System.out.println("c => "+c);   //5
		System.out.println("a => "+a);   //4
		
		System.out.println("---POST INCREMENT---");
		c=a++;    //POST INCREMENT ---Use First and then INCREMENT
		System.out.println("c => "+c);  //4
		System.out.println("a => "+a);  //5
		
		boolean isStatus = false;
		isStatus = !isStatus;    //NOT OPERATOR
		System.out.println(isStatus);
	}

}
