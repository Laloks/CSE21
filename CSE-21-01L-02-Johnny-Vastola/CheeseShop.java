import java.util.Scanner;
public class CheeseShop {

	public static void main(String[]args){
		System.out.println("We sell 3 kinds of Cheese\nDalaran Sharp: $1.25 per pound\nStormwind Brie: $10.00 per pound\nAlterac Swiss: $40.00 per pound");
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the amount of Sharp in lbs:");
		int Sharp =sc.nextInt();
		System.out.print("Enter the amount of Brie in lbs:");
		int Brie =sc.nextInt();
		System.out.print("Enter the amount of Swiss in lbs:");
		int Swiss =sc.nextInt();		
		System.out.print("Display the itemized list? (1 for yes)");
		int Itemized = sc.nextInt();
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
		}
		double subtotal=(Sharp*1.25+Brie*10+Swiss*40);
		double discount=0;
		if(subtotal>=50 && subtotal<100){
			discount=10;	
		}
		else if(subtotal>=100)
		{
			discount=25;
		}
		System.out.println("Subtotal: $"+subtotal);
		System.out.println("-Discount: $"+discount);
		System.out.println("Total: $"+(subtotal-discount));
		
	}
}
