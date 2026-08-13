import java.util.*;

class ReverseEachWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String rev = " ";
		String[] words = s.split(" ");
		for(int i=0; i<words.length;i++){
			for(int j=words[i].length()-1; j>=0; j--){
				rev += words[i].charAt(j);
			}
			rev += " ";
		}
		System.out.println(rev);
	}
}