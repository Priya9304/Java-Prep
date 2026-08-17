import java.util.*;
class FrequencyRange{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] freq = new int[26];
		int min = Integer.MAX_VALUE;
		int max = -1;
		char minch = ' ';
		char maxch = ' ';
		
		for(int i=0; i<s.length(); i++){
			freq[s.charAt(i) - 'a']++;
		}
		
		for(int i = 0; i < 26; i++) {
			if(freq[i] > 0) {

				if(freq[i] < min) {
					min = freq[i];
					minch = (char)(i + 'a');
				}

				if(freq[i] > max) {
					max = freq[i];
					maxch = (char)(i + 'a');
				}
			}
		}
		System.out.println(min);
		System.out.println(minch);
		System.out.println(max);
		System.out.println(maxch);
	}
}