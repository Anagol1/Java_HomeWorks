// 3. Напишите метод, который принимает на вход строку (String) и определяет является
//  ли строка палиндромом (возвращает boolean значение).

package HomeWork.Homework2;

// import javax.swing.plaf.TreeUI;

public class str_palindrom {
    public static void main(String[] args) {
        String msg = "ette";
        Palindrom(msg);
    }
    public static void Palindrom(String msg) {
        StringBuilder algor = new StringBuilder(msg);
        Boolean res = true;
        for (int i = 0; i < algor.length()/2; i++) {
            
            if (algor.charAt(i) != algor.charAt(algor.length()-i-1)) {  //(algor.equals(i) != algor.equals(algor.length()-i-1))
                res = false;
            }
            else res = true;   
        // return res; 
        }
        System.out.println(res);
        
    }
}
