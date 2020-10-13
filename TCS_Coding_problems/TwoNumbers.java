/*
Q 3. Find 2 numbers in a given array
     
     Write a program to find two numbers and print their index else print -1.
 
    Input (stdin) :5
                   {3,6,7,8,9}
                   7
                   9
    Output (stdout):  Element 1 index = 2
                      Element 2 index = 4
*/

import java.util.Scanner;

class TwoNumbers{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of the array: ");
		int len = sc.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter the array: ");
		for(int i=0; i<len; i++){
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the 1st number: ");
		int num1 = sc.nextInt();

		System.out.println("Enter the 2nd number: ");
		int num2 = sc.nextInt();

		System.out.println(getIndex(arr, num1));
		System.out.println(getIndex(arr, num2));
	}

	static int getIndex(int[] arr, int num){
		// if(arr.length == 0) return -1;
		for(int i=0; i<arr.length; i++){
			if(arr[i] == num) return i;
		}

		return -1;
	}
}
