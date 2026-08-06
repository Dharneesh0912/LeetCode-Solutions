// Last updated: 8/6/2026, 12:00:29 PM
class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < matrix.length; i++) {

            int min = matrix[i][0];
            int index = 0;

            // Find minimum in the row
            for (int j = 1; j < matrix[i].length; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                    index = j;
                }
            }

            boolean flag = true;

            // Check if it is maximum in its column
            for (int k = 0; k < matrix.length; k++) {
                if (matrix[k][index] > min) {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                arr.add(min);
            }
        }

        return arr;
    }
}