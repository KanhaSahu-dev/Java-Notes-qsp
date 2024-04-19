class Student{
    String name;
    int id;
    Student(String name,int id){
        this.name = name;
        this.id = id;
        Student o = new Student();
        o.name = name;
        o.id = id;
        new Student(o);
    }

    Student(){
        System.out.println("hii , another object is created inside the first constructor.");
    }
   
    Student(Student o){
        o.m1();
    }

    public void m1(){
        System.out.println("method called");
    }

    public static void main(String args[]){
        Student s1 = new Student("abc",10);
        System.out.println(s1.name);
    }
}