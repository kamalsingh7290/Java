package com;
import java.util.TreeSet;
class tree 
{
	String name;
	int id;
	tree(String name,int id)
	{
		this.id=id;
		this.name=name;
	}
	public String toString() 
	{
		return name+id;
	}
//	public int compareTo(Object o)
//	{
//		tree e =(tree)o;
//		if(this.id>e.id)
//			return 1;
//		else if (this.id<e.id) {
//			return -1;
//		}
//		else
//			return 0;
//	}
}
public class Treeset {

	public static void main(String[] args) {
		
	TreeSet a=new TreeSet();
	a.add(new tree("kamal",101));
	a.add(new tree("kamal",101));
	a.add(new tree("kamal",101));
	a.add(new tree("kamal",103));
	a.add(new tree("kamal",105));
//	System.out.println(a);
//	System.out.println(a);
	a.forEach(b->System.out.println(b));
	}

}
