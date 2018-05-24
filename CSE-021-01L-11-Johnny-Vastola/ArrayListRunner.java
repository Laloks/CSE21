package arraylist;

import java.util.ArrayList;

public class ArrayListRunner {
	
	// Use this class to run your code

	public static void main(String[] args) {
		
		testArrayList();
	}

	
	
	public static void testArrayList() {
		
		TrackedArrayList<String> words = new TrackedArrayList<String>();
		words.add ("a");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.add ("b");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.add ("c");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.remove ("b");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.add ("d");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.remove ("a");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.add ("e");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.remove ("b");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.add ("d");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.remove ("c");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
		words.remove ("d");
		System.out.println(words.toString()+ " "+words.maxSizeSoFar());
	}
}
