import java.util.*;
class Array_list
{
	public static void main(String args[])
	{
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(1);
		al.add(5);
		al.add(2);
		System.out.println(al);
		Collections.sort(al,new MyComparator());
		System.out.println(al);
	}
}
class MyComparator implements Comparator
{
	public  int compare(Object obj1,Object obj2)
	{
		Integer s1 = (Integer)obj1;
		Integer s2 = (Integer)obj2;
		return s2.compareTo(s1);
	}
}