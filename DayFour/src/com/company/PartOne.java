package com.company;
import java.util.*;
import java.io.*;

public class PartOne {

    public static void main(String[] args) throws FileNotFoundException{
	    File file = new File("data.txt");
        Scanner scanner = new Scanner(file);

        int duplicates = 0;
        while(scanner.hasNextLine()) {
            String input = scanner.nextLine();
            String[] elfGroup = input.split(",", 2);
            if (doesContainDuplicate(elfGroup)) {
                duplicates++;
            }
        }
        System.out.println(duplicates);

    }

    public static Boolean doesContainDuplicate(String[] elfs) {
        String[] elfOne = elfs[0].split("-", 2);
        int a = Integer.parseInt(elfOne[0]);
        int b = Integer.parseInt(elfOne[1]);

        String[] elfTwo = elfs[1].split("-", 2);
        int c = Integer.parseInt(elfTwo[0]);
        int d = Integer.parseInt(elfTwo[1]);
        System.out.println(a + " " + b + "  ,  " + c + " " + d);

        if (a <= c && b >= d) {
            return true;
        }
        if (c <= a && d >= b) {
            return true;
        }
        return false;
    }
}
