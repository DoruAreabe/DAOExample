package Test;

import User.User;
import UserDao.UserDao;

import java.util.List;

public class ReadAllTest {
    public static void main(String[] args) {
        List<User> readedUsers = UserDao.readAll();
        for(User mail : readedUsers){
            System.out.println(mail.getEmail());
        }
    }
}
