package util;

import java.util.Scanner;

public class Util {
    private static Scanner scanner = null;

    public static Scanner getScanner() {
        if (scanner == null) {
            scanner = new Scanner(System.in);
            return scanner;
        }
        return scanner;

    }

    public static String giveText(String title) {
        System.out.println(title + ":");
        String answer = getScanner().nextLine();
        return answer;
    }

    public static int giveInt(String title) {
        System.out.println(title + ":");
        int answer = getScanner().nextInt();
        return answer;
    }
}
