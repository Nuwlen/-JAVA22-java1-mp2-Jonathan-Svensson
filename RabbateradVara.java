
class RabbateradVara extends Vara {
	private double discount;

	RabbateradVara(String name, int price, int quantity, double discount) {
		super(name, price, quantity);
		this.discount = discount;
	}

	int getPrice() {
		int price = super.getPrice();
		double newPrice = price * (1 - discount);
		return (int) Math.round(newPrice);
	}
}
