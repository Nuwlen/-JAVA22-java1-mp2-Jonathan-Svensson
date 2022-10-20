
class Kund {
	private int itemsBought;
	private int moneySpent;
	
	Kund() {
		this.itemsBought = 0;
		this.moneySpent = 0;
	}
	
	int getItemsBought() {
		return itemsBought;
	}
	
	int getMoneySpent() {
		return moneySpent;
	}
	
	public int setItemsBought() {
		return itemsBought++;
	}
	
	public void setUpdateMoneySpent(int totalMoneySpent) {
		moneySpent += totalMoneySpent;
	}
}
