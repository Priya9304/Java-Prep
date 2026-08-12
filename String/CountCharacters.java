import java.util.*;

class CountCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
		int letter = 0;
		int digit = 0;
		int spc = 0;
		for(int i=0; i<s.length(); i++){
			char ch = s.charAt(i);
			if((ch>='a' && ch<='z') || (ch>='A' && ch<='Z')){
				letter++;
			}else if(ch>='0' && ch<='9'){
				digit++;
			}else{
				spc++;
			}
		}
		System.out.println("Letters "+ letter);
		System.out.println("Digits "+ digit);
		System.out.println("Special Character "+ spc);
    }
}