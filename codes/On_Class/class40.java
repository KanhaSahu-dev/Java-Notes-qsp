import java.util.ArrayList;

public class class40 {
    public static void main(String[] args) {
        ArrayList a = new ArrayList();
        a.add(10);
        a.add("aaa");
        a.add("bbb");
        a.add("ccc");
        a.add("ddd");
        a.add("eee");
        System.out.println(a.get(1));
        ArrayList l1 = new ArrayList(a);
        System.out.println(l1);
    }
}
