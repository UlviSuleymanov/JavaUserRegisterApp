package main;

import beans.User;
import util.UserUtil;
import util.Util;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        int menu = 0;
        while (true) {
            menu = Util.giveInt("What do you want to do?" +
                    "\n1.Register a User." +
                    "\n2.Show all User." +
                    "\n3.Find User." +
                    "\4. Update User.");
            if (menu == 1) {
                UserUtil.registerUsers();
            } else if (menu == 2) {
                UserUtil.printAllRegisteredUsers();
            } else if (menu == 3) {
                UserUtil.findUserAndPrint();
            } else if (menu == 4) {
                UserUtil.printAllRegisteredUsers();
                int i = Util.giveInt("Which user you want to update?");
                System.out.println("Please enter new Data");
                User user = UserUtil.fillUser();
                Config.users[i - 1] = user;
            }
        }
    }
}