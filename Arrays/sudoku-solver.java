class Solution {
    public void solveSudoku(char[][] board) {
        
        solve(board,0,0);
    }
    public static boolean solve(char[][] board, int row, int col)
    {
        
        if(row==board.length)
            return true;
        
        int new_row=0;
        int new_col=0;
        
        if(col==8)
        {
            new_row=row+1;
            new_col=0;
        }
        else
        {
            new_row=row;
            new_col=col+1;            
        }
        
        if(board[row][col]!='.')
        {
            if(solve(board,new_row,new_col))
                return true;
        }
        else{
            for(int i=1;i<=9;i++)
            {
                if(isValid(board,row,col,i))
                {
                    
                    board[row][col]=(char)(i+ '0');
                    if(solve(board,new_row,new_col))
                        return true;
                    board[row][col]='.';
                }
            }
        }
        
        return false;
    }
    public static boolean isValid(char[][] board, int row, int col, int num)
    {
        for(int i=0;i<board.length;i++)
        {
            if(board[row][i]==(char)(num+'0'))
                return false;
            if(board[i][col]==(char)(num+'0'))
                return false;
        }

        row=(row/3)*3;
        col=(col/3)*3;
        
        for(int i=row;i<row+3;i++)
        {
            for(int j=col;j<col+3;j++)
            {
                if(board[i][j]==(char)(num+'0'))
                    return false;
            }
        }
        return true;
    }
}
