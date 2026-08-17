import java.util.*;
class SecondHighestFrequency{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int[] freq = new int[26];
		
		for(int i=0; i<s.length(); i++){
			freq[s.charAt(i)-'a']++;
		}
		
		int max = -1;
		int secMax = -1;
		
		char maxChar = ' ';
		char secondChar = ' ';
		
		for(int i = 0; i < 26; i++) {
			if(freq[i] > 0) {
				if(freq[i] > max) {
					secMax = max;
					secondChar = maxChar;
					 
					max = freq[i];
					maxChar = (char)(i + 'a');

					secondChar = maxChar;
					maxChar = (char)(i + 'a');
				} else if(freq[i] > secMax) {
						secMax = freq[i];
						secondChar = (char)(i + 'a');
					}
			}
		}
		System.out.println(maxChar+" "+max);
		System.out.println(secondChar+" "+secMax);
		
	}
}
