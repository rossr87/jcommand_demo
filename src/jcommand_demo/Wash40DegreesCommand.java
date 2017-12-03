package jcommand_demo;


public class Wash40DegreesCommand implements Command {
	/*
	 * Each command has a reference to a Reciver.
	 */
	private SimpleWasherReceiver washer;
	
	Wash40DegreesCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		washer.setWashTemperature(WashTemperature.FOURTY);
	}
}
