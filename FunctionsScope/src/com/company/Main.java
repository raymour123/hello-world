package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        parameterCount("animals", "minerals");
        stringLength("hahahahaha");
        userInput();
        typeQuit();

    }

    public static void parameterCount(String... word) {
        System.out.println(word.length);
    }

    public static void stringLength(String aString){
        System.out.println(aString.length());
    }

    public static void longestString(String strLength1, String strLength2) {

        int str1 = strLength1.length();
        int str2 = strLength2.length();
    }

        if (str1 > str2) {
            System.out.println(strLength1);
        } else {
            System.out.println(strLength2);
        }

    public static void userInput() {
        System.out.println("Type");
        Scanner scanner = new Scanner(System.in);
        String uInput = scanner.nextLine();
        System.out.println(uInput);
    }

    public static void typeQuit();

    System.out.println("Say hi to me!");
    Scanner scanner = new Scanner(System.in);
    String inputFromUser = scanner.nextLine();
    System.out.println(inputFromUser);

    if(inputFromUser.equals("quit"))

    {
        System.out.println("bye");
    }

    else

    {
        typeQuit();
    }
}