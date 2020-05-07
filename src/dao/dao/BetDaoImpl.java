package dao.dao;

import dao.db.Storage;
import dao.lib.Dao;
import dao.model.Bet;

import java.util.List;

//НАШ КЛАСС ДЛЯ РАБОТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦОЙ СТАВОК
@Dao
public class BetDaoImpl implements BetDaoInterface {

    @Override
    public void add(Bet bet) {
        Storage.BETS.add(bet);
    }

    @Override
    public List<Bet> getAll() {
        return Storage.BETS;
    }

}
