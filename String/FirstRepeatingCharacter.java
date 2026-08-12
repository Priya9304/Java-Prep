import java.util.*;

class FirstRepeatingCharacter{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		
		for(int i=0; i<str.length();i++){
			boolean isVisited = false;
			
			for(int k=0; k<i; k++){
				if(str.charAt(i)==str.charAt(k)){
					isVisited = true;
					break;
				}
			}
			if(isVisited){
				continue;
			}
			int count = 1;
				
			for(int j=i+1; j<str.length();j++){
				if(str.charAt(i)==str.charAt(j)){
					count++;
				}
			}
			if(count>1){
				System.out.println(str.charAt(i)+" "+count);
				return;
			}
		}
		System.out.println("No Repeating character");
	}
}