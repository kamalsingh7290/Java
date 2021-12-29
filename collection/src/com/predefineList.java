package com;

import java.util.ArrayList;
import java.util.ListIterator;

class pre{
	String name,adress;
	int age;
	pre(String name,String adress,int age)
	{
		this.name=name;
		this.adress=adress;
		this.age=age;
	}
	public String toString()
	{
		return name+" "+adress+" "+age;
	}
}
public class predefineList {
	public static void main(String[] args) {
		pre p1=new pre("kamal","delhi",20);
		pre p2=new pre("nishant","bhopal",21);
		pre p3=new pre("vijay","gzb",22);
//		System.out.println(p1+" "+p2+" "+p3);
		ArrayList<pre> arr=new ArrayList<pre>();
		arr.add(p1);
		arr.add(p2);
		arr.add(p3);
//		System.out.println(arr);
//		arr.forEach((a)->System.out.println(a));
//			System.out.println(pre);
		}
	}

}
