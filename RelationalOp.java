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
		boolean dig= (ch >= '0' && ch<= '9');
		
		String res = alp?"Alphabet"+(uc?"upper":"lower"):(dig?"Digit":"Speacial Char");
		System.out.println("Input is: "+res);
		 
	}
}
		
	}
}