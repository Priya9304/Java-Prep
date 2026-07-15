import java.util.Scanner;
class Switch{
	public static void main(String[] args){
		String fn=null;
		double fp=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		switch(sc.nextInt()){
				case 1:{
					fn = "Vegmomos";
					fp = 60;
				}
					break;
				case 2:{
					fn = "Pizzaaaaaaaaa";
					fp = 260;
				}
					break;
				case 3:{
					fn = "Coldrink";
					fp = 20;
				}
					break;
				default:
					System.out.println("No Available in Menu");
			}
			
			int qty = 2;
			double total = fp*qty;
			System.out.println(fn);
			System.out.println(fp);
			System.out.println(total);
	}
}