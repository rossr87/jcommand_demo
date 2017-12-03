package jcommand_demo;

public class Wash60DegreesCommand implements Command {
	private SimpleWasherReceiver washer;
	
	Wash60DegreesCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		this.washer.setWashTemperature(WashTemperature.SIXTY);
	}
}
