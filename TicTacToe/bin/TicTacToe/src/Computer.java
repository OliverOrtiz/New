import java.util.Scanner;
public class Computer extends Player
{
	public Computer(String team)//constructor
	{
		super(team);
	}
	public int takeTurn(Scanner kb , int[] pos)
	{
		int ans = 0;
		
		for(int i = 0; i < pos.length; ++i)
		{
			 if(pos[i] == 0)
			 {
				 ans = i+1;
				 break;
			 }
			
		}
		return ans;
		
	}
}
