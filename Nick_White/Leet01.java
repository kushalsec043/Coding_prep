package Nick_White;

public class Leet01 
{
	// Number of Islands Problem....
	
	public static void main(String[] args)
	{
		char send[][] = {
						{'1','1','0','0','0'},
						{'1','1','0','0','0'},
						{'0','0','1','0','0'},
						{'0','0','0','1','1'}
						};
		
		int result = numIslands(send);
		
		System.out.println(result);
	}
	public static int numIslands(char[][] grid)
	{
		int count = 0;
		
		for(int i=0; i<grid.length; i++)
		{
			for(int j=0; j<grid[i].length; j++)
			{
				if(grid[i][j] == '1')
				{
					count +=1;
					callbfs(grid, i, j);
				}
			}
		}
		return count;
	}
	
	public static void callbfs(char[][] grid, int i, int j)
	{
		if(i < 0 || j < 0 || i >= grid.length || j >= grid[i].length || grid[i][j] == '0')
		{
			return;
		}
		
		grid[i][j] = '0';
		
		callbfs(grid, i+1, j); //down
		callbfs(grid, i-1, j); //up
		callbfs(grid, i, j-1); //left
		callbfs(grid, i, j+1); //right
		
	}
}
