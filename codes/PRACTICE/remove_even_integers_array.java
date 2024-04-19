import java.util.Scanner;

public class remove_even_integers_array {

    static int[] remove_even(int[] ar) {
        // int[] result = new int[ar.length];
        int count = 0;
        for (int i = 0; i < 5; i++) {
            if (ar[i] % 2 == 0)
                count++;
        }
        int[] res = new int[ar.length - count];
        int j = 0;
        for (int i = 0; i < 5; i++) {
            if (ar[i] % 2 != 0) {
                res[j] = ar[i];
                j++;
            }
        }

        return res;
    }

    static void show(int[] ar) {
        for (int i = 0; i < ar.length; i++) {
            System.out.print(ar[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] ar = new int[5];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a number");
            ar[i] = sc.nextInt();
        }

        ar = remove_even(ar);
        show(ar);

        sc.close();
    }
}
