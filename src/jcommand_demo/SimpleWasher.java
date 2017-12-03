/*
 * A simple washer.
 * It has no knowledge of:
 * -Invoker
 * - Client
 */
package jcommand_demo;

public class SimpleWasher {
	private WashTemperature washTemperature;
	private SpinRPM spinRpm;

	public void setWashTemperature(WashTemperature washTemperature) {
		this.washTemperature = washTemperature;
	}
	
	public void setSpinRPM(SpinRPM spinRpm) {
		this.spinRpm = spinRpm;
	}
}
