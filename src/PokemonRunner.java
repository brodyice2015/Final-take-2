import java.util.Scanner;


public class PokemonRunner 	
	{
	static Scanner userInput = new Scanner(System.in);
	
	public static void main(String[] args) 
		{
		greetPlayer(); 
		GamePlay.choosePokemon();
		}
	
	public static void greetPlayer()
		{
		System.out.println("What is your name?");
		String name = userInput.nextLine();
		System.out.println("Hello, " + name + ", would you like to play pokemon?");
		String choice =userInput.nextLine().substring(0,1).toLowerCase();
		if(choice.equals("n"))
			{
			System.out.println("Thanks for playing!");
			System.exit(0);
			}
		else
			{
			
			}
		}
	
	}
