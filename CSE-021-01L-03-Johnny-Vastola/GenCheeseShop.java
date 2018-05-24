import java.util.Scanner;
import java.util.Random;

public class GenCheeseShop {

	public static void main(String[]args){
final int MAXCHEESE = 10;
		
		String[] names = new String[MAXCHEESE];
		double[] prices = new double[MAXCHEESE];
		int[] amounts = new int[MAXCHEESE];

 		System.out.println("We sell " + MAXCHEESE + " kinds of Cheese");
		// Special 3 Cheeses
		if(MAXCHEESE>0){
		names[0] = "Dalaran Sharp";
		prices[0] = 1.25;
		System.out.println(names[0] + ": $" + prices[0] + " per pound");
		}
		if(MAXCHEESE>1){
		names[1] = "Stormwind Brie";
		prices[1] = 10.00;
		System.out.println(names[1] + ": $" + prices[1] + " per pound");
		}
		if(MAXCHEESE>2){
		names[2] = "Alterac Swiss";
		prices[2] = 40.00;
		System.out.println(names[2] + ": $" + prices[2] + " per pound");
		}

 		Random ranGen = new Random(100);

		for (int i = 3; i < MAXCHEESE; i++) {
			names[i] = "Cheese Type " + (char)('A' + i);
			prices[i] = ranGen.nextInt(1000)/100.0;
			amounts[i] = 0;
			System.out.println(names[i] + ": $" + prices[i] + " per pound");
		}
int Sharp=0;
int Brie=0;
int Swiss=0;
		Scanner sc = new Scanner(System.in);
		if(MAXCHEESE>0){
		System.out.print("Enter the amount of Sharp in lbs:");
		 Sharp =sc.nextInt();
		}
		if(MAXCHEESE>1){
		System.out.print("Enter the amount of Brie in lbs:");
		 Brie =sc.nextInt();
		}
		if(MAXCHEESE>2){
		System.out.print("Enter the amount of Swiss in lbs:");
		 Swiss =sc.nextInt();	
		}
		for (int i = 3; i < MAXCHEESE; i++) {amounts[i] = 0;
			System.out.print("Enter the amount of "+names[i] +" in lbs:");
			amounts[i]=sc.nextInt();
		}
		int Itemized=0;
		if(MAXCHEESE>0){
		System.out.print("Display the itemized list? (1 for yes)");
		Itemized = sc.nextInt();
		}
		double minitotal=0.0;
		if(Itemized>=1){
			if(Sharp>0){
				System.out.println(Sharp+" lbs of Sharp @ $1.25 = $"+1.25*Sharp);
			}
			if(Brie>0){
				System.out.println(Brie+" lbs of Brie @ $10.00 = $"+10*Brie);
			}
			if(Swiss>0){
				System.out.println(Swiss+" lbs of Swiss @ $40.00 = $"+40*Swiss);
			}
			
			for (int i = 3; i < MAXCHEESE; i++) {
			if(amounts[i]>0){
				System.out.println(amounts[i]+" lbs of "+names[i] +" @ $"+prices[i]+" = $"+amounts[i]*prices[i]);
			}
			}
		}
		for(int i=3;i<MAXCHEESE; i++){
			minitotal+=amounts[i]*prices[i];
		}
		double subtotal=(Sharp*1.25+Brie*10+Swiss*40+minitotal);
		double discount=0;
		if(subtotal>=50 && subtotal<100){
			discount=10;	
		}
		else if(subtotal>=100)
		{
			discount=25;
		}
		System.out.println("\nSubtotal: $"+subtotal);
		System.out.println("-Discount: $"+discount);
		System.out.println("Total: $"+(subtotal-discount));
		
	}
}
