import java.util.Scanner;

public class calcul {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in,"cp866"); //, charsetName:"cp866" - не работает
        System.out.println("введите два числа: ");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        // sc.nextLine();
        System.out.println("введите оператор: ");
        String oper = sc.next(); //next чтобы не пропускал строку
        sc.close();
        if (oper.charAt(0) == '+') {
            System.out.printf("%.2f %s %.2f = %.2f", num1, oper, num2, num1 + num2);
        }
        else if (oper.charAt(0) == '-') {
            System.out.printf("%.2f %s %.2f = %.2f", num1, oper, num2, num1 - num2);
        }
        else if (oper.charAt(0) == '*') {
            System.out.printf("%.2f %s %.2f = %.2f", num1, oper, num2, num1 * num2);
        }
        else if (oper.charAt(0) == '/') {
            System.out.printf("%.2f %s %.2f = %.2f", num1, oper, num2, num1 / num2);
        }

    }    
}
