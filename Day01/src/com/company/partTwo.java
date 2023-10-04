package com.company;
import java.util.*;
import java.io.*;


public class partTwo {

    public static void main(String[] args) throws FileNotFoundException{
        File file = new File("data.txt");
        Scanner scanner = new Scanner(file);

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());

        Integer currTotal = 0;

        while (scanner.hasNextLine()) {
            String curr = scanner.nextLine();
            if (curr.equals("")) {
                maxHeap.add(currTotal);
                currTotal = 0;
            } else {
                currTotal += Integer.parseInt(curr);
            }
        }

        Integer topSum = 0;
        topSum += maxHeap.remove();
        topSum += maxHeap.remove();
        topSum += maxHeap.remove();
        System.out.println(topSum);

        scanner.close();
    }
}
