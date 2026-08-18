import java.util.*;

class MinSizeSubarraySum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
		int left=0;
		int sum = 0;
		int min = Integer.MAX_VALUE;
		
		for(int right=0;right<arr.length;right++){
			sum += arr[right];
			
			while(sum>=k){
			int currentLength = right - left + 1;
				if(currentLength<min){
					min = currentLength;
				}
				sum -= arr[left];
				left++;
			}
		}
		System.out.println(min);
    }
}