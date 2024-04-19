import java.util.*;

public class array_reverse {

    static int[] reverse(int[] arr){
        int n=arr.length-1;
        for(int i = 0;i<n;i++){
            int t=arr[n];
            arr[n--]=arr[i];
            arr[i] = t;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4,5};
        a = reverse(a);
        System.out.println(Arrays.toString(a));
    }
}
