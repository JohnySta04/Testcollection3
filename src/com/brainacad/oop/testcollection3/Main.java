package com.brainacad.oop.testcollection3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class Main {

    public static void main(String[] strings) {

        System.out.println("******************************************");
        System.out.println("Labwork 2.15.3");
        System.out.println("1-------------------------------------------");

        LinkedList<String> linkedList = new LinkedList<String>();
        ArrayList<String> arrayList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {

            arrayList.add("num_A" + i);
            linkedList.add("num_L" + i);
        }

        printElement(linkedList, arrayList);
        System.out.println("2 ------------------------------------------------");

        for (int i = 0; i < 10; i++) {

            linkedList.add(i * 2 + 1, arrayList.get(i));
        }

        printElement(linkedList, arrayList);
        System.out.println("3 ------------------------------------------------");

        Collections.reverse(arrayList);

        Iterator iteratorArrayList = arrayList.iterator();

        while (iteratorArrayList.hasNext()) {

            linkedList.add((String) iteratorArrayList.next());
        }

        printElement(linkedList, arrayList);

        System.out.println("******************************************");

    }

    static void printElement(LinkedList linkedList, ArrayList arrayList) {

        Iterator iteratorArrayList = arrayList.iterator();
        Iterator iteratorLinkedList = linkedList.iterator();

        while (iteratorArrayList.hasNext()) {

            System.out.println("ArrayList - " + iteratorArrayList.next());
        }

        while (iteratorLinkedList.hasNext()) {

            System.out.println("LinkedList - " + iteratorLinkedList.next());
        }


    }
}

//arrayList