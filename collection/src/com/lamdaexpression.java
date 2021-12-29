package com;
//
//interface A
//{
//	void show();
//}
//public class lamdaexpression {
//
//	A a=new A() {
//		public void show()
//		{
//			System.out.println("this is anonymous class");
//		}
//	};
//	A b=new A() {
//		
//		public void show()
//		{
//			System.out.println("this is anonymous class2");
//		}
//	};
//	public static void main(String[] args) {
//		
//		lamdaexpression obj=new lamdaexpression();
//		obj.a.show();
//		obj.b.show();
////		a.show();
////		b.show();
//	}
//
//}
//						LAMDA EXPRESSION
						//Syntax:(argument-list)->(body)
						//eg:ref object=()->{sys}
interface A
{
	void show();
}
public class lamdaexpression {


	public static void main(String[] args) {
		lamdaexpression obj=new lamdaexpression();
		A a=()->{System.out.println("hlo lamda");};
		A b=()->{System.out.println("hlo lamda");};
		a.show();
		b.show();
	}
}



//interface A
//{
//	void show();
//}
//class main implements A
//{
//	public void show() {
//		System.out.println("this is main implements A");
//	}
//}
//class lamdaexpression implements A
//{
//	public void show()
//	{
//		System.out.println("this is load class implements A");
//	}
//	public static void main(String[] args) 
//	{
//		A a=new main();
//		a.show();
//		A b=new lamdaexpression();
//		b.show();
//	}
//}







//Collections.sort(arraylist(a,b){
//	return a.name.compareTo(b.name);
//	
//});
	

//Stream<Employ> fdat=arraylist.stream().filter(a->a.age>23);
//fdat.forEach(a->System.out.print(a.age))
	