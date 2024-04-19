public class reverse_array {

    int[] reverse_1st_way(int[] r){
        int[] temp = new int[r.length];
        for(int i = r.length-1;i>=0;i--)
            temp[r.length-1-i] = r[i];
        return temp;
    }

    void show(int[] s){
        for(int i = 0;i<s.length;i++)
        System.out.print(s[i]+" ");
    }

    public static void main(String[] args) {
        reverse_array r = new reverse_array();

        int[] a = {1,2,3,4,5};
        a = r.reverse_1st_way(a);
        r.show(a);
    }
}
