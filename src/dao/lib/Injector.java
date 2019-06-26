package dao.lib;

import dao.controller.ConsoleHandler;
import dao.dao.BetDaoImpl;
import dao.dao.UserDaoImpl;
import dao.factory.BetDaoFactory;
import dao.factory.UserDaoFactory;

import java.lang.reflect.Field;

public class Injector {

    public static void injectDependency() throws IllegalAccessException {
        Class<ConsoleHandler> consoleHandlerClass = ConsoleHandler.class;
        Class<BetDaoImpl> betDaoImplClass = BetDaoImpl.class;
        Class<UserDaoImpl> userDaoImplClass = UserDaoImpl.class;

        Field[] consoleHandlerFields = consoleHandlerClass.getDeclaredFields();
        for (Field field : consoleHandlerFields) {
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, BetDaoFactory.getBetDao());
            }
            if (field.getDeclaredAnnotation(Inject.class) != null) {
                field.setAccessible(true);
                field.set(null, UserDaoFactory.getUserDao());
            }
        }
    }
}
