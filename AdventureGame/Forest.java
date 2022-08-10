
public class Forest extends BattleLoc {

	public Forest(Player player) {
		super(player, "Forest");
		super.setObstacle(new Vampire());
		battleLoc();
		
		if(super.isReward()) {
			player.getInventory().setFirewood(true);
			System.out.println("Firewood is gained.\n");
		}
	}

}
