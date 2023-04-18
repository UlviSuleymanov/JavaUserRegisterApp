package util;

import main.Config;

import java.util.Scanner;

public class AdminUtil {
    public static void checkIfLogined() {
        System.out.println("Welcome please log in to use this service.");
        if (Config.isLogined == false) {
            String email = Util.giveText("Please enter your email address");
            String password = Util.giveText("Please enter your password");
            if (Config.admin.getEmail().equalsIgnoreCase(email) && Config.admin.getPassword().equalsIgnoreCase(password)) {
                System.out.println("You are logged in. Welcome dear " + Config.admin.getName());
                Config.isLogined = true;
            } else {
                System.out.println("Wrong email or password");
                checkIfLogined();
            }
        }
    }
}
