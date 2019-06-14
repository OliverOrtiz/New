import java.util.Scanner;
public class TicTacToeInterface
{
	public static void main(String[] args)
	{
		// instance variables
		Board board;
		Player Player1;
		Player Player2;
		Scanner kb = new Scanner(System.in);
		System.out.println("Hello, welcome to TicTacToe!");	
		
		//game loop
		while(true)
		{	
			
			System.out.println("Select one: \nA) Single player \nB) Multiplayer \nC) Exit");
			
			String ans = kb.next().toLowerCase();
			kb.nextLine();
			
			if(ans.equals("a")) //single player
			{	
				System.out.println("Player 1 select x or o (hint: o's go first)");//x or o
				ans = kb.next().toLowerCase();
				if(ans.equals("x"))
				{
					Player1 = new Person("x");
					Player2 = new Computer("o");
				}
				else
				{
					Player1 = new Person("o");
					Player2 = new Computer("x");
				}
				board = new Board();
				board.start(Player1, Player2, kb);
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
				board = new Board();
				board.start(Player1, Player2, kb);
			}
			else if(ans.equals("a"))
			{
				break;
			}
			else
			{
				System.out.println("oops, try again that is not an option");
			}
		}
		//end game loop
		System.out.println("Thanks for playing!!");
	}	
}
