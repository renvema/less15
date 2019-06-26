package dao.db;

import dao.model.Bet;
import dao.model.User;

import java.util.ArrayList;
import java.util.List;

//ЭТО НАША БД
public class Storage {
    public static final List<Bet> bets = new ArrayList<>();
    public static final List<User> user = new ArrayList<>();
}
