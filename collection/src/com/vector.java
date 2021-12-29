package com

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class vector {

	public static void main(String[] args) {
//		Vector  v=new Vector();
//		System.out.println(v.capacity());
//		System.out.println(v.size());
//		v.add("kamal");
//		v.add("ibfhdd");
//		v.add(89);
//		v.addElement(0.9897);
//		v.add(9.786899);
//		v.add(true);
//		v.add("kimala");
//		System.out.println(v);
//		System.out.println(v.capacity());
//		System.out.println(v.size());
//		Iterator obj=v.iterator();
//		while (obj.hasNext()) {
//			System.out.println(obj.next());
//		}
//		System.out.println("enumeration");
//		Enumeration e=v.elements();
//		while (e.hasMoreElements()) {
//			System.out.println(e.nextElement());
//			
//		}
//		Vector  v=new Vector(5);
//		System.out.println(v.capacity());
//		System.out.println(v.size());
//		v.add("kamal");
//		v.add("ibfhdd");
//		v.add(89);
//		v.addElement(0.9897);
//		v.add(9.786899);
//		v.add(true);
//		v.add("kimala");
//		System.out.println(v);
//		System.out.println(v.capacity());
//		System.out.println(v.size());
		
		Vector  v=new Vector(5,1);
		System.out.println(v.capacity());
		System.out.println(v.size());
		v.add("kamal");
		v.add("ibfhdd");
		v.add(89);
		v.addElement(0.9897);
		v.add(9.786899);
		v.add(true);
		v.add("kimala");
		v.add("kimala");
		System.out.println(v);
		System.out.println(v.capacity());
		System.out.println(v.size());
	}

}
