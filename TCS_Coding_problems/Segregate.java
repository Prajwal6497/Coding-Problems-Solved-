import java.util.Scanner;

class Segregate0_1{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the length of the array you want: ");
		int len = sc.nextInt();

		System.out.println("Input the array: ");
		
		int[] arr = new int[len];

		for(int i=0; i<len; i++){
			arr[i] = sc.nextInt();
		}

		arr = segregate(arr, len);

		for(int i=0; i<len; i++){
			System.out.print(arr[i] + " ");
		}
	}

	static int[] segregate(int[] arr, int len){
		int left = 0;
		int right = len - 1;

		while(left < right){
			while(arr[left] == 0 && left < right) left++;

			while(arr[right] == 1 && left < right) right--;

			if(left < right){
				arr[left++] = 0;
				arr[right--] = 1;
			}
		}

		return arr;
	}
}
