/*
 * A simple washer.
 * It has no knowledge of:
 * -Invoker
 * - Client
 */
package jcommand_demo;

public class SimpleWasherReceiver {
	private WashTemperature washTemperature;
	private SpinRPM spinRpm;

	public void setWashTemperature(WashTemperature washTemperature) {
		this.washTemperature = washTemperature;
	}
	
	public void setSpinRPM(SpinRPM spinRpm) {
		this.spinRpm = spinRpm;
	}
	
	public void getTemperature() {
		switch (this.washTemperature) {
			case THIRTY:
				System.out.println("Thirty degrees C");
				break;
			case FOURTY:
				System.out.println("Fourty degrees C");
				break;
			case SIXTY:
				System.out.println("Sixty degrees C");
				break;
			case NINETY:
				System.out.println("Ninety degrees C");
				break;
			default:
				System.out.println("Temp setting not available.");
		}
	}
	
	public void getSpinRpm() {
		switch (this.spinRpm) {
			case SIX_HUNDRED:
				System.out.println("600 RPM");
				break;
			case EIGHT_HUNDRED:
				System.out.println("800 RPM");
				break;
			case FOURTEEN_HUNDRED:
				System.out.println("1400 RPM");
				break;
			default:
				System.out.println("No Such RPM");
		}
	}
	
}
