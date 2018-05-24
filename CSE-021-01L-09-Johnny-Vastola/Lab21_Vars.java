import java.util.*;

public class Lab21_Vars {

	public static void main(String[] args) {

		int i=0, j =0;
		int var0, var1;
		
		// Fix 1: Correctly typecast 5.0 to an int so it can assigned to var3.
		int var2 = 0, var3 = (int)5.0;
		
		// Fix 2: Correctly declare a variable as an array.
		int[] arri0 = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
		
		double[] arrd0 = {0.0, 1.0, 2.0, 3.0, 4.0};
		
		// Fix 3: What's wrong with temp? Fix it.
		if (i < j) {
			int temp = 0;
			System.out.println("Temp is " + temp);
		} else {
			int temp = 1;
			System.out.println("Temp is " + temp);
		}
		
		// Fix 4: Correctly calculate square of sums and print it as total.
		int total=0;
		for (i = 0; i < 10; i++) {
			total += i*i;
		}
		System.out.println("i value is " + i);
		System.out.println("Total is " + total);
		
		// Fix 5: Figure out the logical error in lines 36-42, and correct it.
		Cheese jack;
		Cheese monterey = new Cheese("Monterey");
		jack = monterey;
		System.out.println("Monterey name is " + monterey.getName());
		jack.setName("Jack");
		System.out.println("Jack name is " + jack.getName());
		System.out.println("Monterey name is still " + monterey.getName());
	
		// Fix 6: Make the following code shorter by combining redundant 
		//        (unnecessary/duplicate) statements
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first number: ");
		int first=input.nextInt();
		System.out.print("Enter second number: ");
		int second=input.nextInt();
		if (first > var3) 
			System.out.println("First is greater");
		else
			System.out.println("First is Less than or equal");
		if (second < var3)
				System.out.println("Second is Less than");
		else
				System.out.println("Second is Greater or equal");	
		// Fix 7: Print out the first number entered by the user
		//        (Hint - You will need to modify the above code)
		System.out.print(first);
		
	}

}
