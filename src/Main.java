import analysis.basics.matrix.MatrixTraversal;
import analysis.basics.random.RandomInteger;
import analysis.basics.strings.ReverseString;

public class Main {
	public static void main(String args[]) {
		String str = "ABCD";
		ReverseString rs = new ReverseString(str);
		System.out.println(rs.getReversedString());
		
		int N = 4;
		int[][] matrix = new int[N][N];
		for(int i = 0; i < N; i++) {
			RandomInteger random = new RandomInteger(N, 1, 10);
			for(int j = 0; j < N; j++) {
				matrix[i][j] = random.getRandomNumber()[j];
			}
		}
		
		matrix[0][0] = 8;
		matrix[1][0] = 5;
		matrix[2][0] = 8;
		matrix[3][0] = 1;
		
		matrix[0][1] = 1;
		matrix[1][1] = 7;
		matrix[2][1] = 7;
		matrix[3][1] = 8;
		
		matrix[0][2] = 7;
		matrix[1][2] = 10;
		matrix[2][2] = 9;
		matrix[3][2] = 1;
		
		matrix[0][3] = 3;
		matrix[1][3] = 9;
		matrix[2][3] = 5;
		matrix[3][3] = 6;
		
		System.out.println("### Original Matrix ###");
		
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
		
		MatrixTraversal mt = new MatrixTraversal(N, matrix);
		
		System.out.println("### Accumulated Cost Matrix ###");
		mt.printAccumulatedCostMatrix();
		
		System.out.println("### Cost ###");
		System.out.println(mt.getCost());
		
		System.out.println("### Print Traversal ###");
		mt.printTraversalPath(matrix);
	}
}
