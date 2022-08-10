
public class River extends BattleLoc {

	public River(Player player) {
		super(player, "River");
		super.setObstacle(new Bear());
		battleLoc();
		
		if(super.isReward()) {
			player.getInventory().setWater(true);
			System.out.println("Water is gained.\n");
		}
	}

}
