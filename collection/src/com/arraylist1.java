package com;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arraylist1 {

	public static void main(String[] args) {
	ArrayList arr=new ArrayList();
//    System.out.println(arr);
	arr.add(10);
	arr.add('l');
	arr.add(true);
	arr.add("ksmsl");
	arr.add("ksmsl");
	arr.add(90.978);
//	System.out.println(arr.size()+" "+arr.contains(10)+" "+arr.isEmpty()));
//	for(Object i :arr)
//	{
//		System.out.println(i);
//	}
	System.out.println(arr);
	Iterator obj=arr.iterator();
	while (obj.hasNext()) {
		Object o =  obj.next();
		System.out.println(o);
	}
////	System.out.println(arr); 
//	arr.add(2,"vimal");
////	System.out.println(arr);
////	arr.set(0, arr);
////	List arr2=new ArrayList();
////	arr2.add("kamal");
////	arr2.add(arr);
////	System.out.println(arr2);
//	List arr3=new ArrayList(arr);
////	System.out.println(arr3);
//	arr3.add("lohl");
//	arr3.add("bdudnm");arr3.add("ajay");arr3.add("lohljl");
////	System.out.println(arr3);
////	arr3.removeAll(arr);
//	System.out.println(arr3);
//	arr3.retainAll(arr);
//	System.out.println(arr3);
	
	
	}

}
