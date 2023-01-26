class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int r1 = 0;
        int r2 = matrix.length - 1;
        int c1 = 0;
        int c2 = matrix[0].length - 1;
        List<Integer> list = new ArrayList<>();
        while(r1 <= r2 && c1 <= c2) {
            for (int col = c1; col <= c2; col++) {
                list.add(matrix[r1][col]);
            }
            for (int row = r1 + 1; row <= r2; row++) {
                list.add(matrix[row][c2]);
            }
            if (r1 < r2 && c1 < c2) {
                for (int col = c2 - 1; col >= c1 + 1; col--) {
                list.add(matrix[r2][col]);
            }    
                for (int row = r2; row >= r1 + 1; row--) {
                list.add(matrix[row][c1]);
            }
            }
            
            
            r1++;
            r2--;
            c1++;
            c2--;
        }
        return list;
    }
}