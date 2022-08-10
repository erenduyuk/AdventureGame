import java.util.Scanner;

public class Game {
	Player player;
	
	public void start() {
		System.out.println("Welcome to the game. You must collect food, wood and water to win.\n");
		System.out.print("Choose your character\n"
				+ "----------------------------------------\n"
				+ "  Type\t\tDamage\tHealth\tMoney\n\n"
				+ "1-Samurai\t5\t21\t15\n"
				+ "2-Archer\t7\t18\t20\n"
				+ "3-Knight\t8\t24\t5\n"
				+ "----------------------------------------\n"
				+ "Enter number:");
				
		while(true) {
			Scanner input = new Scanner(System.in);
			int character = input.nextInt();
			System.out.println("\n\n");
			if(character == 1) {
				player = new Player(character);
				break;
			}
			else if(character == 2) {
				player = new Player(character);
				break;
			}
			else if(character == 3) {
				player = new Player(character);
				break;
			}
			else {
				System.out.println("Invalid number!");
			}
		}
		
		while (true) {
			if (player.getHealth() <= 0) {
				System.out.println("GAME OVER!");
				break;
			}
			else if (player.getInventory().isFirewood() && player.getInventory().isFood() && player.getInventory().isWater()) {
				System.out.println("YOU WON!");
				break;
			}
			else {
				loop();
			}
		}
		
	}
	
	public void loop() {
		Scanner input = new Scanner(System.in);
		System.out.print("Where do you want to go ?\n"
				+ "----------------------------------------\n"
				+ "1- Safe House\n"
				+ "2- Cave\n"
				+ "3- Forest\n"
				+ "4- River\n"
				+ "5- Tool Store\n"
				+ "----------------------------------------\n"
				+ "Enter number:");
		
		int choosen = input.nextInt();
		System.out.println("\n\n");
		if(choosen == 1) {
			new SafeHouse(player);
		}
		else if(choosen == 2) {
			new Cave(player);
		}
		else if(choosen == 3) {
			new Forest(player);
		}
		else if(choosen == 4) {
			new River(player);
		}
		else if(choosen == 5) {
			new ToolStore(player);
		}
		else {
			System.out.println("Invalid number!");
		}
	}
}
