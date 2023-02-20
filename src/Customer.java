
public class Customer {
	String name;
	long idNr;
	int customerNr;
	static int currId;

	/**
	 * Skapar en kund (kontoinnehavare) med namnet 'name' och id-nummer 'idNr'.
	 * Kunden tilldelas också ett unikt kundnummer.
	 */
	public Customer(String name, long idNr) {
		this.name = name;
		this.idNr = idNr;
		this.customerNr = currId; //TODO: Fix Unique numbers
		currId++;
	}

	/** Tar reda på kundens namn. */
	public String getName() {
		return this.name;
	}

	/** Tar reda på kundens personnummer. */
	public long getIdNr() {
		return this.idNr;
	}

	/** Tar reda på kundens kundnummer. */
	public int getCustomerNr() {
		return this.customerNr;
	}

	/** Returnerar en strängbeskrivning av kunden. */
	public String toString() {
		return "Konto "+customerNr+" ("+name+", id "+idNr+", kundnr"+103+"):";
	}
}
