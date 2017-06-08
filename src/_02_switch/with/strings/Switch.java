package _02_switch.with.strings;

public class Switch {

	private static void displayMessage(String argument) {
		
		switch (argument) {
		case "hi":
			System.out.println("Hello world!");
			break;
		case "help":
			System.out.println("Here is the man page.\n...");
		case "truc":
			//
			System.out.println("That's all folks!");
			break;
		default:
			System.err.println("unexpected parameter.");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		
		Switch.displayMessage("hi");
//		Switch.displayMessage("help");
//		Switch.displayMessage("any unknown value");
		
	}
}
