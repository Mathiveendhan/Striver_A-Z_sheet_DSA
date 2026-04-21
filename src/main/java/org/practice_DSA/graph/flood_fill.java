package org.practice_DSA.graph;

public class flood_fill {
        public static void DFS(int[][] image,int r,int c,int newColor,int changeColor){
            image[r][c]=newColor;
            int[] dr={1,0,0,-1};
            int[] dc={0,-1,1,0};

            for(int i=0;i<dr.length;i++){
                int row=r+dr[i];
                int col=dc[i]+c;
                if(row>=0 && col>=0 && row<image.length && col<image[0].length && image[row][col]==changeColor) {
                    DFS(image,row,col,newColor,changeColor);
                }
            }
        }
        public static void main(String[] args) {
            int[][] input = {
                    {1, 1, 1},
                    {1, 1, 0},
                    {1, 0, 1}
            };

            int[][] image=input;
            int sr=1,sc=1,newColor=2;
            int changeColor=image[sr][sc];
            DFS(image,sr,sc,newColor,changeColor);

            for(int[] x:image){
                for(int y:x){
                    System.out.print(y+" ");
                }
                System.out.println();
            }
        }
}
