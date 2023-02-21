// Реализуйте алгоритм сортировки пузырьком числового массива (введён вами), 
// результат после каждой итерации запишите в лог-файл.
// import java.util.logging.*;

package HomeWork.Homework2;
import java.util.logging.*;
public class task_2_1_sort {
    public static void main(String[] args) throws Exception {

        Logger logger = Logger.getLogger(task_2_1_sort.class.getName());
        // ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("log1.txt");
        logger.addHandler(fh);
        // logger.addHandler(ch);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        // logger.setLevel(Level.INFO);
        // logger.log(Level.WARNING, "Logging for task1");
        // logger.info("Logging for task");

        int[] arr = new int[] {5,1,7,2,3,9,4,1,3,6};
        logger.log(Level.INFO, "Input array");
        logger.info("Logging for task");
        int temp;
        logger.log(Level.INFO, "Input temp");
        // int imin = 0;
        for (int i = 0; i < arr.length-1; i++) {
            logger.log(Level.INFO, "Cycle begins");
            for (int j = 0; j < arr.length-i-1; j++) {
                logger.log(Level.INFO, "Cycle 2 begins");
                if (arr[j] > arr[j+1]) {
                    logger.log(Level.INFO, "Checking of elements");
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    logger.log(Level.WARNING, "Changing of elements places");
                }
            }
        }
        ShowArray(arr);
        logger.log(Level.INFO, "Void for show result");
        
    }
    public static void ShowArray(int[] array) {
        for (int item : array)
            System.out.print(item + " ");
        System.out.println();
    }
}

