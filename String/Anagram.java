import java.util.*;

class Anagram {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Anagram");
			return;
		}
        for(int i=0; i<s1.length();i++){
			int count1 = 0;
			int count2 = 0;
			
			for(int j=0; j<s1.length();j++){
				if(s1.charAt(i)==s1.charAt(j)){
					count1++;
				}
			}
			
			for(int j=0;j<s2.length();j++){
				if(s1.charAt(i)==s2.charAt(j)){
					count2++;
				}
			}
			if(count1!=count2){
				System.out.println("Not Anagram");
				return;
			}
		}
		System.out.println("Anagram");
    }
}