import java.util.*;

class StringRotation{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String s1 = sc.nextLine();
		String s2 = sc.nextLine();
		
		if(s1.length() != s2.length()) {
			System.out.println("Not Rotation");
			return;
		}
		String res = s1 + s1;
		if(res.contains(s2)){
			System.out.println("Rotation");
		}else{
			System.out.println("Not Rotation");
		}
	}
}