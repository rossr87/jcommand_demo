package jcommand_demo;

public class Spin800RpmCommand implements Command {
	SimpleWasherReceiver washer;
	
	Spin800RpmCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		this.washer.setSpinRPM(SpinRPM.EIGHT_HUNDRED);
	}
}
