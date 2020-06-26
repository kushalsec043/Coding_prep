package Nick_White4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class Leet97 
{
	public static void main(String[] args)
	{

	}

	// Distance between bus stops...
	
	public int distance(int[] distance, int start, int destination)
	{
		int clockwisedistance = 0;
		int totaldistance = 0;
		
		for(int i=0; i<distance.length; i++)
		{
			if(start < destination && (i >= start && i < destination))
			{
				clockwisedistance += distance[i];
			}
			
			if(start > destination && (i >= start || i < destination))
			{
				clockwisedistance +=distance[i];
			}
			
			totaldistance += distance[i];
		}
		
		return Math.min(clockwisedistance, totaldistance - clockwisedistance);
	}
}