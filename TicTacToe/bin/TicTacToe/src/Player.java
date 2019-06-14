import java.util.Scanner;
public class Player 
{
	private String name;
	private String team;
	
	/**public Player(String whatName, String whatTeam)//constructor
	{
		name = whatName;
		team = whatTeam;
	}*/
	public Player(String aTeam)
	{
		name = "";
		team = aTeam;
	}
	public int takeTurn(Scanner kb, int[] pos)//take turn
	{
		int ans;
		while(true)
		 {
			System.out.println("Select a move");
			 ans = kb.nextInt();
			 kb.nextLine();
			
			 if(pos[ans-1] == 0 && ans < 10)
			 {
				 break;
			 }
			 else
			 {
				 System.out.println("nice try.. select an OPEN space...");
			 }
		 }
		return ans;
	}
	public String getTeam()
	{
		return team;
	}

}
