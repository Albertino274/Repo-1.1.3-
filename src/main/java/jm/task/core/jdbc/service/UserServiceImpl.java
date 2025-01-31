package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.model.User;
import java.util.List;
public class UserServiceImpl implements UserService {

    private final UserDaoHibernateImpl dao = new UserDaoHibernateImpl();

    // Создание таблицы
    public void createUsersTable() {
        dao.createUsersTable();
    }
    // Удаление таблицы
    public void dropUsersTable() {
        dao.dropUsersTable();
    }
    // Добавляет user
    public void saveUser(String name, String lastName, byte age) {
        dao.saveUser(name, lastName, age);
        System.out.println("User с " + name + " добавлен в базу данных.");
    }
    // Удаляет по id
    public void removeUserById(long id) {
        dao.removeUserById(id);
    }
    // Ввывод таблицы
    public List<User> getAllUsers() {
        return dao.getAllUsers();
    }
    // Очистка таблицы
    public void cleanUsersTable() {
        dao.cleanUsersTable();
    }
}






