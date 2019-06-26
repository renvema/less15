package dao.factory;

import dao.dao.UserDao;
import dao.dao.UserDaoImpl;

public class UserDaoFactory {
    private static UserDao instance;

    public static UserDao getUserDao() {
        if (instance == null) {
            instance = new UserDaoImpl();
        }
        return instance;
    }
}
