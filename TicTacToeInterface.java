import java.util.Scanner;
public class TicTacToeInterface
{
	public static void main(String[] args)
	{
		Board board;
		Player Player1;
		Player Player2;
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello, welcome to TicTacToe!");	
		
		
		while(!kb.hasNext("C") && !kb.hasNext("c"))//start menu
		{	
			
			System.out.println("Select one: \nA) Single player \nB) Multiplayer \nC) Exit");
			
			String ans = kb.next().toLowerCase();
			kb.nextLine();
			
			if(ans.equals("a")) //single player
			{	
				System.out.println("Player 1 select x or o (hint: o's go first)");//x or o
				ans = kb.next().toLowerCase(); // process input
				
				if(ans.equals("x"))// assign player teams 
				{
					Player1 = new Person("x");
					Player2 = new Computer("o");
				}
				else
				{
					Player1 = new Person("o");
					Player2 = new Computer("x");
				}
				
			}
			else if(ans.equals("b"))//two player
			{
				System.out.println("Player 1 select x or o");
				ans = kb.next().toLowerCase();
				if(ans == "x")
				{
					Player1 = new Person("x");
					Player2 = new Person("o");
				}
				else
				{
					Player1 = new Person("o");
					Player2 = new Person("x");
				}
			}
			else
			{
				System.out.println("You should have picked x or o... now you will paay!!!");
				Player1 = new Person("x");
				Player2  = new Computer("x" , "DeathMode");
			}
			board = new Board();//run game
			board.start(Player1, Player2, kb);
		}
		System.out.println("Thanks for playing!!");
	}	
}
