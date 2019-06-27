package dao.controller;

import dao.dao.BetDao;
import dao.lib.Inject;
import dao.model.Bet;

public class BetHandler implements Handler{

    @Inject
    private static BetDao betDao;

    @Override
    public void handle() {
        try  {
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
