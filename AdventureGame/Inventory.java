
public class Inventory {
	private int weapon = 0;
	private int armor = 0;
	private boolean food = false;
	private boolean firewood = false;
	private boolean water = false;
	
	public Inventory() {
		
	}
	
	//getters and setters
	public int getWeapon() {
		return weapon;
	}
	public void setWeapon(int weapon) {
		this.weapon = weapon;
	}
	public int getArmor() {
		return armor;
	}
	public void setArmor(int armor) {
		this.armor = armor;
	}
	public boolean isFood() {
		return food;
	}
	public void setFood(boolean food) {
		this.food = food;
	}
	public boolean isFirewood() {
		return firewood;
	}
	public void setFirewood(boolean firewood) {
		this.firewood = firewood;
	}
	public boolean isWater() {
		return water;
	}
	public void setWater(boolean water) {
		this.water = water;
	}
	
	
}