package Test;

import User.User;
import UserDao.UserDao;

public class ReadTest {
    public static void main(String[] args) {
        // type here id from Create test
        User user = UserDao.read(9);
        System.out.println(user.getId()+" "+user.getEmail()+" "+user.getUserName()+" "+user.getPassword());
    }
}
