package game;


import edu.monash.fit2099.engine.*;

public class DoctorMaybe extends Actor{

	public DoctorMaybe(String name) {
		super(name, 'D', (int)2.5, 25);
		// TODO Auto-generated constructor stub
		this.addItemToInventory(RocketEngine.newInventoryItem("rocketEngine", 'E'));
	}
	

	@Override
	public Action playTurn(Actions actions, GameMap map, Display display) {

		for (Action action:actions) {
			if(action != null&&!(action instanceof MoveActorAction)&&!(action instanceof DropItemAction))
				return action;
		}
		
		return new SkipTurnAction();
	}
	
	
	
}
