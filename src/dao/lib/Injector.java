package dao.lib;

import dao.controller.ConsoleHandler;
import dao.dao.BetDao;
import dao.dao.UserDao;
import dao.factory.BetDaoFactory;
import dao.factory.UserDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDao> betDaoImplClass = BetDao.class;
        Class<UserDao> userDaoImplClass = UserDao.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                if (field.getType().equals(betDaoImplClass)) {
                    field.set(null, BetDaoFactory.getBetDao());
                } else if (field.getType().equals(userDaoImplClass)) {
                    field.set(null, UserDaoFactory.getUserDao());
                }

            }
        }
    }
}
