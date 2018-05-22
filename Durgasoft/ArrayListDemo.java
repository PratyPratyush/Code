import java.util.*;
class Tree_set{
	public static void main(String args[]){
		ArrayList t = new ArrayList();
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		//t.add(20);
		System.out.println(t);
		Collections.sort(t,new MyComparator());
	}
}
class MyComparator implements Comparator
{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1 = (Integer)obj1;
		Integer i2 = (Integer)obj2;
		return i2.compareTo(i1);
	}
}