package oop;

public class DecrementableCounter extends Counter{

	public void decrement() {
		int prev = super.value();
		super.reset();
		for(int i=0;i<prev-1;i++)
			super.increment();
	}
}
