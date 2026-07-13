class Concatenation{
	public static void main(String[] args){
		//	This line do not add 14 and 3 because from the left string concatenation is present t=so it also concatenate 14 and 3
		System.out.println("Hello "+"World "+14+3);//Hello World 143
		System.out.println("Hello"+"world "+(14+3));//Helloworld 17
		System.out.println(14+3+" Hello "+"World");//17 Hello World
		
	
	}
}