import java.util.Scanner;

class AddMatrix{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);


		System.out.println("Enter the number of rows: ");
		int m = sc.nextInt();

		System.out.println("Enter the number of columns: ");
		int n = sc.nextInt();

		int[][] matrix1 = new int[m][n];

		System.out.println("Enter the 1st matrix: ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix1[i][j] = sc.nextInt();
			}
		}

		int[][] matrix2 = new int[m][n];
		System.out.println("Enter the 2nd matrix: ");
		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				matrix2[i][j] = sc.nextInt();
			}
		}

		int[][] ans = addMatrix(matrix1, matrix2, m, n);

		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}

	}

	static int[][] addMatrix(int[][] matrix1, int[][] matrix2, int m, int n){
		int[][] ans = new int[m][n];

		for(int i=0; i<m; i++){
			for(int j=0; j<n; j++){
				ans[i][j] = matrix1[i][j] + matrix2[i][j];
			}
		}

		return ans;
	}
}
