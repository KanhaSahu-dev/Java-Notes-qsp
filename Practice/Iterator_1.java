import java.util.ArrayList;
import java.util.Iterator;
public class Iterator_1{
    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();

        for(int i = 1;i<=10;i++){
            ar.add(i);
        }

        Iterator<Integer> i =  ar.iterator();        
        while(i.hasNext()){
            Integer j = (Integer) i.next();
            System.out.println(j);
        }
    }
}