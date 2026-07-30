class Solution {
    public int maximalRectangle(char[][] matrix) {

        if(matrix.length == 0) return 0;

        int rows = matrix.length;
        int cols = matrix[0].length;

        int[][] width = new int[rows][cols];

        for(int i = 0; i < rows; i++) {
            for(int j = cols - 1; j >= 0; j--) {

                if(matrix[i][j] == '1') {
                    if(j == cols - 1)
                        width[i][j] = 1;
                    else
                        width[i][j] = width[i][j + 1] + 1;
                }
            }
        }

        int maxArea = 0;

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(matrix[i][j] == '0')
                    continue;

                int minWidth = Integer.MAX_VALUE;

                for(int k = i; k < rows && matrix[k][j] == '1'; k++) {

                    minWidth = Math.min(minWidth, width[k][j]);

                    int area = minWidth * (k - i + 1);

                    maxArea = Math.max(maxArea, area);
                }
            }
        }

        return maxArea;
    }
}