package org.practice_DSA.recursion;

public class sudoku_problem_backTracking {
        public static boolean isValid(char ch,char[][] board,int r,int c){
            for(int i=0;i<board[0].length;i++){
                if(ch==board[r][i]){
                    return false;
                }
            }

            for(int i=0;i<board[0].length;i++){
                if(ch==board[i][c]){
                    return false;
                }
            }

            for(int i=0;i<board[0].length;i++){
                if(board[3*(r/3)+(i/3)][3*(c/3)+(i%3)]==ch){
                    return false;
                }
            }
            return true;

        }
        public static boolean  call(char[][] board){
            for(int i=0;i<board.length;i++){
                for(int j=0;j<board[0].length;j++){
                    if(board[i][j]=='.'){
                        for(int c=1;c<=board[0].length;c++){
                            char ch=(char)(c+'0');
                            if(isValid(ch,board,i,j)){
                                board[i][j]=ch;
                                if(call(board)==true){
                                    return true;
                                }
                                board[i][j]='.';
                            }
                        }
                        return false;
                    }
                }
            }
            return true;
        }
        public static void printBoard(char[][] board) {
            for (int i = 0; i < 9; i++) {
                if (i % 3 == 0 && i != 0) {
                    System.out.println("------+-------+------");
                }
                for (int j = 0; j < 9; j++) {
                    if (j % 3 == 0 && j != 0) {
                        System.out.print("| ");
                    }
                    System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }
        public static void main(String[] args) {
            char[][] board = {
                    {'5','3','.','.','7','.','.','.','.'},
                    {'6','.','.','1','9','5','.','.','.'},
                    {'.','9','8','.','.','.','.','6','.'},
                    {'8','.','.','.','6','.','.','.','3'},
                    {'4','.','.','8','.','3','.','.','1'},
                    {'7','.','.','.','2','.','.','.','6'},
                    {'.','6','.','.','.','.','2','8','.'},
                    {'.','.','.','4','1','9','.','.','5'},
                    {'.','.','.','.','8','.','.','7','9'}
            };

            call(board);

            printBoard(board);
        }
}
