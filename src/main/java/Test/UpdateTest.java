package Test;

import User.User;
import UserDao.UserDao;

public class UpdateTest {
    public static void main(String[] args) {
        // type here id from Create test
        User user = UserDao.read(9);
        System.out.println(user.getId()+" "+user.getEmail()+" "+user.getUserName()+" "+user.getPassword());
        user.setUserName("OtherName");
        UserDao.update(user);
        user = UserDao.read(9);
        System.out.println(user.getId()+" "+user.getEmail()+" "+user.getUserName()+" "+user.getPassword());
    }
}
