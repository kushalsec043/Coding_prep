package Nick_White;

public class Leet28 
{
	// Robot move to origin....
	
	public static void main(String[] args)
	{
		System.out.println(judge("UDLR"));
	}
	public static boolean judge(String moves)
	{
		int x = 0;
		int y = 0;
		
		for(char move: moves.toCharArray())
		{
			if(move == 'U')
			{
				y += 1;
			}
			else if(move == 'D')
			{
				y -= 1;
			}
			else if(move == 'L')
			{
				x -= 1;
			}
			else 
			{
				x += 1;
			}
		}
		return (x == 0 && y == 0);
	}
	
	
}
