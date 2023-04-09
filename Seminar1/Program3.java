package Seminar1;

public class Program3 {
    private static int sumMatrix(int[][] matrix) throws RuntimeException, NullPointerException{
        if(matrix == null) {
            throw new NullPointerException("matrix was null");
        }
        if(matrix.length == 0) {
            throw new RuntimeException("matrix was empty");
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if(matrix[i].length != matrix.length) {
                    throw new RuntimeException("matrix must be square");
                }
                sum += matrix[i][j];
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] matrix = null;
        try {
            System.out.println(String.format("Sum of matrix: %d", sumMatrix(matrix)));
        } catch(Exception ex) {
            System.err.println(String.format("Error was occured. %s", ex.getMessage()));
        }
    }
}
