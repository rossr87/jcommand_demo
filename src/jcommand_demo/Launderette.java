package jcommand_demo;

public class Launderette {

	public static void main(String[] args) {
		SimpleWasherReceiver washingMachine = new SimpleWasherReceiver();
		
		WasherControlInvoker controlPanel = new WasherControlInvoker();
		
		/*
		 * The command needs a reference to the receiver
		 */
		Wash40DegreesCommand wash40 = new Wash40DegreesCommand(washingMachine);
		Spin600RpmCommand spin600 = new Spin600RpmCommand(washingMachine);
		
		controlPanel.setCommand(wash40, spin600);
		controlPanel.startButtonWasPushed();
		
		washingMachine.getTemperature();
		washingMachine.getSpinRpm();
		
		SimpleWasherReceiver washingMachine2 = new SimpleWasherReceiver();

		/*
		 * At the moment, we can only set a command's reference to the receiver it
		 * is commanding at instantiation time (this is easily changed).
		 */
		Wash40DegreesCommand wash40_2 = new Wash40DegreesCommand(washingMachine2);
		Spin800RpmCommand spin800 = new Spin800RpmCommand(washingMachine2);
		
		controlPanel.setCommand(wash40_2, spin800);
		controlPanel.startButtonWasPushed();
		
		washingMachine2.getTemperature();
		washingMachine2.getSpinRpm();
		
		SimpleWasherReceiver washingMachine3 = new SimpleWasherReceiver();
		Wash90DegreesCommand wash90 = new Wash90DegreesCommand(washingMachine3);
		Spin1400RpmCommand spin1400 = new Spin1400RpmCommand(washingMachine3);
		
		controlPanel.setCommand(wash90, spin1400);
		controlPanel.startButtonWasPushed();
		
		washingMachine3.getTemperature();
		washingMachine3.getSpinRpm();
	}

}
