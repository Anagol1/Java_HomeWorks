// 1) Пусть дан произвольный список целых чисел, удалить из него четные числа

package HomeWork.Homework3;

import java.util.ArrayList;
import java.util.Collection;

public class list_even_rmv {
    public static void main(String[] args) {
        int[] nums = new int[] {1,5,3,6,9,12,5,6,23,4};
        ArrayList<Integer> list_nums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            list_nums.add(nums[i]);
        }
        
        System.out.println(list_nums);
        for (int i = 0; i < list_nums.size(); i++) {
            if (list_nums.get(i)%2 == 0){
                list_nums.remove(i);
                i--;
            }            
        }
        System.out.println(list_nums);
    }        
}
