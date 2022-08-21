import java.util.*;
import java.lang.*;
import java.io.*;


class Main{
   static int max = 0;
   public static void dfs(char[][] board,int row,int col,boolean[][] visited){
       int count = 0;
       Stack<int[]> stack = new Stack<>();
       int[] arr = new int[2];
       arr[0] = row;
       arr[1] = col;
       stack.push(arr);
       while(!stack.isEmpty()){
           int[] temp = stack.pop();
           int current_row = temp[0];
           int current_col = temp[1];
           if (visited[current_row][current_col] == false){
               count++;
               visited[current_row][current_col] = true;
               if (current_row - 1 >= 0 && board[current_row - 1][current_col] == 'T'){
                   int[] new_arr = new int[2];
                   new_arr[0] = current_row - 1;
                   new_arr[1] = current_col;
                   stack.push(new_arr);
               }
               if (current_row + 1 < board.length && board[current_row + 1][current_col] == 'T'){
                   int[] new_arr = new int[2];
                   new_arr[0] = current_row + 1;
                   new_arr[1] = current_col;
                   stack.push(new_arr);
               }
               if (current_col - 1 >= 0 && board[current_row][current_col-1] == 'T'){
                   int[] new_arr = new int[2];
                   new_arr[0] = current_row;
                   new_arr[1] = current_col-1;
                   stack.push(new_arr);
               }
               if (current_col + 1 < board.length && board[current_row][current_col + 1] == 'T'){
                   int[] new_arr = new int[2];
                   new_arr[0] = current_row;
                   new_arr[1] = current_col + 1;
                   stack.push(new_arr);
               }
           }
       }
       max = Math.max(max,count);
       return;
   }
   public static void solve(char[][] board,boolean[][] visited){
       for (int i = 0;i<board.length;i++){
           for (int j = 0;j<board.length;j++){
               if (board[i][j] == 'T' && visited[i][j] == false){
                   dfs(board,i,j,visited);
               }
           }
       }
   }
   public static void main(String[] args){
       Scanner s = new Scanner(System.in);
       int n = s.nextInt();
       // input
       char[][] board = new char[n][n];
       for (int i = 0;i<n;i++){
           board[i] = s.next().toCharArray();
       }
       // visitd array to keep track of the cells already visited
       boolean[][] visited = new boolean[n][n];
       solve(board,visited);
       System.out.println(max);
   }


//with recursion
/*
 public static int solve(char[][] grid,int i,int j){
   if (i < 0 || i>=grid.length || j<0 || j>= grid[i].length || grid[i][j] == 'W') return 0;
   int count = 1;
   grid[i][j] = 'W';
   count += solve(grid,i+1,j);
   count += solve(grid,i-1,j);
   count += solve(grid,i,j+1);
   count += solve(grid,i,j-1);
   //grid[i][j] = 'T';
   return count;
 }
 public static void main(String[] args){
   Scanner s = new Scanner(System.in);
   int n = s.nextInt();
   char[][] grid = new char[n][n];
   for (int i=0;i<n;i++){
     String temp = s.next();
     grid[i] = temp.toCharArray();
   }
   int max = 0;
   for (int i=0;i<n;i++){
     for (int j=0;j<n;j++){
       if (grid[i][j] == 'T'){
           int count = solve(grid,i,j);
           max = Math.max(count,max);
       }
     }
   }
   System.out.println(max);
 }
*/



}
