/*
 * The client will "just"
 * create an Command object of this type
 * to set the temperature for the washing machine.
 * The Invoker will have a reference to this command and present it
 * to the client.
 */
package jcommand_demo;

public class Spin600RpmCommand implements Command {
	/*
	 * Each command has a reference to a Reciver.
	 */
	private SimpleWasherReceiver washer;

	Spin600RpmCommand(SimpleWasherReceiver washer) {
		this.washer = washer;
	}
	
	public void execute() {
		this.washer.setSpinRPM(SpinRPM.SIX_HUNDRED);
	}
}
