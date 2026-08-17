import java.util.*;

class MaxVowelsFixedWindow{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int k = sc.nextInt();
		int count = 0;
		int max = 0;

        for(int i=0; i<k;i++){
			char ch = s.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
				count++;
			}
		}
		
		max = count;
		
		for(int i = k; i<s.length(); i++){
			char out = s.charAt(i - k);
			char in = s.charAt(i);
			
			if(out == 'a' || out == 'e' || out == 'i' || out == 'o' || out == 'u'){
				count--;
			}
			
			if(in == 'a' || in == 'e' || in == 'i' || in == 'o' || in == 'u'){
				count++;
			}
			
			if(count>max){
				max = count;
			}
		}
		System.out.println(max);
    }
}