import java.util.*;

class FreqEveryCharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();		
		for(int i=0; i<s.length(); i++){
			 boolean isVisited = false;

            for(int k = 0; k < i; k++) {

                if(s.charAt(i) == s.charAt(k)) {
                    isVisited = true;
                    break;
                }
            }
            // If already processed, skip it
            if(isVisited) {
                continue;
            }
			int count = 1;
			for(int j=i+1;j<s.length(); j++){
				if(s.charAt(i)==s.charAt(j)){
					isVisited = true;
					count++;
				}
			}
			System.out.println(s.charAt(i) + " = " + count);
		}
    }
}