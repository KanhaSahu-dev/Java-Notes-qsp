abstract class a{
    int x = 10;
    a(){
        class20 a = new class20();
        System.out.println("Constructor of the abstract class is printed.");
        a.m1();
    }
}

class class20 extends a{
    void m1(){
        System.out.println("Method is being called.");
    }

    class20(){
        super();
    }
    public static void main(String args[]){
        
    }
}