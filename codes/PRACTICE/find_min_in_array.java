public class find_min_in_array {
    static int min_value(int[] a){
        int min = a[0];
        for(int i = 1;i<a.length;i++)
        {
            if(min>a[i])
            min = a[i];
        }
        return min;
    }

    public static void main(String[] args) {
        int[] a = {22,33,11,4,67,42,88,9,1};
        System.out.println(min_value(a));
    }
}
