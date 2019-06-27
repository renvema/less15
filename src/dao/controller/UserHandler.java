package dao.controller;

import dao.dao.UserDao;
import dao.lib.Inject;
import dao.model.User;

import java.util.Scanner;

public class UserHandler {

    @Inject
    private static UserDao userDao;

    public static void handleUser() {
        try (Scanner scanner = new Scanner(System.in)){
            while (scanner.hasNext()) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                String name = data[0];
                int age = Integer.parseInt(data[1]);
                User user = new User(name, age);
                userDao.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Данные введены некорректно");
        }
    }
}
