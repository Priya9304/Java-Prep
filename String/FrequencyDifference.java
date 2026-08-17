import java.util.*;
class FrequencyDifference{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] freq = new int[26];
		
		for(int i=0; i<s.length(); i++){
			freq[s.charAt(i)-'a']++;
		}
		int min = Integer.MAX_VALUE;
		 for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] <min) {
				min = freq[s.charAt(i) - 'a'];
			}	
        }
		int max = -1;
		 for(int i = 0; i < s.length(); i++) {
            if(freq[s.charAt(i) - 'a'] > max) {
				max = freq[s.charAt(i) - 'a'];
			}	
        }
		System.out.println(max-min);
	}
}
