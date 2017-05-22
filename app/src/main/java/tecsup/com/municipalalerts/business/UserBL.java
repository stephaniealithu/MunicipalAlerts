package tecsup.com.municipalalerts.business;

import java.util.ArrayList;
import java.util.List;

import tecsup.com.municipalalerts.models.User;

/**
 * Created by Steph on 22/05/2017.
 */

public class UserBL {

    public static List<User> users = new ArrayList<>();

    static{
        users.add(new User("chavo@gmail.com","chavo","chavo"));
    }

    public static User login(String username, String password){
        for (User user : users){
            if(user.getEmail().equalsIgnoreCase(username) && user.getPassword().equals(password)){
                return user;
            }
        }
        return null;
    }

    public static User getUser(String username){
        for (User user : users){
            if(user.getEmail().equalsIgnoreCase(username)){
                return user;
            }
        }
        return null;
    }

    public static void register(User user){
        users.add(user);
    }

}
