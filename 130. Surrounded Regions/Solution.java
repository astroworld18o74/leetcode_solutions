class Solution {
    public void solve(char[][] board) {
        if(board==null || board.length==0)return ;
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++)
                if(i==0||i==board.length-1||j==0||j==board[0].length-1)
                    if(board[i][j]=='O')fn(board,i,j);
        for(int i=0;i<board.length;i++)
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='*')board[i][j]='O';
                else board[i][j]='X';
            }
        return;
    }
    public void fn(char[][] board,int i,int j){
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)return;
        if(board[i][j]=='X' || board[i][j]=='*')return;
        board[i][j]='*';
        if(i+1<board.length)
            fn(board,i+1,j);
        if(i-1>0)
            fn(board,i-1,j);
        if(j+1<board[0].length)
            fn(board,i,j+1);
        if(j-1>0)
            fn(board,i,j-1);
        return;
    }
}
