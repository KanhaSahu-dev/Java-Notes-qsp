// import java.util.*;

// public class class43 {
//     public static void main(String[] args) {

//         Vector v = new Vector();

//         System.out.println(v.size());

//         System.out.println(v.capacity());

//         v.addElement("Hello");

//         v.addElement(100.3345);

//         v.addElement(null);

//         v.addElement(12300);

//         v.addElement('a');

//         v.add("home");

//         System.out.println(v);

//         System.out.println(v.removeElement(12300));

//         System.out.println(v);

//         v.removeElementAt(0);

//         System.out.println(v);

//         System.out.println(v.elementAt(1));

//         System.out.println(v.firstElement());

//         System.out.println(v.lastElement());

//         System.out.println(v.size());

//         System.out.println(v.capacity());

//         v.removeAllElements();

//         System.out.println();
//     }
// }

import java.util.Vector;

public class class43{
    public static void main(String[] args) {
        Vector v = new Vector();
        for(int i=0;i<10;i++){
            v.addElement(i);
        }
        System.out.println(v.capacity());
        v.addElement(11);
        System.out.println(v.capacity());
    }
}