package dao;

import dao.controller.ConsoleHandler;
import dao.dao.BetDao;
import dao.dao.BetDaoImpl;
import dao.dao.UserDao;
import dao.dao.UserDaoImpl;
import dao.lib.Injector;

public class Main {
    static {
        try {
            Injector.injectDependency();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws Exception {

        System.out.println("Если хотите сделать ставку, введите \n" +
                "сумму и риск через пробел");
        ConsoleHandler.handle();
        BetDao betDao = new BetDaoImpl();

        System.out.println("Введите данные пользователя \n" +
                "имя и возраст через пробел");
        ConsoleHandler.handleUser();
        UserDao userDao = new UserDaoImpl() ;

        System.out.println(betDao.getAll());
        System.out.println(userDao.getAll());
    }
}
