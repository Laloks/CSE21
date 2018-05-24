import java.util.Scanner;
public class Shop {
	static Scanner sc = new Scanner(System.in);
	 static double prices[];
	 static String names[];
	 static double discount;
	 static int qualify;
	 static boolean buy =false;
	 static boolean list = false;
	 static int amounts[];
	public static void main(String []args){
		intro();
	}
	public static void intro(){
		System.out.println("This program supports 4 functions:");
		System.out.println("1.Setup Shop:");
		System.out.println("2.Buy:");
		System.out.println("3.List Items:");
		System.out.println("4.Checkout:");
		System.out.print("Please choose the function you want:");
		int step = sc.nextInt();
		System.out.println("");
		if (step == 1) {
			buy = true;
			setupShop();
			intro();
		}
		else if (step == 2 && buy == true) {
			list = true;
			buyStuff();
			intro();
		}
		else if (step==3 && buy==false || step==4 && buy ==false) {
			System.out.println("Try again: You have not bought anything");
			intro();
		}
		else if (step == 3 && list == true) {
			listStuff();
			intro();
		}
		else if (step == 4 && list == true) {
			checkoutStuff();
		}
		else if (step < 1 || step > 4) {
			System.out.println("Error: Do not know " + step);
			System.out.println();
			intro();
		}
 		else {
			System.out.println("Shop is not setup yet!");
			System.out.println();
			intro();
		}
	}
	public static void setupShop(){
		System.out.print("Please enter the number of items:");
		int items = sc.nextInt();
		if(items>0){
			names= new String[items];
			prices= new double[items];
			amounts= new int[items];
			}
		for(int i =0;i<items;i++)	{
			System.out.print("Enter the name of product "+i+": ");
			names[i]=sc.next();
			
			System.out.print("Enter the price of product "+i+": ");
			prices[i]=sc.nextDouble();	
		}
		System.out.print("Please enter the amount to qualify for discount: ");
		qualify = sc.nextInt();
		System.out.print("Please enter the discount rate (0.1 for 10%): ");
		discount= sc.nextDouble();
		System.out.println("");
	}
	public static void buyStuff(){
		for(int i =0;i<names.length;i++){
		System.out.print("Enter the amount of "+names[i]+" : ");
		amounts[i]=sc.nextInt();
		}
	}
	public static void listStuff(){
		for(int i =0;i<names.length;i++){
			if(amounts[i]>=0)
			System.out.println(amounts[i]+" count of "+names[i]+ " @ "+ prices[i]+" = $"+prices[i]*amounts[i]);
		}
	}
	public static void checkoutStuff(){
		double total=0.0;
		double discounts=0.0;
		System.out.println("Thanks for coming");
		for(int i =0;i<names.length;i++){
			total+=prices[i]*amounts[i];
		}
			if(total>=qualify) {
				discounts=total*discount;
			}
		System.out.println("Sub Total : $"+total);
		System.out.println("-Discount : $"+discounts);
		total = total-discounts;
		System.out.println("Total : $"+total);	
	}
}