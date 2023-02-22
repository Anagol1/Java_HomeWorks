// 2) Задан целочисленный список ArrayList. Найти минимальное, максимальное и 
// среднее ариф. из этого списка

package HomeWork.Homework3;

import java.util.ArrayList;
import java.util.Comparator;

public class min_max_arrlist {
    public static void main(String[] args) {
        double[] nums = new double[] {1,5,3,6,9,12,5,6,23,4};
        ArrayList<Double> list_nums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++){
            list_nums.add(nums[i]);
        }
        
        System.out.println(Min(list_nums));
        System.out.println(Max(list_nums));
        System.out.println(MidArif(list_nums));

    }
    public static double Min(ArrayList<Double> list) {
        list.sort(Comparator.naturalOrder());
        double min = list.get(0);
        return min;        
    }
    public static double Max(ArrayList<Double> list) {
        list.sort(Comparator.reverseOrder());
        double max = list.get(0);
        return max;        
    }
    public static double MidArif(ArrayList<Double> list) {      
        double sum = 0;
        double mid = 1;

        for (int i = 0; i < list.size(); i++){

            sum = sum + list.get(i);
            mid = sum / list.size();
        }       
        return mid;        
    }    
}
