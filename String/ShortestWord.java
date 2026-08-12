import java.util.*;

class ShortestWord{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] words = s.split(" ");
		int min = 100;
		String minword = "";
		for(int i=0; i<words.length;i++){
			if(words[i].length()<min){
				min = words[i].length();
				minword = words[i];
			}
		}
		System.out.println(minword);
	}
}