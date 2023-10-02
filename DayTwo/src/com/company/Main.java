package com.company;
import java.net.SocketOption;
import java.sql.SQLOutput;
import java.util.*;
import java.io.*;


public class Main {

    public static void main(String[] args) throws FileNotFoundException{
	    File file = new File("data.txt");
        Scanner scanner = new Scanner(file);

        Integer totalScore = 0;
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] splits = input.split(" ");

            totalScore += computeHandPartTwo(splits[0], splits[1]);
        }
        System.out.println(totalScore);
        scanner.close();

    }

    public static Integer computeHandPartOne(String oppHand, String selfHand) {
        switch (oppHand) {
            case "A":
                if (selfHand.equals("X")) {
                    return 1 + 3;
                }
                if (selfHand.equals("Y")) {
                    return 2 + 6;
                }
                return 3 + 0;

            case "B":
                if (selfHand.equals("X")) {
                    return 1 + 0;
                }
                if (selfHand.equals("Y")) {
                    return 2 + 3;
                }
                return 3 + 6;

            case "C":
                if (selfHand.equals("X")) {
                    return 1 + 6;
                }
                if (selfHand.equals("Y")) {
                    return 2 + 0;
                }
                return 3 + 3;

        }
        return null;
    }

    public static Integer computeHandPartTwo(String oppHand, String selfHand) {
        switch (oppHand) {
            case "A":
                if (selfHand.equals("X")) {
                    return 3+ 0;
                }
                if (selfHand.equals("Y")) {
                    return 1 + 3;
                }
                return 2 + 6;

            case "B":
                if (selfHand.equals("X")) {
                    return 1 + 0;
                }
                if (selfHand.equals("Y")) {
                    return 2 + 3;
                }
                return 3 + 6;

            case "C":
                if (selfHand.equals("X")) {
                    return 2 + 0;
                }
                if (selfHand.equals("Y")) {
                    return 3 + 3;
                }
                return 1 + 6;

        }
        return null;
    }

}
