import java.util.*;

class WordFrequency{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		String s = sc.nextLine();
		String words[] = s.split(" ");
		
		for(int i=0; i<words.length; i++){
			
			boolean isVisited = false;

			for(int k = 0; k < i; k++) {
				if(words[i].equals(words[k])) {
				isVisited = true;
				break;
			}
		}	
			if(isVisited) {
				continue;
			}
			int count = 1;
			for(int j=i+1; j<words.length;j++){
				if(words[i].equals(words[j])){
					count++;
				}
			}
			System.out.println(words[i]+" "+count);
		}
	}
}