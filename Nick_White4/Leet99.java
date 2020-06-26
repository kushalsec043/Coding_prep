package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet99 
{
	public static void main(String[] args)
	{

	}
	
	private int[] rows;
	private int[] columns;
	private int diagonalSum;
	private int antidiagonalSum;
	
	public void TicTacToe(int n)
	{
		rows = new int[n];
		columns = new int[n];
	}
	
	public int move(int row, int col, int player)
	{
		int player_value = (player == 1) ? 1 :-1;
		
		if(row == col)
		{
			diagonalSum += player_value;
		}
		
		if(col == (columns.length-1-row))
		{
			antidiagonalSum += player_value;
		}
		
		rows[row] += player_value;
		columns[col] += player_value;
		
		int size = rows.length;
		
		if((Math.abs(diagonalSum) == size) ||
				(Math.abs(antidiagonalSum) == size)||
				(Math.abs(rows[row]) == size) ||
				(Math.abs(columns[col]) == size))
				{
			return player;
				}
		
		return 0;
	}
	

}