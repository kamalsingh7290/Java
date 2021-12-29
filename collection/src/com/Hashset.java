package com;

import java.util.Collection;
import java.util.Collections;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
class Employ{
	String name;
	String address;
	int code;
	public Employ(int code,String name,String address) 
	{
		this.address=address;
		this.code=code;
		this.name=name;
	}
	
	public boolean equals(Object o)
	{
		Employ e=(Employ)o;
		if(this.code==e.code)
			return true;
		else
			return false;
	}
	public int hashCode()
	{
		return code*10;
	}
	public String toString()
	{
		return code+" "+address+" "+name;
	}
	public void show()
	{
		System.out.println("Name= "+name+" Address= "+address+" Code= "+code);
	}
}
public class Hashset {

	public static void main(String[] args) {
//		Set s=new HashSet();
//		s.add(1);
//		s.add(1);
//		s.add(1);
//		s.add(1);
//		s.add(1);
//		s.add(3);
//		System.out.println(s);
//		s.forEach(b->{System.out.println(b);});
		Set<Employ> s=new LinkedHashSet<Employ>();
		s.add(new Employ(1000,"kamal","ghaziabad"));
		s.add(new Employ(9000,"tamal","mumbai"));
		s.add(new Employ(900000,"nishant","dubai"));
		s.add(new Employ(7000,"vijay","uk"));
		s.add(new Employ(6000,"vishall","delhi"));
		Iterator<Employ> e=s.iterator();
		while (e.hasNext()) {
			Employ employ = (Employ) e.next();
			employ.show();
		}
	}

}
