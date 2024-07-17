package Graphs;
//Output  = 1;
public class NumberOfIsland {
  public static void main(String[] a){
    char[][] grid = {{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}};
    int result = numberOfIsland(grid);
    System.out.println(result);

  }
  private static int numberOfIsland(char[][] grid){
    int ans = 0;
    for(int i=0;i<grid.length;i++){
      for(int j=0;j<grid[i].length;j++){
        if(grid[i][j] == '1'){
          ans++;
          dfs(grid,i,j);
        }
      }
    }
    return ans;
  }

  private static void dfs(char[][] grid,int i,int j){
    if(i < 0 || i>=grid.length || j<0 || j>=grid.length || grid[i][j] == '0'){
      return;
    } else{
      grid[i][j] = '0';
      dfs(grid,i+1,j);
      dfs(grid,i,j+1);
      dfs(grid,i-1,j);
      dfs(grid,i,j-1);
    }
  }
}
