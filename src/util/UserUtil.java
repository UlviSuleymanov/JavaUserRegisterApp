package util;

import beans.User;
import main.Config;

public class UserUtil {
    public static User fillUser() {
        String name = Util.giveText("Enter Name");
        String surName = Util.giveText("Enter Surname");
        int age = Util.giveInt("Enter age");
        User user = new User(name, surName, age);
        return user;
    }

    public static void printAllRegisteredUsers() {
        if (Config.users == null) {
            return;
        }
        for (int i = 0; i < Config.users.length; i++) {
            User user = Config.users[i];
            System.out.println(i + 1 + "." + user.getFullInfo());
        }
    }

    public static void registerUsers() {
        int count = Util.giveInt("How Many users do you want to register?");
        Config.users = new User[count];
        for (int i = 0; i < count; i++) {
            System.out.println((i+1)+". Register");
            Config.users[i] = UserUtil.fillUser();
        }
        System.out.println("Registiration is completed successfully");
        UserUtil.printAllRegisteredUsers();
    }

    public static void findUserAndPrint(){
        String text = Util.giveText("Please enter search query");
        User[] result = findUser(text);
        for (int i = 0; i < result.length; i++){
            System.out.println(result[i].getFullInfo());
        }
    }
    public static User[] findUser(String text){
        int count = 0;
         for(int i=0; i<Config.users.length; i++){
             User user = Config.users[i];
             if(user.getName().contains(text)||user.getSurname().contains(text)){
                 count++;
             }
         }
         User[] result = new User[count];
         int found = 0;
         for(int i = 0; i < Config.users.length; i++){
             User user = Config.users[i];
             if(user.getName().contains(text)|| user.getSurname().contains(text)){
                 result[found] = user;
                 found++;
             }
         }
         return result;
    }
  public static void changeUser(){
      UserUtil.printAllRegisteredUsers();
      int i = Util.giveInt("Which user you want to update?");
      System.out.println("Please enter new Data");
      User user = UserUtil.fillUser();
      Config.users[i - 1] = user;
  }
}
