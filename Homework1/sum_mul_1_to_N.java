// Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// а так же n! (произведение чисел от 1 до n)


import java.util.Scanner;

public class sum_mul_1_to_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "cp866"); 
        System.out.println("введите число: ");
        int vvod = sc.nextInt();
        sc.close();
        // System.out.println(vvod);

        int res_sum = 0;
        int res_mul = 1;
        for (int i = 1; i <= vvod; i++)   
            res_sum += i;
            
        for (int j = 1; j <= vvod; j++)
            res_mul *= j;
        System.out.printf("Сумма от 1 до %s: %s",vvod, res_sum);
        System.out.println();
        System.out.printf("Произведение от 1 до %s: %s",vvod,res_mul);
        System.out.println();
    }
 
}