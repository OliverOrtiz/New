import java.util.Scanner;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;
import javax.swing.BorderFactory;
import java.lang.Override;

public class TicTacToeInterface
{
	public static void main(String[] args)
	{
		Player Player1;
		Player Player2;
		Board b = new Board();
		JFrame f = new JFrame("Tic Tac Toe");;
		JPanel p = new JPanel();
		JLabel l = new JLabel();
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		// want this after welcome, and single / multiplayer  choice
		p.setLayout(new GridLayout(3,3));
		for (int i = 0; i < 9; ++i)
		{
			p.add(new Button(" "));
		}
		 
		f.getContentPane().add (p);
		
		f.setBounds(425, 100, 500, 500); 
		l.setText("some");
        p.add(l);
		f.setVisible(true);
//		Scanner kb = new Scanner(System.in);
//		
//		System.out.println("Hello, welcome to TicTacToe!");	
//		
//		while(!kb.hasNext("C") && !kb.hasNext("c"))//start menu
//		{	
//			
//			System.out.println("Select one: \nA) Single player \nB) Multiplayer \nC) Exit");
//			
//			String ans = kb.next().toLowerCase();
//			kb.nextLine();
//			
//			if(ans.equals("a")) //single player
//			{	
//				System.out.println("Player 1 select x or o (hint: o's go first)");//x or o
//				ans = kb.next().toLowerCase(); // process input
//				
//				if(ans.equals("x"))// assign player teams 
//				{
//					Player1 = new Person("x");
//					Player2 = new Computer("o");
//				}
//				else
//				{
//					Player1 = new Person("o");
//					Player2 = new Computer("x");
//				}
//				
//			}
//			else if(ans.equals("b"))//two player
//			{
//				System.out.println("Player 1 select x or o");
//				ans = kb.next().toLowerCase();
//				if(ans == "x")
//				{
//					Player1 = new Person("x");
//					Player2 = new Person("o");
//				}
//				else
//				{
//					Player1 = new Person("o");
//					Player2 = new Person("x");
//				}
//			}
//			else
//			{
//				System.out.println("You should have picked x or o... now you will paay!!!");
//				Player1 = new Person("x");
//				//Player2  = new Computer("x" , "DeathMode");
//			}
//			board = new Board();//run game
//			//board.start(Player1, Player2, kb);
//		}
//		System.out.println("Thanks for playing!!");
//		kb.close();
//		
	}	
}
