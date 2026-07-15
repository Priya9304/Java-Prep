class Loop3{
	public static void main(String[] args){
		int i=1;
		for(;i<=2;i++){
			System.out.println(i);
		}
		System.out.println("\n-------------------");
		
		int j;
		for(j=4;j<=6;j+=1){
			System.out.print(j+" ");
		}
		System.out.println("\n-------------------");
		
		for(int k=5;k>=1;k=k-1){
			System.out.print(k+" ");
		}
	}
}