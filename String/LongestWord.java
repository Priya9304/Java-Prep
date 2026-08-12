import java.util.*;

class LongestWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int max = 0;
		String longest = "";
		
		String[] words = s.split(" ");
		for(int i=0; i<words.length;i++){
			if(words[i].length()>max){
				max = words[i].length();
				longest = words[i];
			}
		}
		System.out.println(longest);
	}
}