import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

// Legacy , iterator.
// except legacy can we use enumeration in other things why?
public class Iterator_12 {
    public static void main(String[] args) {
        ArrayList<Integer> v = new ArrayList<>();

        for(int i = 0;i<10;i++){
            v.add(i);
        }

        Enumeration<Integer> i = v.elements();

        while(i.hasMoreElements()){
            Integer j = i.nextElement();
            System.out.println(j);
        }
    }
}
