import java.util.*;

class LongestUniqueSubstring{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int left = 0;
		int max = 0;
		int[] freq = new int[26];
		
		for(int right = 1; right<s.length(); right++){
			freq[s.charAt(right)-'a']++;
			
			while(freq[s.charAt(right)-'a']>1){
				freq[s.charAt(left)-'a']--;
				left++;
			}
			
			int length = right - left + 1;
			max = Math.max(max,length);
		}
		System.out.println(max);
	}
}