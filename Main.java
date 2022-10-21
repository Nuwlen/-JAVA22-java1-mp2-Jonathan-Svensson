import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Vara item1 = new Vara("Piggelin", 10, 5);
		Vara item2 = new Vara("Sandwich", 13, 7);
		RabbateradVara item3 = new RabbateradVara("Magnum", 25, 3, 0.25);
		Kund customer = new Kund();
		boolean run = true;

		while (run) {

			System.out.println("1. Buy " + item1.getName() + "\t" + item1.getPrice() + " SEK," + "\t"
					+ item1.getQuantity() + " in stock");
			System.out.println("2. Buy " + item2.getName() + "\t" + item2.getPrice() + " SEK," + "\t"
					+ item2.getQuantity() + " in stock");
			System.out.println("3. Buy " + item3.getName() + "\t" + item3.getPrice() + " SEK," + "\t"
					+ item3.getQuantity() + " in stock");
			System.out.println("4. Exit");

			Scanner sc = new Scanner(System.in);

			System.out.println("Choose a product: ");
			int ChoiceMenu = sc.nextInt();

			switch (ChoiceMenu) {
			case 1:
				if (item1.getQuantity() > 0) {
					item1.DecreaseQuantity();
					customer.IncreaseItemsBought();
					customer.setUpdateMoneySpent(item1.getPrice());
				} else {
					System.out.println("Item is out of stock");
				}
				break;
			case 2:
				if (item2.getQuantity() > 0) {
					item2.DecreaseQuantity();
					customer.IncreaseItemsBought();
					customer.setUpdateMoneySpent(item2.getPrice());
				} else {
					System.out.println("Item is out of stock");
				}
				break;
			case 3:
				if (item3.getQuantity() > 0) {
					item3.DecreaseQuantity();
					customer.IncreaseItemsBought();
					customer.setUpdateMoneySpent(item3.getPrice());
				} else {
					System.out.println("Item is out of stock");
				}
				break;
			case 4:
				run = false;
				System.out.println("You have bought " + customer.GetItemsBought() + " Items. Your total amount is: "
						+ customer.getMoneySpent() + "SEK");
			}
		}
	}
}
