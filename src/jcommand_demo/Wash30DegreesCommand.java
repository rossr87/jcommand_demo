package jcommand_demo;

public class Wash30DegreesCommand {
	SimpleWasherReceiver washer;
	
	Wash30DegreesCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		this.washer.setWashTemperature(WashTemperature.THIRTY);
	}
}
