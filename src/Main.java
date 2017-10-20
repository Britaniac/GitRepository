import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		int n = 6;
		double[][] matrix = new double[n][n];
		Random rnd = new Random();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				double x = rnd.nextDouble()*n*2 - n;
				matrix[i][j] = Math.rint(10.0 * x) / 10.0;
			}
			System.out.println(Arrays.toString(matrix[i]));
		}
		
		System.out.println();
		
		for (double[] row : matrix) {
			double sum = 0;
			for (double num : row) {
				sum += num;
			}
			double med = sum / (n*n);
			med = Math.rint(10.0*med)/10.0;
			System.out.println(med);
			for (int i = 0; i < row.length; i++) {
				row[i] = row[i] - med;
			}
			System.out.println(Arrays.toString(row));
		}
		
		System.out.println();
		
		//test
		//bla bla bla

	}

}
