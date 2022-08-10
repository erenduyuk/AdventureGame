
public class SafeHouse extends Location{
	
	public SafeHouse(Player player) {
		super(player);
		player.setHealth(player.getMaxHealth());
		System.out.println("----------------------------------------\n"
				+ "Your life is renewed in the safe house.\n"
				+ "Your health is " + player.getHealth() + "\n");
	}
	
}
