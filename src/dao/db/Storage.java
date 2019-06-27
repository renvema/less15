package dao.db;

import dao.model.Bet;
import dao.model.User;

import java.util.ArrayList;
import java.util.List;

//ЭТО НАША БД
public class Storage {
    public static final List<Bet> BETS = new ArrayList<>();
    public static final List<User> USERS = new ArrayList<>();
}
