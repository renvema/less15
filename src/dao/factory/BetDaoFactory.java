package dao.factory;

import dao.dao.BetDao;
import dao.dao.BetDaoImpl;

public class BetDaoFactory {

    private static BetDao instance;

    public static BetDao getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
