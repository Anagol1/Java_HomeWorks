package homework.util;

import homework.model.User;

public class Saver implements Saveable{

    private final User user;
    public Saver(User user){
        this.user = user;
    }
    public void save(){
        System.out.println("Save user: " + user.getName());
    }
}
