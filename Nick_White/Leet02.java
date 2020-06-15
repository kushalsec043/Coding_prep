package Nick_White;

import java.util.ArrayList;
import java.util.List;

public class Leet02
{
	public static void main(String[] args)
	{
		// Pascal's Triangle....
		
		List<List<Integer>>out = generate(5);
		
		int num = 5;
		for(int i=0; i<out.size(); i++)
		{	
			int k = num-2;
			while(k >= 0)
			{
				System.out.print(" ");
				k = k-1;
			}
			
			//System.out.print("[");
			for(int j=0; j<out.get(i).size(); j++)
			{
				System.out.print(out.get(i).get(j));
				
				if(j != out.get(i).size()-1)
				{
					System.out.print(",");
				}
			}
			//System.out.print("]");
			System.out.println();
			num -= 1;
		}
	}
	
	/*
	 * public static void printtriangle(int num) { for(int i=0; i < num; i++) {
	 * for(int j=0; j < num; j++) { if(i==0 && j==0) { System.out.print("   " + 1);
	 * } System.out.println(); } } }
	 */
	public static List<List<Integer>> generate(int row)
	{
		List<List<Integer>> triangle = new ArrayList<>();
		
		if(row == 0)
		{
			return triangle;
		}
		List<Integer> firstrow = new ArrayList<>();
		
		firstrow.add(1);
		triangle.add(firstrow);
		
		for(int i=1; i<row; i++)
		{
			List<Integer> prev = triangle.get(i-1);
			List<Integer> rows = new ArrayList<>();
			
			rows.add(1);
			
			//If first row then move.....else add prev j-1 ,j....
			for(int j=1; j<i; j++)
			{
				rows.add(prev.get(j-1) + prev.get(j));
			}
			
			rows.add(1);
			triangle.add(rows);
			
		}
		return triangle;
		
	}
}
