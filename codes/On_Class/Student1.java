class Student1{
    static Student1 t;
    private Student1(){

    }
    public static Student1 getTest(){
        if(t == null){
            t = new Student1();
        }
        return t;
    }

    public static void main(String args[]){
        Student1 t1 = Student1.getTest();
        Student1 t2 = Student1.getTest();
    }
}