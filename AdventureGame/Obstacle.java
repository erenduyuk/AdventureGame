import java.util.Random;

public class Obstacle {
	private String name;
	private int damage;
	private int health;
	private int money;
	private int count;
	private int maxHealth;
	
	public Obstacle(String name, int damage, int health, int money, int count) {
		this.name = name;
		this.damage = damage;
		this.health = health;
		this.money = money;
		this.count = count;
		this.maxHealth = health;
	}
	
	public int obstacleNumber() {
		Random r = new Random();
		return r.nextInt(count) + 1;
	}
	
	
	//getter and setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

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

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public int getMaxHealth() {
		return maxHealth;
	}

	public void setMaxHealth(int maxHealth) {
		this.maxHealth = maxHealth;
	}
	
	
	
}
