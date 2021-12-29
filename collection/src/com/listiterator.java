package com;

import java.util.ArrayList;
import java.util.ListIterator;

public class listiterator {

	public static void main(String[] args) {
		ArrayList arr=new ArrayList();
		listiterator li=new listiterator();
		arr.add(10);
		arr.add('l');
		arr.add(true);
		arr.add("ksmsl");
		arr.add("ksmsl");
		arr.add(90.978);
		
		ListIterator<Comparable> obj= arr.listIterator();
		while (obj.hasNext()) {
			Object a =obj.next();
			System.out.println(a);
//			a.show();
		}
//		while (obj.hasPrevious()) {
//			Object a = obj.previous();
//			System.out.println(a);
////			a.show();
//		}
	}

}
