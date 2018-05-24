import java.util.Scanner;

public class RunShop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	//	ShopArr shop = new ShopArr();
		
		System.out.print("Enter the number of Cheese :");
		ShopArr shop = new ShopArr(input.nextInt());
		shop.run();
		System.out.println("Ran with Cheese Total: " + Cheese.numCheese);
	}

}
