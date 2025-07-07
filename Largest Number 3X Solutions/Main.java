import java.util.Scanner;

// Q: Find the largest of the 3 numbers.
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 1st number");
        int a = in.nextInt();
        System.out.println("Enter 2nd number");
        int b = in.nextInt();
        System.out.println("Enter 3rd number");
        int c = in.nextInt();

        // Solution -1
//        int max = a;
//        if (b > max){
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }
//
//        // Solution -2
//        int max = 0;
//        if (a>b){
//            max = a;
//        } else {
//            max = b;
//        }
//        if (c > max){
//            max = c;
//        }

        // Solution -3
        int max = Math.max(c, Math.max(a ,b));
        System.out.println("Largest Number is " + max);
    }
}