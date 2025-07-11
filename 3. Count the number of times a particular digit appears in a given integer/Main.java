import java.util.Scanner;

// Q: Write a program to count the number of times a particular digit appears in a given integer

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Number");
        int n = in.nextInt();
        System.out.println("Enter the digit you want to count");
        int numb = in.nextInt();
        int count = 0;
        while (n > 0) {
            int rem = n%10;
            if (rem == numb){
                count++;
            }
            n = n / 10;
        }
        System.out.println("The ans is " + count);
    }
}
