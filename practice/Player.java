
public class Player {
	
	int healthPoints;
	int manaPoints;
	
	Player(int healthPoints, int manaPoints) {
		this.healthPoints = healthPoints;
		this.manaPoints = manaPoints;
	}
	
	public static void main (String[] args) {
		
		Player player = new Player(450, 0);
		
		double damagePerTick = 10;
		if(player.healthPoints > 0) {
			while(player.healthPoints > 0) {
				player.healthPoints -= damagePerTick;
				System.out.println(player.healthPoints);
			}		
		}
		if(player.healthPoints == 0) {
			System.out.println("The player fainted!");
		}
		double manaHealth = 10;
		if(player.manaPoints < 200) {
			while(player.manaPoints < 200 ) {
				player.manaPoints += manaHealth;
				System.out.println(player.manaPoints);
			}
		}
		if(player.manaPoints == 200) {
			System.out.println("Mana 100% recovered!");
		}
		
		
		
		
		
		
		
		
	}
	
}
