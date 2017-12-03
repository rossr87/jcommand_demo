package jcommand_demo;

public class WasherControlInvoker {
	private static final int WASH = 0;
	private static final int SPIN = 1;
	/*
	 * The Invoker has a reference to two commands in this case.
	 * The temperature command and the spin rpm command.
	 */
	Command[] command = new Command[2];
	
	public void setCommand(Command washCommand, Command spinCommand) {
		command[WASH] = washCommand;
		command[SPIN] = spinCommand;
	}
	
	/*
	 * When the client presses the button, we have our invoker
	 * use it's reference to the commands it has been given
	 * call execute() on the commands.
	 */
	public void startButtonWasPushed() {
		command[WASH].execute();
		command[SPIN].execute();
	}
}
