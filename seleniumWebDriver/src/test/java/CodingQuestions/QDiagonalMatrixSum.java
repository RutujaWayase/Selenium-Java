package CodingQuestions;

import java.util.Scanner;

public class QDiagonalMatrixSum {


	public static void main(String[] args) {
	    
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows: ");
		int rows = sc.nextInt();
		System.out.println("Enter no. of columns: ");
		int columns = sc.nextInt();
		System.out.println("Enter elements: ");
		int[][] matrix = new int[rows][columns];
		for(int i=0; i<rows; i++){
		    for(int j=0; j<columns; j++){
		        matrix[i][j] = sc.nextInt();
		        
		    }
		    
		}
		int diagonalSum = getMatrixDiagonal(matrix);
		//System.out.println("DiagonalSum is: " + diagonalsum1);
		
		
	//	int a[] = {1, 2, 3};
	//	int b[]
		
	}
	public static int getMatrixDiagonal(int[][] matrix){
	    int n = matrix.length;
	    int diagonalsum1 = 0;
	    for(int i=0; i<n; i++){
	        diagonalsum1 = diagonalsum1+matrix[i][i];
	    }
	    System.out.println("DiagonalSum is: " + diagonalsum1);
	    return diagonalsum1;
	    
	}


    
}

