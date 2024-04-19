import java.util.Scanner;

public class task7 {
// write a program to find all the even and odd numbers from 0 to n numbers .
// write a program to find the sum of all the even and odd numbers from 0 to n .
// write a program to check whether a number is prime or not.
// write a program to display all the prime numbers from 0 to n numbers.
// wrtie a program to find the sum of all prime numbers from 0 to n.
    public static void main(String[] args) {

        // write a program to find all the even and odd numbers from 0 to n numbers .

        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = s.nextInt();
        // for (int i = 0;i<=n;i++){
        //     if(i%2==0)
        //     System.out.println("This number is even number "+i);
        //     else
        //     System.out.println("This number is odd number "+i);
        // }

        // write a program to find the sum of all the even and odd numbers from 0 to n .

        // Scanner s = new Scanner(System.in);
        // System.out.println("Enter a number");
        // int n = s.nextInt();
        // int sum = 0;
        // for(int i = 0;i<=n;i++)
        //     sum+=i;
        // System.out.println("The sum of the even and odd numbers is "+sum);

        // write a program to check whether a number is prime or not.
        
        Scanner s = new Scanner(System.in);


        // int n = s.nextInt();
        // double x = Math.sqrt(n);
        // boolean isPrime = true;
        // for (int i = 2;i<x;i++){
        //     if(n%i == 0){
        //         isPrime = false;
        //         break;
        //     }
        // }
        // if(isPrime)
        // System.out.println("This is a prime number");
        // else
        // System.out.println("This is not a prime number");

        // write a program to display all the prime numbers from 0 to n numbers.

        // int n = s.nextInt();
        // for (int i = 2;i<=n;i++){
        //     double y = Math.sqrt(i);
        //     boolean isPrime = true;
        //     for(int j = 2;j<=y;j++){
        //         if(i % j == 0){
        //             isPrime = false;
        //         break;
        //         }
        //     }
        //     if(isPrime)
        //     System.out.println("This is prime number "+i);


        // }

        // wrtie a program to find the sum of all prime numbers from 0 to n.

        int n = s.nextInt();
        int sum = 0 ;
        for (int i = 2;i<=n;i++){
            double x = Math.sqrt(i);
            boolean isPrime = true;

            for (int j = 2;j<=x;j++){
                if(i%j == 0)
                {
                    isPrime = false;
                    break; }


            }
            if(isPrime){
            System.out.println("This is a prime number " +i);
            sum+=i;
        }
        
        }
        System.out.println("The sum of the prime numbers is "+sum);

        
        s.close();
        }
    }

// 403 room