// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.

package HomeWork.Homework4;
import java.util.Scanner;
import java.util.LinkedList;
public class enque_deque_first {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,6,3,8,9,23,45,45,78};
        LinkedList<Integer> list3 = new LinkedList<>();
        // LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < arr.length; i ++){
            list3.add(arr[i]);
        }
        Scanner sc = new Scanner(System.in,"cp866");
        System.out.println("Дана очередь 5,6,3,8,9,23,45,45,78. Введите действие: \n 1 - помещает элемент 123 в конец очереди, \n 2 - возвращает первый элемент из очереди и удаляет его, \n 3 - возвращает первый элемент из очереди, не удаляя");
        int num = sc.nextInt();
        if (num == 1){
            System.out.println(enqueue(list3));
        }
        else if (num == 2){
            System.out.println(dequeue(list3));
            System.out.println(list3);
        }
        else if (num == 3){
            System.out.println(first(list3)); 
        }
        else System.out.println("некорректый ввод");
        sc.close();
    }    

    public static int dequeue(LinkedList<Integer> list) {
        var el = list.remove();
        // System.out.println(list);
        return el;
    }
    public static LinkedList<Integer> enqueue(LinkedList<Integer> list) {
        list.addLast(123);
        // System.out.println(list);
        return list;
    }
    public static Object first(LinkedList<Integer> list) {
        var el = list.getFirst();;
        System.out.println(list);
        return el;
    }
}
