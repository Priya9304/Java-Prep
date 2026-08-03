import java.util.*;

class MinElem{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Array Size");
		
		int arr_Size = sc.nextInt();
		int[] arr = new int[arr_Size];
		
		for(int i=0; i<arr_Size; i++){
			arr[i] = sc.nextInt();
		}
		if (arr_Size == 0) {
			System.out.println("Array is empty");
			return;
		}
		int min = arr[0];
		
		for(int i=1;i<arr_Size;i++){
			if(arr[i]<min){
				min = arr[i];
			}
		}
		System.out.println(min);
	}
}