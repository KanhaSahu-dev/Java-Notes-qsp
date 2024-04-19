public class unique_array{

    static public int get_unique_array(int[] arr){
        if(arr.length==0 || arr.length==1)
        return 0;

        int[] temp = new int[arr.length];
        int j = 0;
        for(int i = 0;i<arr.length;i++)
            if(arr[i]!=arr[i+1])
            temp[j++] = arr[i];
        
        

        return arr.length;
    }

    public static void main(String[] args) {
        
    }
}