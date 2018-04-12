package analysis.basics.matrix;

public class MatrixTraversal {
	
	private int cost;
	private int N;
	private int[][] accumulatedCost;
	
	public MatrixTraversal(int N, int[][] matrix) {
		this.cost = 0;
		this.N = N;
		accumulatedCost = new int[N][N];
		
		cost = cost(matrix, N-1, N-1);
		
	}
	
	private int cost(int[][] matrix, int i, int j) {
		if(i == 0 && j == 0) {
			accumulatedCost[0][0] = matrix[0][0];
			return matrix[0][0];
		}
			
		if(i == 0) {
			accumulatedCost[0][j] = cost(matrix, 0, j-1) + matrix[0][j];
			return cost(matrix, 0, j-1) + matrix[0][j];
		}
		
		if(j == 0) {
			accumulatedCost[i][0] = cost(matrix, i-1, 0) + matrix[i][0];
			return cost(matrix, i-1, 0) + matrix[i][0];
		}
		
		accumulatedCost[i][j] = (Math.max(cost(matrix, i-1, j),  cost(matrix,i,j-1)) + matrix[i][j]);
		return (Math.max(cost(matrix, i-1, j),  cost(matrix,i,j-1)) + matrix[i][j]);
	}
	
	public int getCost() {
		return cost;
	}
	
	public void printTraversalPath(int[][] matrix) {
		boolean isStart = false;
		int i = N - 1;
		int j = N - 1;
		
		while(!isStart) {
			if(i == 0 && j == 0) {
				isStart = true;
			}
			
			System.out.println(i + ", " + j + ": " + matrix[i][j]);
			
			if(i == 0) {
				j--;
			}else if(j == 0) {
				i--;
			}else if(accumulatedCost[i-1][j] > accumulatedCost[i][j-1]) {
				i--;
			}else {
				j--;
			}
		}
	}
	
	public void printAccumulatedCostMatrix() {
		for(int i = 0; i < N; i++) {
			for(int j = 0; j < N; j++) {
				System.out.print(accumulatedCost[i][j] + " ");
			}
			System.out.println("");
		}
	}
	
	public int[][] getAccumulatedCostMatrix() {
		return accumulatedCost;
	}
}
