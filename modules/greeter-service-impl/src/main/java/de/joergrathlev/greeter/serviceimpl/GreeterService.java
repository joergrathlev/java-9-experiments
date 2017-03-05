package de.joergrathlev.greeter.serviceimpl;

import de.joergrathlev.greeter.api.Greeter;

public class GreeterService implements Greeter {
    public String getGreeting() {
        return "Hello from GreeterService!";
    }
}
