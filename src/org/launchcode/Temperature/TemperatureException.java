package org.launchcode.Temperature;

//all custom exceptions must inherit from the Exception class
public class TemperatureException extends Exception {
    // Write code here!
    public TemperatureException(String message){
        super(message);
    }
}
