package homework;

import homework.model.User;
import homework.util.Persister;
import homework.util.Saver;

/**
 * Подумать и исправить те принципы SOLID которые нарушены в пакете homework.
 */ 
public class Main{
    public static void main(String[] args){
        User user = new User("Bob");
        Persister persister = new Persister(user);
        persister.report();
        Saver saver = new Saver(user);
        saver.save();
    }
}