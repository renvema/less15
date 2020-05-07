package dao.lib;

import dao.controller.BetHandler;
import dao.controller.UserHandler;
import dao.dao.BetDaoInterface;
import dao.dao.BetDaoImpl;
import dao.dao.UserDao;
import dao.dao.UserDaoImpl;
import dao.factory.BetDaoFactory;
import dao.factory.UserDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class<BetHandler> consoleHandlerClass = BetHandler.class;
        Class<UserHandler> userHandlerClass = UserHandler.class;
        Class<BetDaoInterface> betDaoInterface = BetDaoInterface.class;
        Class<UserDao> userDaoInterface = UserDao.class;
        Class<BetDaoImpl> betDaoImplClass = BetDaoImpl.class;
        Class<UserDaoImpl> userDaoImplClass = UserDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.isAnnotationPresent(Inject.class)) {
                if (field.getType().equals(betDaoInterface)
                        && betDaoImplClass.isAnnotationPresent(Dao.class)) {
                    field.setAccessible(true);
                    field.set(null, BetDaoFactory.getBetDao());
                }
            }
        }

        Field[] humanHandler = userHandlerClass.getDeclaredFields();
        for (Field field : humanHandler) {
            if (field.isAnnotationPresent(Inject.class)) {
                if (field.getType().equals(userDaoInterface)
                        && userDaoImplClass.isAnnotationPresent(Dao.class)) {
                    field.setAccessible(true);
                    field.set(null, UserDaoFactory.getUserDao());
                }
            }
        }
    }
}
