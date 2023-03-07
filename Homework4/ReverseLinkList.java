// Пусть дан LinkedList с несколькими элементами. Реализуйте метод(не void), 
// который вернет “перевернутый” список.

package HomeWork.Homework4;
import java.util.LinkedList;
public class ReverseLinkList {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{5,6,3,8,9,23,45,45,78};
        LinkedList<Integer> list1 = new LinkedList<>();
        // LinkedList<Integer> list2 = new LinkedList<>();
        for (int i = 0; i < arr.length; i ++){
            list1.add(arr[i]);
        }
        System.out.println(list1);
        System.out.println(ReverseLList(list1));
    }
    public static LinkedList<Integer> ReverseLList(LinkedList<Integer> list) {

        LinkedList<Integer> list2 = new LinkedList<>();
        while (!list.isEmpty()){
            list2.add(list.removeLast());
        }
        return list2;
        
    }

    
    
}
