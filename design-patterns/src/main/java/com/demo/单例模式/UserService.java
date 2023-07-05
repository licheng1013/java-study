package com.demo.单例模式;

/**
 * @author lc
 * @since 2022/5/16
 */
public class UserService {
    private static UserService user = new UserService();

    private UserService() {

    }

    public void printHello() {
        System.out.println("Hello");
    }

    public static UserService getInstance() {
        return user;
    }

    //同步锁
    public static synchronized UserService getSysInstance() {
        return new UserService();
    }


    public static void main(String[] args) {
        UserService instance = UserService.getInstance();
        instance.printHello();
    }
}
