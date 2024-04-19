import java.util.Scanner;

public class class34 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the size of the column");
       int n = sc.nextInt();
       int[][] a = new int[5][n];
       for(int i = 0;i<5;i++){
           for(int j=0;j<n;j++){
               a[i][j] = sc.nextInt();    
            }
        }
        int sum =0;
       for(int i = 0;i<5;i++){
        for(int j=0;j<n;j++){
            System.out.print(a[i][j]+" ");
            if(i==j){
                sum+=a[i][j];
            }    
        }
        System.out.println();
       }
       System.out.println(sum);
       sc.close();
    }
}

// 00 01 02 03 04
// 10 11 12 13 14
// 20 21 22 23 24
// 30 31 32 33 34
// 40 41 42 43 44