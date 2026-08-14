
import java.util.*;

class MaxFrequencyCharacter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] freq = new int[26];
		
		for(int i=0; i<s.length(); i++){
			freq[s.charAt(i)-'a']++;
		}
		
		int max = -1;
		String res = "";
		 for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] > max) {
				max = freq[s.charAt(i) - 'a'];
                res = ""+s.charAt(i);
			}	
        }
		System.out.println(res);
	}
}
