package de.joergrathlev.greeter.commandline;

import java.util.ServiceLoader;
import java.util.stream.Stream;
import de.joergrathlev.greeter.api.Greeter;

public class Main {
    public static void main(String[] args) {
        ServiceLoader.load(Greeter.class).stream()
            .forEach(p -> {
                Greeter g = p.get();
                System.out.println(g.getGreeting());
            });
    }
}