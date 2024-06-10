public class valueOfMethod{
    int rill;

    valueOfMethod(int rill){
        this.rill = rill;
    }
    public int hashCode(){
        return rill;
    }
    public static void main(String []args){
        Integer i = Integer.valueOf("10");
        System.out.println(i);
        char a = 'a';
        Character c = Character.valueOf(a);

        System.out.println((c));
        Integer b = 10;
        int x = b.intValue();
        System.out.println(x);
        

        valueOfMethod o = new valueOfMethod(5);

        System.out.println(o.toString());   
    }
}