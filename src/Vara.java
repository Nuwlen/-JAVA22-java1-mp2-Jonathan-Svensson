
class Vara {
	private String name;
	private int price;
	private int quantity;

	Vara(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	String getName() {
		return name;
	}

	int getPrice() {
		return price;
	}

	int getQuantity() {
		return quantity;
	}

	public void setQuantity() {
		this.quantity--;
	}
}
