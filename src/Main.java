public class Main {
    public static void main(String[] args) {
        Agent amy = new Agent("Amy Higgins", "646-555-5555");
        Comedian morgan = new Comedian("Morgan Smith", 31, amy);
        morgan.writeJoke("There are 10 kinds of people in the world: Those that understand binary and those that don't");
        morgan.writeJoke("How many programmers does it take to change a light bulb? None, that's a hardware problem!");
        morgan.writeJoke("What's the object oriented way to become wealthy? Inheritance!");
        morgan.rehearse();
        System.out.println();
        morgan.rehearse(true);
        System.out.println();
        morgan.rehearse(false);
    }
}
