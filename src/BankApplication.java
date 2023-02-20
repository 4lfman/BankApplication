import java.util.Random;
import java.util.Scanner;

public class BankApplication {
	static Scanner scanner = new Scanner(System.in);
	static int menuChoice;

	public static void main(String[] args) {
		runApplication();
	}

	private static void runApplication() {
		Bank bank = new Bank();

		while (true) {
			printMenu();

			menuChoice = scanner.nextInt();
			switch (menuChoice) {
			case 1: {
				for (BankAccount account : bank.findAccountsForHolder(scanner.nextInt())) {
					System.out.println(account);
				} 
				
				break;
			}
			case 2: {
				break;
			}
			case 3: {
				
				break;
			}
			case 4: {
				break;
			}
			case 5: {
				break;
			}
			case 6: {
				System.out.println("Skriv in namn och personnummer");
				bank.addAccount(scanner.next(), scanner.nextLong());
				break;
			}
			case 7: {
				break;
			}
			case 8: {
				for (BankAccount account : bank.getAllAccounts()) {
					System.out.println(account);
				}
				break;
			}
			case 9: {
				System.exit(0);
			}
			case 10:{
				Random rand = new Random();
				
				bank.addAccount("Alfred", rand.nextInt());
				bank.addAccount("Hannes", rand.nextInt());
				bank.addAccount("Agnes", rand.nextInt());
				bank.addAccount("Wilma", rand.nextInt());
				bank.addAccount("Vilma", rand.nextInt());
				bank.addAccount("Lovisa", rand.nextInt());
				bank.addAccount("Erik", 99);
				bank.addAccount("Erik", 99);
				break;
			}

			default:
				throw new IllegalArgumentException("Unexpected value: " + menuChoice);
			}
		}
	}

	private static void printMenu() {
		System.out.println("1. Hitta konto utifrån innehavare\n" + "2. Sök kontoinnehavare utifrån (del av) namn\n"
				+ "3. Sätt in\n" + "4. Ta ut\n" + "5. Överföring\n" + "6. Skapa konto\n" + "7. Ta bort konto\n"
				+ "8. Skriv ut konton\n" + "9. Avsluta");
	}
}
