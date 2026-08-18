import java.util.*;

class LongestAtMostKDistinct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();

        int[] freq = new int[26];

        int left = 0;
        int distinct = 0;
        int max = -1;

        // your sliding window
		for(int right=0; right<s.length(); right++){
			freq[s.charAt(right)-'a']++;
			
			if(freq[s.charAt(right)-'a']==1){
				distinct++;
			}
			
			while(distinct>k){
				freq[s.charAt(left)-'a']--;
				if(freq[s.charAt(left)-'a']==0){
					distinct--;
				}
				left++;
			}
			int currentLength = right - left + 1;
			if(currentLength>max){
				max = currentLength;
			}
		}
		System.out.println(max);
    }
}