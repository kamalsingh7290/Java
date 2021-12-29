package doc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
class kamal
{
	String name;
	int id;
	kamal(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString()
	{
		return "name=> "+name+", id=> "+id; 
	}
}

public class lamdha 
{
	public static void main(String[] args) {
		List<kamal> arr=new ArrayList<kamal>();
		kamal k1=new kamal("kamal",101);
		kamal k2=new kamal("vinay",908);
		kamal k3=new kamal("golu",783);
		kamal k4=new kamal("sujata",100);
		kamal k5=new kamal("anajli",90);
		kamal k6=new kamal("ajay",56);
		arr.add(k1);
		arr.add(k2);
		arr.add(k3);
		arr.add(k4);
		arr.add(k5);
		arr.add(k6);
//		a.forEach(b->System.err.println(b));
//		Collections.sort(arr,(a,b)->{
//			return  a.name.compareTo(b.name);
//		}
//		);
//		for(kamal e:arr)
//		{
//			System.out.println(e.name+" "+e.id);
//		}
		Stream<kamal> s=arr.stream().filter(a->a.id<=100);
		s.forEach(a->System.out.println(a.id+" "+a.name));
	}
}
