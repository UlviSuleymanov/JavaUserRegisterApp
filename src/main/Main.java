package main;

import beans.User;
import util.UserUtil;
import util.Util;



public class Main {
    public static void main(String[] args) {
        int menu;
        while (true) {
            menu = Util.giveInt("What do you want to do?" +
                    "\n1.Register a User." +
                    "\n2.Show all User." +
                    "\n3.Find User." +
                    "\n4.Update User." +
                    "\n5.Exit program.");
            if (menu == 1) {
                UserUtil.registerUsers();
            } else if (menu == 2) {
                UserUtil.printAllRegisteredUsers();
            } else if (menu == 3) {
                UserUtil.findUserAndPrint();
            } else if (menu == 4) {
                UserUtil.changeUser();
            }else if(menu==5){
                System.out.println("Exiting the Program...");
                break;
            }
        }
    }
}