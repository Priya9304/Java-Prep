import java.util.*;

class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		
		int left = 0;
		int right = s.length()-1;
		
		while (left<right){
			if(s.charAt(left) != s.charAt(right)){
				System.out.println("Not a palindrome");
				return;
			}
			left++;
			right--;
		}
        System.out.println("Palindrome");
    }
}