import java.util.Scanner;

public class ToolStore extends Location{
	
	public ToolStore(Player player) {
		super(player);
		int chosen, price;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("----------------------------------------\n"
					+ "1- Buy weapon\n"
					+ "2- Buy armor\n"
					+ "3- Exit\n");
			chosen = input.nextInt();
			System.out.println("\n");
		
			if(chosen == 3) {
				break;
			}
			else if(chosen == 1) {
				System.out.println("----------------------------------------\n"
						+ "Your Money is " + player.getMoney()+ "\n"
						+ "  Name\t\tDamage\tCost\n"
						+ "1- Pistol\t2\t25\n"
						+ "2- Sword\t3\t35\n"
						+ "3- Rifle\t7\t45\n"
						+ "4- Exit\n"
						+ "----------------------------------------\n"
						+ "Choose one:");
				chosen = input.nextInt();
				
				if(chosen == 1) {
					if(canBuy(25)) {
						System.out.println("Pistol bought.\n");
						player.setMoney(player.getMoney() - 25);
						player.getInventory().setWeapon(2);
					}
					else {
						System.out.println("You don't have enough money.\n");
					}
					
				}
				
				else if(chosen == 2) {
					if(canBuy(35)) {
						System.out.println("Sword bought.\n");
						player.setMoney(player.getMoney() - 35);
						player.getInventory().setWeapon(3);
					}
					else {
						System.out.println("You don't have enough money.\n");
					}
					
				}
				
				else if(chosen == 3) {
					if(canBuy(45)) {
						System.out.println("Rifle bought.\n");
						player.setMoney(player.getMoney() - 45);
						player.getInventory().setWeapon(7);
					}
					else {
						System.out.println("You don't have enough money.\n");
					}
					
				}
				
				else if(chosen == 4) {
					break;
				}
				
				else {
					System.out.println("Invalid number!\n");
				}
			}
			else if(chosen == 2) {
				System.out.println("----------------------------------------\n"
						+ "Your Money is " + player.getMoney()+ "\n"
						+ "  Name\t\tDefence\tCost\n"
						+ "1- Light\t1\t15\n"
						+ "2- Medium\t3\t25\n"
						+ "3- Heavy\t5\t40\n"
						+ "4-Exit\n"
						+ "----------------------------------------\n"
						+ "Choose one: ");
				chosen = input.nextInt();
						System.out.println("\n");
				if(chosen == 1) {
					if(canBuy(15)) {
						System.out.println("Light armor bought.\n");
						player.setMoney(player.getMoney() - 15);
						player.getInventory().setArmor(1);
					}
					else {
						System.out.println("You don't have enough money.\n");
					}
					
				}
				
				else if(chosen == 2) {
					if(canBuy(25)) {
						System.out.println("Medium armor bought.\n");
						player.setMoney(player.getMoney() - 25);
						player.getInventory().setArmor(3);
					}
					else {
						System.out.println("You don't have enough money.\n");
					}
					
				}
				
				else if(chosen == 3) {
					if(canBuy(40)) {
						System.out.println("Heavy armor bought.\n");
						player.setMoney(player.getMoney() - 40);
						player.getInventory().setArmor(5);;
					}
					else {
						System.out.println("You don't have enough money.\n");
					}
					
				}
				
				else if(chosen == 4) {
					break;
				}
				
				else {
					System.out.println("Invalid number!\n");
				}
				
			}
			else {
				System.out.println("Invalid number!\n");
			}
		}
		player.setDamage(player.getDamage() + player.getInventory().getWeapon());
		player.getInventory().setArmor(player.getInventory().getArmor());
		System.out.println("Your damage: " + (player.getDamage()) 
				+ "\nYour defence: " + player.getInventory().getArmor()
				+ "\nYour money: " + player.getMoney()
				+ "\n");
	}
	
	public boolean onLocation() {
		return true;
	}
	
	private boolean canBuy(int price) {
		if(price > player.getMoney())
			return false;
		else 
			return true;
	}
}
