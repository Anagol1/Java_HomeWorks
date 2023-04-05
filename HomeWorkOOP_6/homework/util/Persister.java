package homework.util;

import homework.model.User;

public class Persister implements Persistable{
    private final User user;

    public Persister(User user){
        this.user = user;
    }

    @Override
    public void report(){
            System.out.println("Report for user: " + user.getName());
        }
    }

