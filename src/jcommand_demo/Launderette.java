package jcommand_demo;

public class Launderette {

	public static void main(String[] args) {
		SimpleWasherReceiver washingMachine = new SimpleWasherReceiver();
		
		WasherControlInvoker controlPanel = new WasherControlInvoker();
		
		/*
		 * The command needs a reference to the receiver
		 */
		Wash60DegreesCommand wash60 = new Wash60DegreesCommand(washingMachine);
		Spin600RpmCommand spin600 = new Spin600RpmCommand(washingMachine);
		
		/*
		 * Command objects are passed to the Invoker.
		 */
		controlPanel.setCommand(wash60, spin600);
		controlPanel.startButtonWasPushed();
		
		washingMachine.getTemperature();
		washingMachine.getSpinRpm();
		
		SimpleWasherReceiver washingMachine2 = new SimpleWasherReceiver();

		/*
		 * Ok, so now we will not create these objects.
		 * The following commented out objects,
		 * These following ConcreteObjects implement a Command interface and are
		 * can be considered "functional objects" as they implement one method.
		 * 
		 * The instantiations of these, contain one method definition.
		 */
		//Wash40DegreesCommand wash40_2 = new Wash40DegreesCommand(washingMachine2);
		//Spin800RpmCommand spin800 = new Spin800RpmCommand(washingMachine2);
		
		/*
		 * Time to pass the command objects to the Invoker.
		 * 
		 * Note that:
		 * Instead of us having to write a class definition, then implement a method A, which
		 * calls another method, B. We simply use a lambda expression which calls method B.
		 */
		//controlPanel.setCommand(wash40_2, spin800);
		controlPanel.setCommand(() -> { washingMachine2.setWashTemperature(WashTemperature.FOURTY); },
								() -> { washingMachine2.setSpinRPM(SpinRPM.FOURTEEN_HUNDRED); });
		controlPanel.startButtonWasPushed();
		
		washingMachine2.getTemperature();
		washingMachine2.getSpinRpm();
		
		/*
		 * We create a new Receiver object
		 */
		SimpleWasherReceiver washingMachine3 = new SimpleWasherReceiver();

		/*
		 * Now, instead of creating two new commands objects...
		 * (These are "functional objects" - the object's implement one function
		 * after implementing an interface...)
		 */
		//Wash90DegreesCommand wash90 = new Wash90DegreesCommand(washingMachine3);
		//Spin1400RpmCommand spin1400 = new Spin1400RpmCommand(washingMachine3);
		
		/*
		 * We have no (functional) object references to pass to the setCommand method.
		 * Instead we pass lamba expressions....
		 * The method definition expects:
		 *  Command interface which is execute(), and that is all. so the name is not really
		 *  import, but all that is important is:
		 *  	- return type: void
		 *  	- arguments: none
		 *  So it's easy to match against this method.
		 *  Now, what does this method do? We just pass in the body using the lambda expression...
		 *  
		 *  Remember, the lambda expression we pass to the member function here is the body of 
		 *  what the functional object's contains.
		 */
		controlPanel.setCommand(() -> { washingMachine3.setWashTemperature(WashTemperature.NINETY); },
								() -> { washingMachine3.setSpinRPM(SpinRPM.FOURTEEN_HUNDRED); });
		controlPanel.startButtonWasPushed();
		
		washingMachine3.getTemperature();
		washingMachine3.getSpinRpm();
		
		
		/*
		 * Create a new Receiver.
		 */
		SimpleWasherReceiver washingMachine4 = new SimpleWasherReceiver();
		
		/*
		 * No need to create new command objects!
		 * But what we WOULD place in the definition of their object's gets passed in to
		 * the appropritate method by the lambda function.
		 */
		controlPanel.setCommand( () -> { washingMachine4.setWashTemperature(WashTemperature.FOURTY); },
								 () -> { washingMachine4.setSpinRPM(SpinRPM.EIGHT_HUNDRED);});
		
		/*
		 * Ah, ha! 
		 * We have removed the class definitions for the below Command objects!
		 * Instead of Command object's implementing the interface and defining a single method, that calls
		 * code in the receiver.
		 * With the Invoker, still set to receive object's passed by the lambda function
		 * (functional objects), that conform to the interface type, we just pass in to code
		 * that the command object's method would call (upon the the receiver).
		 */
		
		controlPanel.startButtonWasPushed();
		washingMachine4.getTemperature();
		washingMachine4.getSpinRpm();
	}

}
