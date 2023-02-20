
public class Customer {
	String name;
	long idNr;
	int customerNr;
	static int currId = 101;

	/**
	 * Skapar en kund (kontoinnehavare) med namnet 'name' och id-nummer 'idNr'.
	 * Kunden tilldelas också ett unikt kundnummer.
	 */
	public Customer(String name, long idNr) {
		this.name = name;
		this.idNr = idNr;
		this.customerNr = currId;
		currId++;
	}

	/** Tar reda på kundens namn. */
	public String getName() {
		return name;
	}

	/** Tar reda på kundens personnummer. */
	public long getIdNr() {
		return idNr;
	}

	/** Tar reda på kundens kundnummer. */
	public int getCustomerNr() {
		return customerNr;
	}

	/** Returnerar en strängbeskrivning av kunden. */
	public String toString() {
		return "("+name+", id "+idNr+", kundnr: "+customerNr+")";
	}
}
