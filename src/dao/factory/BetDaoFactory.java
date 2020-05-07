package dao.factory;

import dao.dao.BetDaoInterface;
import dao.dao.BetDaoImpl;

public class BetDaoFactory {

    private static BetDaoInterface instance;

    public static BetDaoInterface getBetDao() {
        if (instance == null) {
            instance = new BetDaoImpl();
        }
        return instance;
    }
}
