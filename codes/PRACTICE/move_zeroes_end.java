class move_zeroes_end{
    static int[] resize(int[] a,int n){
        int[] t = new int[n];
        for(int i=0;i<a.length;i++){
            t[i] = a[i];
        }
        a = t;
        return a;
    }
    static void show(int[] a){
        for(int i = 0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        show(a);
        System.out.println(a.length);
        a = resize(a,a.length*2);
        show(a);
        System.out.println(a.length);
    }
}