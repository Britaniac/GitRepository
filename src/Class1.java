public class Class1 {
public void meth (Number obj) {System.out.print ("1");}
public void meth (Character obj) {System.out.print ("2");}
private static void meth (Integer obj) {System.out.print ("3");}
public void meth (int i) {System.out.print ("4");}
public void meth (double d) {System.out.print ("5");}
public static void main (String [] args) {
	Class1 q = new Class1 ();
Number n = 67;
Integer i = 78;
q.meth (n);
q.meth (i);
}
}