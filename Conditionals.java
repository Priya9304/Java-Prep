import java.util.Scanner;

class Conditionals {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);

        boolean alp = (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
        boolean uc = (ch >= 'A' && ch <= 'Z');
        boolean lc = (ch >= 'a' && ch <= 'z');
        boolean ucv = (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
        boolean lcv = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u');
        boolean dig = (ch >= '0' && ch <= '9');

        if (alp) {
            System.out.println("Alphabet");
            if (uc) {
                System.out.println("Uppercase");
                if (ucv) {
                    System.out.println("Uppercase Vowel");
                } else {
                    System.out.println("Uppercase Consonant");
                }
            } else if (lc) {
                System.out.println("Lowercase");

                if (lcv) {
                    System.out.println("Lowercase Vowel");
                } else {
                    System.out.println("Lowercase Consonant");
                }
            }
        } else if (dig) {
            System.out.println("Digit");
        } else {
            System.out.println("Special Character");
        }
    }
}