import java.util.Scanner; 
class RelationalOp{
	public static void main(String[] args){
		//When we use relationalOp it will return boolean
		//== check the address
		
		//LogicalOp
		//AND, OR, NOT
		Scanner sc = new Scanner(System.in);
		System.out.println("Give the input");
		char ch = sc.next().charAt(0);
		
		boolean alp= (ch >= 'A' && ch<= 'Z')||(ch >= 'a' && ch<= 'z');
		boolean uc = (ch >= 'A' && ch<= 'Z');
		boolean lc = (ch >= 'a' && ch<= 'z');
		boolean ucv = (ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U');
		boolean lcv = (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u');
		boolean dig= (ch >= '0' && ch<= '9');
		
		String res = alp
        ? "Alphabet " + (uc
            ? "Upper " + (ucv ? "Case Vowel" : "Consonant")
            : "Lower " + (lcv ? "Case Vowel" : "Consonant"))
        : (dig ? "Digit" : "Special Character");
		System.out.println("Input is: "+res);
		 
	}
}