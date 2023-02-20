
public class BankApplication {
	public static void main(String[] args) {
		runApplication();
	}
	private static void runApplication() {
		printMenu();
	}
	
	private static void printMenu() {
		System.out.println("1. Hitta konto utifrån innehavare\n"
				+ "2. Sök kontoinnehavare utifrån (del av) namn\n"
				+ "3. Sätt in\n"
				+ "4. Ta ut\n"
				+ "5. Överföring\n"
				+ "6. Skapa konto\n"
				+ "7. Ta bort konto\n"
				+ "8. Skriv ut konton\n"
				+ "9. Avsluta");
	}
}
