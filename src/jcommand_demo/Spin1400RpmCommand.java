package jcommand_demo;

public class Spin1400RpmCommand implements Command {
	private SimpleWasherReceiver washer;
	
	Spin1400RpmCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		this.washer.setSpinRPM(SpinRPM.FOURTEEN_HUNDRED);
	}
}
