// Дана строка (получение через обычный текстовый файл!!!)

// "фамилия":"Иванов","оценка":"5","предмет":"Математика"
// "фамилия":"Петрова","оценка":"4","предмет":"Информатика"

// Написать метод(ы), который распарсит строку и, используя StringBuilder, создаст 
// строки вида:
// Студент [фамилия] получил [оценка] по предмету [предмет].

// Пример вывода:
// Студент Иванов получил 5 по предмету Математика.
// Студент Петрова получил 4 по предмету Информатика.
// Студент Краснов получил 5 по предмету Физика.

package HomeWork.Homework2;
import java.io.File;
import java.io.FileReader;
// import java.io.FileWriter;

public class exp_from_file {
    public static void main(String[] args) {
        
        String file_journal = "1234.txt";

        File file = new File(file_journal);
                    
        try {
            FileReader f = new FileReader(file);
            
            char[] a = new char[(int)file.length()];
            f.read(a);
            f.close();
            String words = new String();
            StringBuilder sb = new StringBuilder();
            
            words = words.concat(String.valueOf(a));
            System.out.println(words);
            words = words.replace("фамилия", "Студент");
            words = words.replace("оценка", "получил");
            words = words.replace("предмет", "по предмету");
            words = words.replace('"', ' ');
            words = words.replaceAll("[\\p{Punct}\r]", "");

            sb.append(String.valueOf(words));         
            // System.out.println(words);
            sb.toString();
            System.out.println(sb);           
            System.out.println();
        }
        catch (Exception e) {
            System.out.println("что-то не так");
        }        
    }    
}
