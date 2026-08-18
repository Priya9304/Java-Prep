import java.util.*;

class MinimumWindowSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        String t = sc.nextLine();

        int[] need = new int[26];
        int required = 0;

        // Count characters required from t
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'A';

            if (need[index] == 0) {
                required++;
            }

            need[index]++;
        }

        int[] window = new int[26];

        int left = 0;
        int formed = 0;

        // Variables to store minimum window
        int minLength = Integer.MAX_VALUE;
        int minLeft = 0;

        for (int right = 0; right < s.length(); right++) {

            // Add current character to window
            int index = s.charAt(right) - 'A';
            window[index]++;

            // A required character has reached its required frequency
            if (window[index] == need[index]) {
                formed++;
            }

            // Try shrinking the window
            while (formed == required) {

                // Check if current window is smaller
                if (right - left + 1 < minLength) {
                    minLength = right - left + 1;
                    minLeft = left;
                }

                // Remove left character
                int leftIndex = s.charAt(left) - 'A';
                window[leftIndex]--;

                // If removing it makes the window invalid
                if (window[leftIndex] < need[leftIndex]) {
                    formed--;
                }

                left++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println("");
        } else {
            System.out.println(s.substring(minLeft, minLeft + minLength));
        }

        sc.close();
    }
}