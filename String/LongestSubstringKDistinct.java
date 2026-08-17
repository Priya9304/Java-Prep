import java.util.*;

class LongestSubstringKDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        int left = 0;
        int max = 0;
        int start = 0;
        int distinct = 0;

        int[] freq = new int[26];

        for(int right=0; right<s.length(); right++){
			freq[s.charAt(right)-'a']++;
			
			if(freq[s.charAt(right) - 'a']==1){
				distinct++;
			}
			while(distinct>k){
				freq[s.charAt(left)-'a']--;
				if(freq[s.charAt(left) - 'a'] == 0) {
					distinct--;
				}
				left++;
			}
			
			int length = right - left + 1;
			if(length>max){
				max = length;
				start = left;
			}
		}
		System.out.println(s.substring(start,start+max)+ " " + max);
    }
}