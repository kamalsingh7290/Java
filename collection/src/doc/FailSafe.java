package doc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {

	public static void main(String[] args) {
		List<String> a=new CopyOnWriteArrayList<String>();
//		List<String> a=new ArrayList<String>()/
		a.add("kamal");
		a.add("vamal");
		a.add("uamal");
		Iterator i=a.iterator();
		while (i.hasNext()) {
			Object object = (Object) i.next();
			a.add("bisja");
			System.out.println(object);
		}
	}

}
