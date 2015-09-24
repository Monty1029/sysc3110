import java.util.*;
//comment
public class AddressBook {

	private List<BuddyInfo> buddyInfo;

	public AddressBook() {
		this.buddyInfo = new ArrayList<BuddyInfo>();
	}

	public void addBuddy(BuddyInfo buddy) {
		if (buddy != null) {
			this.buddyInfo.add(buddy);
		}
	}

	public BuddyInfo removeBuddy(int index) {
		if (index >= 0 && index < this.buddyInfo.size()) {
			return this.buddyInfo.remove(index);
		}
		return null;
	}

	public static void main(String[] args) {
		BuddyInfo buddy = new BuddyInfo("Tom", "Carleton University", 1234);
		AddressBook address_book = new AddressBook();
		address_book.addBuddy(buddy);
		address_book.removeBuddy(0);

	}
}
