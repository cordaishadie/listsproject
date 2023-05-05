package edu.guilford;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

public class ListsProject {
    public static void main(String[] args) {
        // declaring a constant for the number of elements in the list
        final int numSandals = 5000;

        ArrayList<Sandal> sandalArrayList = new ArrayList<Sandal>();
        LinkedList<Sandal> sandalLinkedList = new LinkedList<Sandal>();

        long startTime = System.nanoTime();
        // create a list of 1000 randomly generated Sandals
        for (int i = 0; i < numSandals; i++) {
            sandalArrayList.add(new Sandal());
        }
        long endTime = System.nanoTime();
        System.out.println("Time to add to sandalArrayList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        startTime = System.nanoTime();
        // create a linked list of 1000 randomly generated Sandals
        for (int i = 0; i < numSandals; i++) {
            sandalLinkedList.add(new Sandal());
        }
        endTime = System.nanoTime();
        System.out.println("Time to add to sandalLinkedList: " 
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        // sort the list using Collections.sort() and time how long it takes
        startTime = System.nanoTime();
        Collections.sort(sandalArrayList);
        endTime = System.nanoTime();
        System.out.println("Time to sort sandalArrayList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        // sort the linked list using Collections.sort() and time how long it takes
        startTime = System.nanoTime();
        Collections.sort(sandalLinkedList);
        endTime = System.nanoTime();
        System.out.println("Time to sort sandalLinkedList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        startTime = System.nanoTime();
        Collections.shuffle(sandalArrayList);
        endTime = System.nanoTime();
        System.out.println("Time to shuffle sandalArrayList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        startTime = System.nanoTime();
        Collections.shuffle(sandalLinkedList);
        endTime = System.nanoTime();
        System.out.println("Time to shuffle sandalLinkedList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        // get a random element from the list 1,000,000 times and time how long it takes
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = (int) (Math.random() * sandalArrayList.size());
            sandalArrayList.get(randomIndex);
        }
        endTime = System.nanoTime();
        System.out.println("Time to get random element from sandalArrayList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        Collections.shuffle(sandalLinkedList);
        // get a random element from the linked list 1,000,000 times and time how long
        // it takes
        startTime = System.nanoTime();
        for (int i = 0; i < 1000000; i++) {
            int randomIndex = (int) (Math.random() * sandalLinkedList.size());
            sandalLinkedList.get(randomIndex);
        }
        endTime = System.nanoTime();
        System.out.println("Time to get random element from sandalLinkedList: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");

        // get each element from the list sequentially and time how long it takes
        startTime = System.nanoTime();
        for (int i = 0; i < sandalArrayList.size(); i++) {
            sandalArrayList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to get each element from sandalArrayList sequentially: "
                + (endTime - startTime) / 1.e6 + " milliseconds");

        // get each element from the linked list sequentially and time how long it takes
        startTime = System.nanoTime();
        for (int i = 0; i < sandalLinkedList.size(); i++) {
            sandalLinkedList.get(i);
        }
        endTime = System.nanoTime();
        System.out.println("Time to get each element from sandalLinkedList sequentially: "
                + String.format("%.2f", (endTime - startTime) / 1.e6) + " milliseconds");
    }

}