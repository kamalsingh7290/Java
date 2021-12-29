package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class compete {

	
	public static void main(String[] args) {
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(12);
		a.add(32);
		a.add(4);
		a.add(90);
		a.add(0);
		a.add(66);a.add(9);
		a.forEach(b->{System.out.println(b);});
		System.out.println(a);
//		System.out.println("time "+System.nanoTime());
//		for (int i = 0; i < 100000; i++) 
//		{
//			a.add(i);
//		}
////		long starttime=System.nanoTime();
//		System.out.println("time is = "+System.nanoTime());
//		LinkedList<Integer> b=new LinkedList<Integer>();
//		System.out.println("Time for link "+System.nanoTime());
//		for (int i = 0; i < 100000; i++) {
//			b.add(i);
//		}
//		System.out.println("time for link "+System.nanoTime());
//	}

}
}
