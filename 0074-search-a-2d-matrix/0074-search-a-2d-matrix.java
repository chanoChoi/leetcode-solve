class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) return false;
        int row = 0;
        int high = matrix.length - 1;
        int targetRowIndex = -1;
        while (row <= high) {
            int mid = row + (high - row) / 2;
            if (matrix[mid][matrix[0].length - 1] == target) {
                return true;
            } else if (matrix[mid][matrix[0].length - 1] < target) {
                row = mid + 1;
            } else {
                targetRowIndex = mid;
                high = mid - 1;
            }
        }
        if (targetRowIndex == -1) {
            return false;
        }
        row = 0;
        high = matrix[0].length - 1;
        while (row <= high) {
            int mid = row + (high - row) / 2;
            if (matrix[targetRowIndex][mid] == target) {
                return true;
            }
            if (matrix[targetRowIndex][mid] < target) {
                row = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}