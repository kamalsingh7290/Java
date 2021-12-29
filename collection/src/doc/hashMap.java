package doc;

import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
class students
{
	int id;
	String name;
	students(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "name=>"+name+" "+"id=>"+id;
	}
	public boolean equals(Object o) 
	{
		students e=(students)o;
		if (this.name==e.name) {
			return true;
		}
		else {
			return false;
		}
	}
//	public int hashCode() {
//		
//	}
}
public class hashMap {

	public static void main(String[] args) {
//		Map m=new HashMap<Integer, students>();
//		m.put(101,new students("kamal", 1));
//		m.put(101,new students("kamal", 1));
//		m.put(104,new students("vamal", 2));
//		m.put(100,new students("tamal", 3));
//		m.put(1089,new students("oamal", 4));
		Map m=new HashMap<students, Integer>();
		m.put(new students("kamal", 1), 109);
		m.put(new students("kamal", 2), 100);
		m.put(new students("kamal", 3), 101);
		m.put(new students("kamal", 4), 102);
		m.put(new students("kamal", 5), 1098);
//		System.out.println(m);
		Set s=new HashSet<String>();
		s.add("kamal");
		s.add("kamal");
		s.add("kamal");
		System.out.println(s);
	}

}
