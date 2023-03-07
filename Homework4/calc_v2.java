package HomeWork.Homework4;
import java.util.LinkedList;
import java.util.Scanner;
public class calc_v2 {
    

           
    public static void main(String[] args) {
        LinkedList<Double> result = new LinkedList<>();
        Scanner sc = new Scanner(System.in,"cp866");
        
        System.out.println("введите первое число: ");
        double num1 = sc.nextDouble();
        result.add(num1);
        
        while (true) {
            
            System.out.println("введите оператор или '~' для отмены операции: ");
            Character oper =  sc.next().charAt(0); 

            System.out.println("введите второе число: ");
            double num2 = sc.nextDouble();
            double res;
                
            switch(oper) {
                case '+': res = result.getLast() + num2;
                result.add(res);
                System.out.println(result.get(result.size()-2) + " " + oper + " " + num2 + " = " + result.getLast());
                break;
                case '-': res = result.getLast() - num2;
                result.add(res);
                System.out.println(result.get(result.size()-2) + " " + oper + " " + num2 + " = " + result.getLast());
                break;
                case '*': res = result.getLast() * num2;
                result.add(res);
                System.out.println(result.get(result.size()-2) + " " + oper + " " + num2 + " = " + result.getLast());
                
                break;
                case '/': res = result.getLast() / num2;
                result.add(res);
                System.out.println(result.get(result.size()-2) + " " + oper + " " + num2 + " = " + result.getLast());
                
                break;
                case '~': result.removeLast();
                System.out.printf("Операция отменена, работаем с числом: "+ result.getLast());
                System.out.println();
                
                break;                    
                default:  System.out.printf("Wrong operator");
                return;
                }
            // System.out.println(result); 
   
            }

        }
      
}
    
    


