import java.io.*;
import java.util.*;
// class Popcorn{
// 	public void test1(){
// 		System.out.println("sweet");
// 	}
// 	public void test2(){
// 		System.out.println("sweet2");
// 	}
// }
// class Check extends Popcorn{
// 	public void test1(){
// 			System.out.println("childsweet");
// 	}

// 	public static void main(String args[]){
// 		Check c =new Check();
// 		c.test1();
// 	}
// }
// class Popcorn{
// 	public void test1(){
// 		System.out.println("sweet");
// 	}
// 	public void test2(){
// 		System.out.println("sweet2");
// 	}
// }
// class Check {

// 	public static void main(String args[]){
// 		Popcorn p = new Popcorn(){
// 			public void test1(){
// 				System.out.println("sweetchild");
// 			}
// 		};
// 		p.test1();
// 		p.test2();
// 		// Check c =new Check();
// 		// c.test1();
// 	}
// }
class Check{
	public static void main(String args[]){
		Vector<Integer> v= new Vector<Integer>();
		v.add(2);
		v.add(3);
		v.add(4);
		System.out.println(v);
		Vector<Integer> v1 =new Vector<Integer>(v);
		v1.add(5);
		System.out.println(v1);
	}
}
