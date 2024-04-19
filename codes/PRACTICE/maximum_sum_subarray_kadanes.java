public class maximum_sum_subarray_kadanes {
    public static void main(String args[]) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};   
        // 
        int maxSum = arr[0];
        int currSum = arr[0]; // Initialize currSum to arr[0]
        int n = arr.length;
        

        
        for (int i = 1; i < n; i++) {
            currSum += arr[i];
            
            if (currSum < arr[i])
                currSum = arr[i];
              
            if (currSum > maxSum)
                maxSum = currSum;
        }
        
        System.out.println(maxSum);
    }
}
