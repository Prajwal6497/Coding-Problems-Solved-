import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;


class PairSum{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lenght of the array: ");
		int N = sc.nextInt();

		int arr[] = new int[N];

		System.out.println("Enter the array: ");
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}
		System.out.println("Enter the sum: ");
		int sum = sc.nextInt();

		getElements(arr, sum);
	}

	//Time complexity - ?
	//Space complexity - ?
	static void getElements(int[] arr, int sum){
		HashSet<Integer> set = new HashSet<>();

		for(int i=0; i<arr.length; i++){
			if(set.contains(sum - arr[i])){
				System.out.println(arr[i] + " " + (sum - arr[i]));
				break;
			}else
				set.add(arr[i]);

		}
	}



	//O(n logn)
	/*static void getElements(int[] arr, int sum){
		Arrays.sort(arr);	//O(n logn)

		int left = 0;
		int right = arr.length - 1;

		while(left < right){		//O(n)
			int curr_sum = arr[left] + arr[right];
			if(curr_sum > sum)
				right--;
			else if(curr_sum < sum)
				left++;
			else{
				System.out.println(arr[left] + " "+ arr[right]);
				break;
			}
		}
	}*/
}
