package dao.controller;

import dao.dao.BetDao;
import dao.dao.UserDao;
import dao.lib.Inject;
import dao.model.Bet;
import dao.model.User;

import java.util.Scanner;

public class ConsoleHandler {
    private static Scanner scanner = new Scanner(System.in);

    @Inject
    private static BetDao betDao;

    @Inject
    private static UserDao userDao;

    public static void handle() {
        try {
            while (scanner.hasNext()) {
                String command = scanner.nextLine();
                if (command.equals("0")) {
                    return;
                }
                String[] data = command.split(" ");
                int value = Integer.parseInt(data[0]);
                double risk = Double.parseDouble(data[1]);
                Bet bet = new Bet(value, risk);
                betDao.add(bet);
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Данные введены некорректно");
        }
    }

    public static void handleUser() {
        try {
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
