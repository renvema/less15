package dao;

import dao.controller.BetHandler;
import dao.controller.Handler;
import dao.controller.UserHandler;
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
        Handler betHandler = new BetHandler();
        betHandler.handle();
        BetDao betDao = new BetDaoImpl();

        System.out.println("Введите данные пользователя \n" +
                "имя и возраст через пробел");
        Handler userHandler = new UserHandler();
        userHandler.handle();
        UserDao userDao = new UserDaoImpl();

        System.out.println(betDao.getAll());
        System.out.println(userDao.getAll());
    }
}
