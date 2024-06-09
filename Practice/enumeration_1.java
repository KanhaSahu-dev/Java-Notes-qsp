import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Vector;

public class enumeration_1 {
    public static void main(String[] args) {
        Vector<Integer> a = new Vector<Integer>();
    for(int i = 1;i<10;i++){
        a.add(i);
    }

    Enumeration<Integer> e = a.elements();

        while(e.hasMoreElements()){
            Integer i = (Integer)e.nextElement();

            System.out.println(i);

        }

    }
}
