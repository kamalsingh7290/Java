package com;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Map1 {

	public static void main(String[] args) {
//		HashMap<String, book> h=new HashMap<String,book>();
		HashMap<String, Integer> h=new HashMap<String,Integer>();
		h.put("kamal1", 101);
		h.put(null, null);
		h.put("103", null);
		h.put("102", null);
		h.put("kamal1", 101);
		h.put("kamal3", 101);
		h.put("kamal4", 104);
		h.put("kamal5", 105);
//		h.put("kamal1",(new book(101,"String name")));
//		h.put(101, 201);
//		h.put(102, "vaishali");
//		h.put(103, "mayank");
//		h.put(104, "nishant");
//		h.put(105, "kamal");
//		h.put(106, "vijay");
//		System.out.println(h);
//		Collection c=h.values();
//		c.forEach(b->System.out.println(b));
//		Set s=h.keySet();
//		Iterator i=s.iterator();
//		while (i.hasNext()) {
//			Object object = (Object) i.next();
//			System.out.println(object);
//		}
//		for (Map.Entry m :h.entrySet()) {
////			System.out.println(m);
//			System.out.println(m.getKey()+" "+m.getValue());
//		}
				Set sk=  h.entrySet();
				Iterator i=sk.iterator();
				while (i.hasNext()) {
					Object object = (Object) i.next();
					System.out.println(object);
				}
	}
}
//class book
//{
//	String s;
//	Integer a;
//	book(Integer a,String s)
//	{
//		this.a=a;
//		this.s=s;
//	}
//	public String toString()
//	{
//		return "int "+a+"String "+s;
//		
//	}
//}
