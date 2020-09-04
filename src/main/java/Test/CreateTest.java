package Test;

import User.User;
import UserDao.UserDao;

public class CreateTest {
    public static void main(String[] args) {
        User user = new User("example2@gmail.com","example","qwerty");
        User addedUser = UserDao.create(user);
        System.out.println(addedUser.getId()+" new user id");
    }
}
