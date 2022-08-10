import java.util.Scanner;

public abstract class BattleLoc extends Location{
	private Obstacle obstacle;
	private String name;
	private boolean reward = false;
	private int chosen;
	
	public BattleLoc(Player player, String name) {
		super(player);
		this.name = name;
	}
	

	public void battleLoc() {
		int obstacleNumber = obstacle.obstacleNumber();
		for(int i = 0; i < obstacleNumber; i++) {
			if(player.getHealth() <= 0 || chosen == 2) {
				break;
			}
			combat(player, obstacle);
		}
	}
	
	public void combat(Player player, Obstacle obstacle) {
		boolean firstAttack = false;
		if((int)(Math.random()*10) % 2 == 0) {
			firstAttack = true;
		}
		
		Scanner input = new Scanner(System.in);
		System.out.println(obstacle.getName() + " approaching you!");
		System.out.print("Make your choice\n"
				+ "1- Fight\n"
				+ "2- Go back to Safe House\n\n");
		chosen = input.nextInt();
		
		while(true) {
			if(chosen == 1) {
				if(firstAttack == true) {
					System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
					player.setHealth(player.getHealth() - obstacle.getDamage() + player.getInventory().getArmor());
					
					if(isContinue(player, obstacle) == 1) {
						System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
						System.out.println("YOU DÝED");
						reward = false;
						break;
					}
					else if(isContinue(player, obstacle) == 2) {
						System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
						System.out.println(obstacle.getName() + " is dead\n");
						System.out.println("Your health is " + player.getHealth());
						player.setMoney(player.getMoney() + obstacle.getMoney());
						obstacle.setHealth(obstacle.getMaxHealth());
						reward = true;
						break;
					}
					
					System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
					obstacle.setHealth(obstacle.getHealth() - player.getDamage());
					
					if(isContinue(player, obstacle) == 1) {
						System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
						System.out.println("YOU DÝED");
						reward = false;
						break;
					}
					else if(isContinue(player, obstacle) == 2) {
						System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
						System.out.println(obstacle.getName() + " is dead\n");
						System.out.println("Your health is " + player.getHealth());
						player.setMoney(player.getMoney() + obstacle.getMoney());
						obstacle.setHealth(obstacle.getMaxHealth());
						reward = true;
						break;
					}
					
				}
				else {
					System.out.println("Your health is " + player.getHealth() + ". " + obstacle.getName() + " health is " + obstacle.getHealth());
					obstacle.setHealth(obstacle.getHealth() - player.getDamage());
					
					if(isContinue(player, obstacle) == 1) {
						System.out.println("YOU DÝED");
						reward = false;
						break;
					}
					else if(isContinue(player, obstacle) == 2) {
						System.out.println(obstacle.getName() + " is dead\n");
						System.out.println("Your health is " + player.getHealth());
						player.setMoney(player.getMoney() + obstacle.getMoney());
						obstacle.setHealth(obstacle.getMaxHealth());
						reward = true;
						break;
					}
					
					System.out.println("Your health is " + player.getHealth() + ". Obstacle health is " + obstacle.getHealth());
					player.setHealth(player.getHealth() - obstacle.getDamage() + player.getInventory().getArmor());
					
					if(isContinue(player, obstacle) == 1) {
						System.out.println("YOU DÝED");
						reward = false;
						break;
					}
					else if(isContinue(player, obstacle) == 2) {
						System.out.println(obstacle.getName() + " is dead\n");
						obstacle.setHealth(obstacle.getMaxHealth());
						player.setMoney(player.getMoney() + obstacle.getMoney());
						System.out.println("Your health is " + player.getHealth());
						reward = true;
						break;
					}
				}
			}
			else if(chosen == 2) {
				SafeHouse safeHouse = new SafeHouse(player);
				reward = false;
				break;
			}
			else {
				System.out.println("Invalid choose!");
			}
		}
	}
	
	public int isContinue(Player player, Obstacle obstacle) {
		int result = 0;
		if(player.getHealth() <= 0) {
			result = 1;
		}
		else if(obstacle.getHealth() <= 0) {
			result = 2;
		}
		return result;
	}


	public Obstacle getObstacle() {
		return obstacle;
	}


	public void setObstacle(Obstacle obstacle) {
		this.obstacle = obstacle;
	}


	public boolean isReward() {
		return reward;
	}


	public void setReward(boolean reward) {
		this.reward = reward;
	}
	
	
}

