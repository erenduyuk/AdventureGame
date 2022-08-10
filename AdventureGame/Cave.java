
public class Cave extends BattleLoc {

	public Cave(Player player) {
		super(player, "Cave");
		super.setObstacle(new Zombie());
		battleLoc();
		
		if(super.isReward()) {
			player.getInventory().setFood(true);
			System.out.println("Food is gained.\n");
		}
	}
}
