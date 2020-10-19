import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;


class DuplicateElement{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int N = sc.nextInt();
		int arr[] = new int[N];
		
		System.out.println("Entert the array: ");
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}

		printDuplicate(arr, N);
	}

	static void printDuplicate(int[] arr, int N){
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<N; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() == 2){
				System.out.print(entry.getKey() + " ");
			}
		}
	}

	/*static void printDuplicate(int[] arr, int N){
		Arrays.sort(arr);

		for(int i=0; i<N-1; i++){
			if(arr[i] == arr[i + 1]){
				System.out.print(arr[i] + " ");
				i++;
			}
		}
	}*/
}
