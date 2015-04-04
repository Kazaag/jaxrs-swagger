package be.kazaag.swagger;

/**
 * Representation of the hello world.
 */
public class HelloWorld {
    private final String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGreetings() {
        return "Hello " + name;
    }
}
