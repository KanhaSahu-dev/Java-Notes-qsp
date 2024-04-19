// class hash_code{
//     int x = 10;
//     int hash_code(){
//         return 1;
//     }
//     public static void main(String[] args) {
//         hash_code o = new hash_code();
//         System.out.println(o);
//         System.out.println(o.x);
//         System.out.println(o.hash_code());
//     }
// }

class hash_code{
    private String x;
    public hash_code(String x){
        this.x = x;
    }

    public static hash_code hash_code(String x){
        return new hash_code(x);
    }

    public String getX(){
        return this.x;
    }

    public String toString(){
        return this.x+"";
    }
    //! One way of overriding the equals method which accepts the object parameter

    // public boolean equals(Object o){
    //     int s = this.x;
    //     hash_code o1 = (hash_code)o;
    //     int s1 = o1.x;
    //     return s==s1?true:false;
    // }

    //! Now it accepts the string parameter

    // public boolean equals(hash_code h){
    //     int s1 = this.x;
    //     int s2 = h.x;
    //     System.out.println(s1);
    //     System.out.println(s2);
    //     return s1==s2?true:false;
    // }

    public boolean equals(hash_code h){
        return this.x.equals(h.x);
    }
    public static void main(String[] args) {
        hash_code o = hash_code.hash_code("2");//factory method object
        // System.out.println(o);
        hash_code o1 = new hash_code("10");//Normal Object
        System.out.println(o.equals(o1));
    }
}

