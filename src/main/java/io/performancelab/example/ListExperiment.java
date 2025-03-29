package io.performancelab.example;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExperiment {

    public static List<Integer> arrayLinkedList(int size) {
        List<Integer> array = new LinkedList<Integer>();
        for (int index = 0; index < size; index++) {
            array.add(index);
        }
        return array;
    }

    public static List<Integer> arrayArrayList(int size) {
        List<Integer> array = new ArrayList<Integer>();
        for (int index = 0; index < size; index++) {
            array.add(index);
        }
        return array;
    }

    public static List<Integer> arrayArrayListPreAllocated(int size) {
        List<Integer> array = new ArrayList<Integer>();
        for (int index = 0; index < size; index++) {
            array.add(index);
        }
        return array;
    }
}
