import java.util.*;
class reverseWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] word = s.split(" ");//this will split the sentence where space comes
		String rev = "";
		
		for(int i = 0; i<word.length;i++){
			for(int j=word[i].length()-1; j>=0; j--){
			rev+=word[i].charAt(j);
		}
			rev += " ";
		}
		System.out.println(rev);
	}
}
