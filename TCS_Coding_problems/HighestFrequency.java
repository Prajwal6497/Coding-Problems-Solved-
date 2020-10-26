import java.util.Scanner;

class HighestFrequency{
	static final int ASCII_SIZE = 256;
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string: ");
		String str = sc.nextLine();

		highestFrequency(str);
	}

	static void highestFrequency(String str){
		int[] count = new int[ASCII_SIZE];

		for(int i=0; i<str.length(); i++){
			count[str.charAt(i)]++;
		}

		int max = -1;
		char result = ' ';

		for(int i=0; i<str.length(); i++){
			if(max < count[str.charAt(i)]){
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}

		System.out.println("Maximum occuring character is '"+ result +"' = "+ max + "times");

	}
}
