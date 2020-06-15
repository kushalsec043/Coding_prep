package Nick_White;

public class Leet18 
{
	public static void main(String[] args) 
	{
		String str = "QRRGFHDBFHJFJJDBJFJF";
		
		System.out.println(str.toLowerCase());
		
        //String str = "QRRGFHDBFHJFJJDBJFJF";
		
		String result = "";
		
		for(char c: str.toCharArray())
		{
			if(Character.isUpperCase(c))
			{
				result = result + (char)(c + 32);
			}
			else
			{
				result = result + c;
			}
		}
	}
}
