/**
   Program to examing what the hash codes are for some Java objects.

   @author Jim Teresco
   @version Fall 2019
*/

import java.util.ArrayList;

public class HashCodes {

    public static void main(String args[]) {

	System.out.println("Strings:");
	System.out.println("a " + "a".hashCode());
	System.out.println("b " + "b".hashCode());
	System.out.println("c " + "c".hashCode());
	System.out.println("ab " + "ab".hashCode());
	System.out.println("abc " + "abc".hashCode());
	System.out.println("smile " + "smile".hashCode());
	System.out.println("miles " + "miles".hashCode());
	System.out.println("slime " + "slime".hashCode());

	System.out.println("Integers:");
	System.out.println("Integer(0) " + new Integer(0).hashCode());
	System.out.println("Integer(-1) " + new Integer(-1).hashCode());
	System.out.println("Integer(10) " + new Integer(10).hashCode());
	System.out.println("Integer(65536) " + new Integer(65536).hashCode());

	System.out.println("Doubles:");
	System.out.println("Double(0.0) " + new Double(0.0).hashCode());
	System.out.println("Double(-1.0) " + new Double(-1.0).hashCode());
	System.out.println("Double(5.5) " + new Double(5.5).hashCode());
	System.out.println("Double(-3723.234) " + new Double(-3723.234).hashCode());

	System.out.println("ArrayLists:");
	ArrayList<Integer> al = new ArrayList<Integer>(10);
	System.out.println("{} (size 10): " + al.hashCode());
	al.add(1);
	System.out.println("{1} (size 10): " + al.hashCode());
	al.add(2);
	System.out.println("{1,2} (size 10): " + al.hashCode());
	al.add(3);
	System.out.println("{1,2,3} (size 10): " + al.hashCode());
	al = new ArrayList<Integer>(1000);
	System.out.println("{} (size 1000): " + al.hashCode());
	al.add(1);
	al.add(2);
	al.add(3);
	System.out.println("{1,2,3} (size 1000): " + al.hashCode());    
	al = new ArrayList<Integer>(10);
	al.add(3);
	System.out.println("{3} (size 10): " + al.hashCode());
	al.add(2);
	System.out.println("{3,2} (size 10): " + al.hashCode());
	al.add(1);
	System.out.println("{3,2,1} (size 10): " + al.hashCode());
    }
}
