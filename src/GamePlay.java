import java.util.Scanner;

 
public class GamePlay 
	{
	static boolean gameOver = false;
	
	public static void choosePokemon()
		{
		Pokemon player = null; 
		Pokemon opponent = null; 
		System.out.println("Which pokemon would you like to be?");
		System.out.println("1) Articuno \n2) Moltres");
		int choice = new Scanner(System.in).nextInt();  
		
		if(choice ==1)
			{
			player = new Pokemon (100, "Articuno", "Ice Beam", 14, "Tackle", 6, "Solar Beam", 25, "Whirlwind", 9);
			opponent = new Pokemon (100, "Moltres", "Flamethrower", 25, "Fly", 6, "Tackle", 9, "Ember", 14);
			}
		else if(choice ==2)
			{
			player = new Pokemon (100, "Moltres", "Flamethrower", 25, "Fly", 6, "Tackle", 9, "Ember", 14);
			opponent = new Pokemon (100, "Articuno", "Ice Beam", 14, "Tackle", 6, "Solar Beam", 25, "Whirlwind", 9);
			}
		else
		{
			System.out.println("Invalid Entry.");
			choosePokemon(); 
		}
		
		fightPokemon(player, opponent); 
		}
	
	public static void fightPokemon (Pokemon player, Pokemon opponent)
		{
		String [] playerAttacks = {player.getAttack1Name(),player.getAttack2Name(),player.getAttack3Name(),player.getAttack4Name()};
		int [] playerDamages = {player.getAttack1Damage(), player.getAttack2Damage(), player.getAttack3Damage(), player.getAttack4Damage()};
		String [] opponentAttacks = {opponent.getAttack1Name(),opponent.getAttack2Name(),opponent.getAttack3Name(),opponent.getAttack4Name()};
		int [] opponentDamages = {opponent.getAttack1Damage(), opponent.getAttack2Damage(), opponent.getAttack3Damage(), opponent.getAttack4Damage()};
		gameOver = false; 
		while(!gameOver)
			{
			System.out.println("Okay, " + player.getName()+ ", please choose an attack.");
			for(int i=0; i<4; i++)
				{
				System.out.println(i+1 + ") " + playerAttacks[i]);
				}
			int attack = new Scanner(System.in).nextInt();
			System.out.println("You have chosen " + playerAttacks[attack-1] + ". This attack has " + playerDamages[attack-1] + ".");
			opponent.setHealth(opponent.getHealth()-playerDamages[attack-1]);
			System.out.println("Your opponent has a health of " + opponent.getHealth() + ".");
			if(opponent.getHealth()<0)
				{
				System.out.println("You have won!");
				System.exit(0);
				}
			int opponentAttack = (int) (Math.random()*4); 
			System.out.println("Your opponent has chosen " + opponentAttacks[opponentAttack] + ". This attack has " + opponentDamages[opponentAttack] + ".");
			player.setHealth(player.getHealth()-opponentDamages[opponentAttack]);
			System.out.println("You have a health of " + player.getHealth() + ".");
			
			if(player.getHealth()<1)
				{
				System.out.println("You have lost!");
				System.exit(0); 
				}
			}
		}

	}
