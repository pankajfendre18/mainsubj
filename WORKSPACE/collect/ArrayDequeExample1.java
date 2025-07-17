package com.collect;
import java.util.ArrayDeque;

public class ArrayDequeExample1 {
	 public static void main(String[] args)
	    {
	        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();
//	        arrayDeque.offer("One");
//	        arrayDeque.offer("Two");
//	        arrayDeque.offer("Three");
//	        arrayDeque.offer("Four");
//	        arrayDeque.offer("Five");
	        
	        arrayDeque.push("One");
	        arrayDeque.push("Two");
	        arrayDeque.push("Three");
	        arrayDeque.push("Four");
	        arrayDeque.push("Five");
	 
	        System.out.println(arrayDeque);     //Output : [One, Two, Three, Four, Five]
//	        System.out.println(arrayDeque.poll());    //Output : One
//	        System.out.println(arrayDeque.poll());    //Output : Two
	    }
}
