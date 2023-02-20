import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Bank {
	private ArrayList<BankAccount> accounts = new ArrayList<>();

	/** Skapar en ny bank utan konton. */
	public Bank() {

	}

	/**
	 * Öppna ett nytt konto i banken. Om det redan finns en kontoinnehavare med de
	 * givna uppgifterna ska inte en ny Customer skapas, utan istället den
	 * befintliga användas. Det nya kontonumret returneras.
	 */
	public int addAccount(String holderName, long idNr) {
		BankAccount newAccount;

		if (findHolder(idNr) == (null)) {
			newAccount = new BankAccount(holderName, idNr);
		} else {
			newAccount = new BankAccount(findHolder(idNr));
		}

		accounts.add(newAccount);
		return newAccount.getAccountNumber();
	}

	/**
	 * Returnerar den kontoinnehavaren som har det givna id-numret, eller null om
	 * ingen sådan finns.
	 */
	public Customer findHolder(long idNr) {
		for (BankAccount bankAccount : accounts) {
			if (bankAccount.getHolder().getIdNr() == idNr) {
				return bankAccount.getHolder();
			}
		}
		return null;
	}

	/**
	 * Tar bort konto med nummer 'number' från banken. Returnerar true om kontot
	 * fanns (och kunde tas bort), annars false.
	 */
	public boolean removeAccount(int number) {
		
	}

	/**
	 * Returnerar en lista innehållande samtliga bankkonton i banken. Listan är
	 * sorterad på kontoinnehavarnas namn.
	 */
	public ArrayList<BankAccount> getAllAccounts() {
//		BankAccount temp = accounts.get(0);
		
		for (int i = 1; i < accounts.size(); i++) {
			for (int j = 0; j < i; j++) {
				if(accounts.get(i).getHolder().getName().compareTo(accounts.get(j).getHolder().getName())<0) {
					accounts.add(j,accounts.get(i));
					accounts.remove(i+1);
					break;
				}
			}
		}

		return accounts; // TODO:Sort
	}

	/**
	 * Söker upp och returnerar bankkontot med kontonummer 'accountNumber'.
	 * Returnerar null om inget sådant konto finns.
	 */
	public BankAccount findByNumber(int accountNumber) {
		
	}

	/**
	 * Söker upp alla bankkonton som innehas av kunden med id-nummer 'idNr'. Kontona
	 * returneras i en lista. Kunderna antas ha unika id-nummer.
	 */
	public ArrayList<BankAccount> findAccountsForHolder(long idNr) {
		ArrayList<BankAccount> foundAccounts = new ArrayList<>();
		for (BankAccount account : accounts) {
			if(account.getHolder().getIdNr()==idNr) {
				foundAccounts.add(account);
			}
		}
		return foundAccounts;
	}

	/**
	 * Söker upp kunder utifrån en sökning på namn eller del av namn. Alla personer
	 * vars namn innehåller strängen 'namePart' inkluderas i resultatet, som
	 * returneras som en lista. Samma person kan förekomma flera gånger i
	 * resultatet. Sökningen är "case insensitive", det vill säga gör ingen skillnad
	 * på stora och små bokstäver.
	 */
	public ArrayList<Customer> findByPartofName(String namePart) {

	}

}
