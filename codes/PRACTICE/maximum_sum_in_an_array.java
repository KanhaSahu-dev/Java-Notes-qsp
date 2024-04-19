public class maximum_sum_in_an_array {
    // [-2,1,-3,4,-1,2,1,-5,4]

    // 1,2,3,4
    public static void main(String[] args) {
        int[] arr = { 100, -1, -2, -3, -4, -5 };
        int n = arr.length;
        int sum = arr[0];
        for (int i = 0; i < n; i++) {
            int t = arr[i];
            for (int j = i + 1; j < n; j++) {
                t += arr[j];
            }
            if (t > sum)
                sum = t;
        }

        System.out.println(sum);
    }

    // public static void main(String[] args) {
    // int[] arr = { 100,-1,-2,-3,-4,-5 };
    // int n = arr.length;
    // int maxSum = arr[0];

    // for (int i = 0; i < n; i++) {
    // int currentSum = 0;

    // for (int j = i; j < n; j++) {
    // currentSum += arr[j];

    // // Update maxSum if the currentSum is greater
    // if (currentSum > maxSum) {
    // maxSum = currentSum;
    // }
    // }
    // }

    // System.out.println("Maximum Sum: " + maxSum);
    // }
}
