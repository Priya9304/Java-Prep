import java.util.*;

class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        for(int i = 0; i < str.length(); i++) {

            boolean isVisited = false;

            // Check whether character was already processed
            for(int k = 0; k < i; k++) {

                if(str.charAt(i) == str.charAt(k)) {
                    isVisited = true;
                    break;
                }
            }

            if(isVisited) {
                continue;
            }

            // Count frequency
            int count = 1;

            for(int j = i + 1; j < str.length(); j++) {

                if(str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }

            // First character with frequency 1
            if(count == 1) {
                System.out.println(str.charAt(i));
                return;
            }
        }

        System.out.println("No non repeating character");
    }
}