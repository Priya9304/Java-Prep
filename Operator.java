class Operator{
	public static void main(String[] args){
		//UNARY:- Increment,Descrement,Logical Not
		//BINARY:-Arithmetic,Assignment,Relational,Logical(AND,OR)
		//TERNARY Conditional?:
		//?--->pending
		//:--->choice
		
		
		byte b1 = 10, b2 = 20;
		System.out.println(b1+b2);//30
		
		char c1 = 'A', c2 = 'A';
		System.out.println(c1+c2);//130
		
		
		short s1 = 12000, s2 = 12000;
		System.out.println(s1+s2);//24000
		
		
		
		//This will give error error because Java automatically promotes
		//byte, short, and char operands to int before performing any 
		//arithmetic operation. Therefore, the result of b1 + b2, c1 + c2, or s1 + s2 is an int.
		//Assigning that int result back to a byte, char, or short without an explicit cast can 
		//cause data loss, so the compiler gives a "possible lossy conversion" error.
		
		byte b1 = 10, b2 = 20;
		byte res1 = b1+b2;
		System.out.println(res1);//30
		
		char c1 = 'A', c2 = 'A';
		char res2 = c1+c2;
		System.out.println(res2);//130
		
		
		short s1 = 12000, s2 = 12000;
		short res3 = s1+s2;
		System.out.println(res3);//24000
		
		
		
	}
}