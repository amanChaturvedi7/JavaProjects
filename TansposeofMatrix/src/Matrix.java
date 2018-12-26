import java.util.Scanner;

public class Matrix {
	public static void main(String[] args){
		int row, col;
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter no. of rows of matrix: ");
		row = s.nextInt();
		
		System.out.println("Enter no. of columns of matrix: ");
		col = s.nextInt();
		
		int a[][] = new int[row][col];

		System.out.println("Enter elements of matrix: ");
		
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				a[i][j] = s.nextInt();
				}
		}
		
		System.out.println("The Real Matrix:");
		
		for(int i = 0; i<row; i++){
			for(int j = 0; j<col; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println("");
		}
		
		
	}
}
