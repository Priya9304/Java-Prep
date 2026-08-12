import java.util.*;

class RemoveDuplicates{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String res = "";
		
		for(int i =0; i<str.length(); i++){
			boolean isVisited = false;
			
			for(int k = 0; k<i; k++){
				if(str.charAt(i)==str.charAt(k)){
					isVisited = true;
					break;
				}
			}
			if(!isVisited){
				res+=str.charAt(i);
			}
		}
		System.out.println(res);
	}
}