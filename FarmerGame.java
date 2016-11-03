/**
*
*
*
*/


import java.util.Scanner;

public class FarmerGame
{
	//global scope
	public static boolean cabbage;
	public static boolean human;
	public static boolean wolf;
	public static boolean goat;
	
	public static void main(String[] args)
	{
		game();
	}
	/**
	*This function will write the welcome message for the user 
	*as well as explain the rules of the game
	*/
	
	public static void welcome()
	{
		System.out.println("Welcome to the Farmer's Game!");
		System.out.println("The objective of this game is to get all of the animals as well ");
		System.out.print("as the human on the other side of the river. However, the wolf");
		System.out.print(" can't be left alone with the sheep and the sheep can't get left alone");
		System.out.print(" with the cabbage. Also, you can only move one animal at a time with the");
		System.out.print(" human.");
		System.out.println("")
		
	}
	public static void game()
	{
		Scanner keyboard = new Scanner(System.in);
		welcome();
		displayGameStatus();
		
		while (checkWinner() == 2)
		{
			input();
			checkWinner();
		}
		if (checkWinner() == 1)
		{
			System.out.println("YOU WIN!!");
		}
		else if (checkWinner() == 0)
		{
			System.out.println("YOU LOSE!!!");
		}
	
	
	}
	
	public static void displayGameStatus()
	{
		String bank0 = "    ";
		String bank1= "     ";
		
		if (cabbage == false)
		{
			bank0 += "C ";
		}
		else 
		{
			bank1 += "C ";
		}	
		if (goat == false)
		{
			bank0 += "G ";
		}
		else 
		{
			bank1 += "G ";
		}	
		if (human == false)
		{
			bank0 += "H ";
		}
		else 
		{
			bank1 += "H ";
		}	
		if (wolf == false)
		{
			bank0 += "W ";
		}
		else 
		{
			bank1 += "W ";
		}
			
		System.out.println(bank0);
		System.out.println("---------------------");
		System.out.println("\n\n\n");
		System.out.println("---------------------");
		System.out.print(bank1);
		System.out.print("\n\n\n" );
	}
	
	public static void input()
	{
		System.out.print("Which animal do you want to move?: ");
		
		Scanner keyboard = new Scanner(System.in);
		String x = keyboard.nextLine();
		
		if (x.equals("C"))
		{
			cabbage =! cabbage;
			human =! human;
			displayGameStatus();
		}
		else if (x.equals("H"))
		{
			human =! human;
			displayGameStatus();
		}
		else if (x.equals("W"))
		{
			wolf =! wolf;
			human =! human;
			displayGameStatus();
		}
		else if (x.equals("G"))
		{
			goat =! goat;
			human =! human;
			displayGameStatus();
			
		}
	}
	
	public static int checkWinner()
	{
	
		if ((human == true) && (wolf == true) && (goat == true) && (cabbage == true))
		{
			return 1;
		}
		else if ((human == false) && (wolf == false) && (goat == true) && (cabbage == true))
		{
			return 0;
		}
		else if ((human == true) && (wolf == false) && (goat == false) && (cabbage == true))
		{
			return 0;
		}
		else if ((human == false) && (wolf == true) && (goat == true) && (cabbage == true))
		{
			return 0;
		}
		else if ((human == true) && (wolf == true) && (goat == false) && (cabbage == false))
		{
			return 0;
		}
		else if ((human == false) && (wolf == true) && (goat == true) && (cabbage == false))
		{
			return 0;
		}
		else if((human == false) && (wolf == true) && (goat == true) && (cabbage == true))
		{
			return 0;
		}
		else
		{
			return 2;
		}
	}
	
}
	

	

	
