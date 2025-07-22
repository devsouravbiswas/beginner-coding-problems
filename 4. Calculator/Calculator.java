import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        while (true){
            System.out.println("Enter the Operator");
            char op = in.next().trim().charAt(0);
            int ans = 0;
            if (op == '+' || op == '_' || op == '*' || op == '/' || op == '%' ){

                System.out.print("Enter two numbers : ");

                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+'){
                    ans = num1 + num2 ;
                }

                if (op == '_'){
                    ans = num1 - num2 ;
                }

                if (op == '*'){
                    ans = num1 * num2 ;
                }

                if (op == '/'){
                    ans = num1 / num2 ;
                }

                if (op == '%'){
                    ans = num1 % num2 ;
                }

            } else if ( op == 'X' || op == 'x') {
                break;
            } else {
                System.out.println("Wrong operator");
            }
            System.out.println(ans);
        }
    }
}