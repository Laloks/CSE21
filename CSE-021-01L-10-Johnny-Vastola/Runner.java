package oop;

public class Runner {

	public static void main(String[] args) {
		testCounter();

		testCounter7Statements();

		testModNCounter();
		
		testModNCounter2();

		testDecrementableCounter();

		testSeasonCounter();
	}

	
	public static void testCounter() {
		System.out.println("-- testing Counter");

		Counter c = new Counter();
		c.increment();
		c.increment();
		c.increment();

		System.out.println(c.value());

	}

	
	public static void testCounter7Statements() {
		Counter c = new Counter();
		System.out.println("-- testing 7 statements");
		// include exactly 7 increment() and 7 reset() statements below
		c.increment();
		c.increment();
		c.increment();
		c.increment();
		c.reset();
		c.reset();
		c.reset();
		c.reset();
		c.reset();
		c.reset();
		c.reset();
		c.increment();
		c.increment();
		c.increment();
		System.out.println("current value: " + c.value());
	}
	public static void testModNCounter2(){
		System.out.println("-- testing ModNCounter2");
		ModNCounter2 c = new ModNCounter2(2);
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		
	}
	public static void testModNCounter(){
		System.out.println("-- testing ModNCounter");
		ModNCounter c = new ModNCounter(2);
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		
		
	}
	public static void testDecrementableCounter(){
		System.out.println("-- testing DecrementableCounter");
		DecrementableCounter c = new DecrementableCounter();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.increment();
		System.out.println(c.value());
		c.decrement();
		System.out.println(c.value());
		c.decrement();
		System.out.println(c.value());
		c.decrement();
		System.out.println(c.value());

	}
	public static void testSeasonCounter(){
		System.out.println("-- testing SeasonCounter");
		SeasonCounter c = new SeasonCounter();
		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
		System.out.println(c);
		c.increment();
	}


}
