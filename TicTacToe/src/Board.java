import java.util.Scanner;

public class Board 
{
	private int[][] board = { {1,2,3},
			  				  {4,5,6},
			  				  {7,8,9} }; 
	private int [][] win = { {1,2,3}, {4,5,6}, {7,8,9}, //horiz
							 {1,4,7}, {2,5,8}, {7,8,9}, //vert
							 {1,5,9}, {3,5,7} };        //diag
			
	

	
	//Board Graphics
//	JFrame frame = new JFrame("TicTacToe");
//	JPanel panel = new JPanel();
//	panel.setLayout(new GridLayout(3,3));
//	for (int i = 0; i < 9; ++i)
//	{
//		panel.add(new Button(" "));
//	}
//	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	//frame.add
//	panel.setBorder (BorderFactory.createLineBorder (Color.gray, 3));
//	frame.getContentPane().add (panel);
//	frame.pack();
//	frame.setVisible(true);
//	//frame.setSize(500,500);
//	frame.setBounds(425, 100, 500, 500);

	public Board()//constructor
	{
		
	}
	public void start(Player p1, Player p2, Scanner kb)
	{

//		
//		
//		Player first;
//		Player second;
//		boolean won = false;
//		
//		if(p1.getTeam().equals("o"))
//		{
//			first = p1;
//			second = p2;
//		}
//		else
//		{
//			first = p2;
//			second = p1;
//		}
//		
//		while(!won)//while game not over
//		{
//			print();
//			update(first.takeTurn(kb, pos), 'o');
//			print();
//			update(second.takeTurn(kb, pos), 'x');
//			}
//		clear();
	}
	
	private boolean checkStatus(int x)
	{
		
//			if(x == 0 || x % 2 == 0 && pos[x] != 0)//02468
//			{
//				if(pos[0] == pos[4] && pos[4] == pos[8])
//				{
//					return true;
//				}
//				if(pos[2] == pos[4] && pos[4] == pos[6])
//				{
					return true;
//				}
//			}
//		if(x < 3 )//all else just up and side
//		{
//			if(pos[0] == pos[1] && pos[1] == pos[2])
//			{
//				return true;
//			}
//			else if (pos[x] == pos[x+3] && pos[x+3] == pos[x+6])
//			{
//				return true;
//			}
//		}
//		else if(x < 6)
//		{
//			if(pos[3] == pos[4] && pos[4] == pos[5])
//			{
//				return true;
//			}
//			else if (pos[x] == pos[x-3] && pos[x-3] == pos[x+3])
//			{
//				return true;
//			}
//		}
//		else
//		{
//			if(pos[6] == pos[7] && pos[7] == pos[8])
//			{
//				return true;
//			}
//			else if (pos[x] == pos[x-3] && pos[x] == pos[x-6])
//			{
//				return true;
//			}
//		}
//		return false;
//	}
//	private void print()
//	{
//		for (int row = 0; row < boardHeight; ++row  )
//		{
//			  for (int col = 0; col < boardWidth; ++col)
//			  {
//			    System.out.print(board[row][col]);
//			  }
//			  System.out.println("");
//		}
//		System.out.println("\n\n");
	}
	//update
	private void update(int location, char team)
	{
//		int x = 0;
//		int y = 0;
//		if(location < 4)
//		{
//			y = 1;
//		}
//		else if(location < 7)
//		{
//			y = 5;
//		}
//		else
//		{
//			y = 9;
//		}
//		
//		if(location == 1 || location == 4 || location == 7)
//		{
//			x = 2;
//		}
//		else if(location == 2 || location == 5 || location == 8)
//		{
//			x = 8;
//		}
//		else if(location % 3 == 0)
//		{
//			x = 14;
//		}
//		if(team == 'x')
//		{
//			printX(x,y);
//			pos[location-1] = 1;
//		}
//		else if(team == 'o')
//		{
//			printO(x,y);
//			pos[location-1] = -1;
//		}
//		else if(team == 'z')
//		{
//			board[y][x] = (char)(location+'0');
//		}
//		if(!checkStatus(location-1))
//		{
//			won = true;
//			System.out.println(team +" wins!");
//		}
	}
	private void printX(int col, int row)
	{
//		board[row - 1][col - 1] = 'X';
//		board[row - 1][col + 1] = 'X';
//		board[row][col] = 'X';
//		board[row + 1][col - 1] = 'X';
//		board[row + 1][col + 1] = 'X';
	}
	private void printO(int col, int row)
	{
//		board[row - 1][col] = 'O';
//		board[row][col - 1] = 'O';
//		board[row][col + 1] = 'O';
//		board[row][col] = ' ';
//		board[row + 1][col] = 'O';

	}
	
	private void clear()//clear
	{
//		for (int row = 0; row < boardHeight; ++row  )
//		{
//			  for (int col = 0; col < boardWidth; ++col)
//			  {
//			    if(board[row][col] == 'X' || board[row][col] == 'O' )
//			    {
//			    	board[row][col] = ' ' ;
//			    }
//			  }
//		}
//		for (int i = 1; i < 10; ++i)
//		{
//			update(i,'z');
//		}
	}
	

}
