/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class Car
{
    int model;
    Car(int model)
    {
        this.model = model;
    }
}
class Demo
{
	public static void swap(Car c1,Car c2){
		Car temp=c1;
		c1=c2;
		c2=c1;
	}
    public static void main(String[] args)
    {
        Car c1 = new Car(101);
        Car c2 = new Car(202);
        System.out.println(c1.model);
        System.out.println(c2.model);
        System.out.println("After");
        swap(c1,c2);
        // Car temp=c1;
        // c1=c2;
        // c2=temp;
        System.out.println(c1.model);
        System.out.println(c2.model);
    }
}