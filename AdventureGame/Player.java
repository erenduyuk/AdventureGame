
public class Player {
	private int damage;
	private int health;
	private int money;
	private Inventory inventory = new Inventory();
	private Location location;
	private int maxHealth; 
	
	public Player(int id) {
		if(id == 1) {
			damage = 5;
			health = 21;
			money = 15;
			maxHealth = 21;
		}
		else if(id == 2) {
			damage = 7;
			health = 18;
			money = 20;
			maxHealth = 18;
		}
		else if(id == 3) {
			damage = 8;
			health = 24;
			money = 5;
			maxHealth = 24;
		}
	}
	
	
	
	//getter and setter
	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public Inventory getInventory() {
		return inventory;
	}

	public void setInventory(Inventory inventory) {
		this.inventory = inventory;
	}
	
	public int getMaxHealth() {
		return maxHealth;
	}
	
}
