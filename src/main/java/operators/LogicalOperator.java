package operators;

public class LogicalOperator {

	public static void main(String[] args) {
		
		// Logical Operator!!! ----- Multiple condition
		// Logical AND: && - All the condition needs to be true
		// Logical OR: || - Atleast one condition needs to be true
		// Logical NOT: ! - Inversion
		
		System.out.println((5>4) && (5<2));
		System.out.println((5>4) || (5<2));
		System.out.println(! (5>4) || (5<2));

	}
}
