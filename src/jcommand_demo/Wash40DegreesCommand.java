package jcommand_demo;


public class Wash40DegreesCommand implements Command {
	private SimpleWasher washer;
	
	public void execute() {
		washer.setWashTemperature(WashTemperature.FOURTY);
	}
}
