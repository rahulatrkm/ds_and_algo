class Solution {
    public int oddCells(int n, int m, int[][] indices) {
        int count = 0;
        int row[] = new int[n];
        int col[] = new int[m];
        for(int i = 0; i < indices.length; i++) {
            row[indices[i][0]]++;
            col[indices[i][1]]++;
        }
        
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if((row[i]+col[j])%2 != 0)
                    count++;
            }
        }

        return count;
    }
}
