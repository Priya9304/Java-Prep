import java.util.*;
class MinFrequencyCharacter{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] freq = new int[26];
		
		for(int i=0; i<s.length(); i++){
			freq[s.charAt(i)-'a']++;
		}
		int min = Integer.MAX_VALUE;
		String res = "";
		 for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] <min) {
				min = freq[s.charAt(i) - 'a'];
                res = ""+s.charAt(i);
			}	
        }
		System.out.println(res);
	}
}
