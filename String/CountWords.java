import java.util.*;

class CountWords{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		//String[] words = s.split(" "); it will not give proper output if multiple spcaes comes
		
		String[] words = s.trim().split("\\s+");
		System.out.println(words.length);
	}
}