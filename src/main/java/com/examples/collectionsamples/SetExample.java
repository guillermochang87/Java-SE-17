package com.examples.collectionsamples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {
    public static void main(String[] args) {

        Set<String> hasSet = new HashSet<>();
        Set<String> treeSet = new TreeSet<>();
        Set<String> linkedHashSet = new LinkedHashSet<>();

        Map<String, Integer> map = new HashMap<>();

        List<String> items = Arrays.asList("Banana", "Apple", "Cherry");
        map.put("apple", 1);
        map.put("banana", 2);
        map.put("orange", 3);

        hasSet.addAll(items);
        treeSet.addAll(items);
        linkedHashSet.addAll(items);

        System.out.println("HashSet (no order): " + hasSet);
        System.out.println("TreeSet (sorted): " + treeSet);
        System.out.println("LinkedHashSet (insertion): " + linkedHashSet);

        System.out.println("HashMap (key, value): " + map);

    }

}
