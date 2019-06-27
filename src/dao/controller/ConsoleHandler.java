package dao.controller;

import dao.dao.BetDao;
import dao.lib.Inject;
import dao.model.Bet;

import java.util.Scanner;

public class ConsoleHandler {

    @Inject
    private static BetDao betDao;

    public static void handle() {
        try (Scanner scanner = new Scanner(System.in)) {
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
}
