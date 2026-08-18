import java.util.*;

class LongestUniqueSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();

        int[] freq = new int[26];

        int left = 0;
        int max = 0;
        int start = 0;

        // your code
		for(int right=0; right<s.length();right++){
			freq[s.charAt(right)-'a']++;
			
			while(freq[s.charAt(right)-'a'] > 1){
				freq[s.charAt(left)-'a']--;
				left++;
			}
			int currentlength = right-left+1;
			if(currentlength>max){
				max = currentlength;
				start = left;
			}
		}
		System.out.println(s.substring(start,start+max)+ " "+ max);
    }
}