class Solution {
    public void rotate(int[][] matrix) {
        List<Integer> list=new ArrayList<>();
        int index=0;
        for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[0].length;j++){
                list.add(matrix[i][j]);  
           }
        }
        for(int i=0;i<matrix.length;i++){
              for(int j=0;j<matrix[0].length;j++){
                list.add(matrix[i][j]);  
                matrix[j][matrix.length-1-i]=list.get(index);
                index++;
           }
        }
    }
}
