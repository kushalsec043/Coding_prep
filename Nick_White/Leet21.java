package Nick_White;

public class Leet21 
{
	public static void main(String[] args) 
	{
		
	}
	//Comparing two strings with ignoring # 21

	public boolean backspace(String S, String T)
	{
		int s_pointer = S.length()-1;
		int t_pointer = T.length()-1;
		
		int s_skips = 0;
		int t_skips = 0;
		
		while(s_pointer >= 0 || t_pointer >=0)
		{
		while(s_pointer >= 0)
		{
			if(S.charAt(s_pointer) == '#')
			{
				s_skips += 1;
				s_pointer -= 1;
			}
			else if(s_skips > 0)
			{
				s_pointer -= 1;
				s_skips -= 1;
			}
			else
			{
				break;
			}
		}
		while(t_pointer >= 0)
		{
			if(T.charAt(t_pointer) == '#')
			{
				t_skips += 1;
				t_pointer -= 1;
			}
			else if(t_skips > 0)
			{
				t_pointer -= 1;
				t_skips -= 1;
			}
			else
			{
				break;
			}
		}
		if(s_pointer >= 0 && t_pointer >= 0 && S.charAt(s_pointer) != T.charAt(t_pointer))
		{
			return true;
		}
		
		if((s_pointer >= 0) != (t_pointer >= 0))
		{
			return false;
		}
		
		s_pointer -= 1;
		t_pointer -= 1;
		}
		return true;
	}
}
