import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class UniqueElements{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the size of the array: ");
		int N = sc.nextInt();
		int[] arr = new int[N];
		
		System.out.println("Enter the array: ");
		for(int i=0; i<N; i++){
			arr[i] = sc.nextInt();
		}

		uniqueElements(arr);
	}

	static void uniqueElements(int[] arr){
		HashMap<Integer, Integer> map = new HashMap<>();

		for(int i=0; i<arr.length; i++){
			map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
		}

		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1) 
				System.out.println("The Unique Element is: " + entry.getKey());
		}
	}
}
