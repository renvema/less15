package dao.lib;

import dao.controller.ConsoleHandler;
import dao.controller.UserHandler;
import dao.dao.BetDao;
import dao.dao.UserDao;
import dao.factory.BetDaoFactory;
import dao.factory.UserDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<UserHandler> userHandlerClass = UserHandler.class;
        Class<BetDao> betDaoImplClass = BetDao.class;
        Class<UserDao> userDaoImplClass = UserDao.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, BetDaoFactory.getBetDao());
            }
        }

        Field[] humanHandler = userHandlerClass.getDeclaredFields();
        for (Field field : humanHandler) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                if (field.getType().equals(userDaoImplClass) && userDaoImplClass.getAnnotation(Dao.class) != null) {
                    field.set(null, UserDaoFactory.getUserDao());
                }
            }
        }
    }
}
