package dao.dao;


import dao.model.Bet;

import java.util.List;

//НАШ КЛАСС ДЛЯ РАБОТЫ С БАЗОЙ ДАННЫХ И ТАБЛИЦОЙ СТАВОК
public interface BetDaoInterface {

    void add(Bet bet);
    List<Bet> getAll();


}
