package Nick_White4;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Leet74 
{
	public static void main(String[] args)
	{
     
    }
	
	// Word search..........
	
	boolean visited[][];
	public boolean exist(char[][] board, String word)
	{
		int rows = board.length;
		int columns = board[0].length;
		
		visited = new boolean[rows][columns];
		
		for(int i=0; i<rows; i++)
		{
			for(int j=0; j<columns; j++)
			{
				if(word.charAt(0) == board[i][j] && searchword(i, j, 0, board, word))
				{
					return true;
				}
			}
		}
		
		return false;
	}
	
	public boolean searchword(int i, int j, int index, char[][] board, String word)
	{
		if(index == word.length())
		{
			return true;
		}
		
		if(i < 0 || i >= board.length || j < 0 || j >= board[i].length
				|| word.charAt(index) != board[i][j] || visited[i][j])
		{
			return false;
		}
		
		visited[i][j] = true;
		
		if(searchword(i+1,j, index+1, board, word) ||
		   searchword(i-1,j, index+1, board, word) ||
           searchword(i,j+1, index+1, board, word) ||
		   searchword(i,j-1, index+1, board, word))
		{
			return true;
		}
		
		visited[i][j] = false;
		
		return false;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
