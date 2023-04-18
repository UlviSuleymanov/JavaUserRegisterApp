package main;

import beans.Admin;
import beans.User;

public class Config {
    public static User[] users = null;
    public static Admin admin = new Admin("Ulvi",
            "Suleymanov", "ulvisuleymanov@gmail.com", "12345");
    public static boolean isLogined = false;
}
