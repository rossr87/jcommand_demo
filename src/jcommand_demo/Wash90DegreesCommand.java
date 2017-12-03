package jcommand_demo;

public class Wash90DegreesCommand implements Command {
	private SimpleWasherReceiver washer;
	
	Wash90DegreesCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		this.washer.setWashTemperature(WashTemperature.NINETY);
	}
}
