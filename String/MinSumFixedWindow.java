import java.util.*;

class MinSumFixedWindow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		int sum = 0;
		for(int i=0; i<k; i++){
			sum += arr[i];
		}
		int min = sum;
		
		for(int i=k; i<arr.length;i++){
			sum += arr[i] - arr[i-k];
			
			if(sum<min){
				min = sum;
			}
		}
		System.out.println(min);
    }
}