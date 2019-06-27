package dao.dao;

import dao.db.Storage;
import dao.lib.Dao;
import dao.model.User;

import java.util.List;

@Dao
public class UserDaoImpl implements UserDao {

    @Override
    public void add(User user) {
        Storage.USERS.add(user);
    }

    @Override
    public List<User> getAll() {
        return Storage.USERS;
    }
}
