package org.example.colletions;


import java.util.*;

public class Program2 {

    public static void main(String[] args) {

        Map<Integer, String> map = new TreeMap<>();


        Map<Integer,String> listmap= new LinkedHashMap<>();

        map.put(1, "kuswanth");
        map.put(2, "Anu");
        map.put(7, "prasant");
        map.put(3, "shiv");
        map.put(4, "munna");
        map.put(5, "chanduu");
        map.put(6, "ayush");


        System.out.println(map);





        List<Integer> keyslist = new ArrayList<>(map.keySet());
//        Collections.sort(keyslist,Collections.reverseOrder());

        // Manual descending sort
        for (int i = 0; i < keyslist.size(); i++) {
            for (int j = i + 1; j < keyslist.size(); j++) {

                if (keyslist.get(i) < keyslist.get(j)) {

                    // Swapping
                    int temp = keyslist.get(i);
                    keyslist.set(i, keyslist.get(j));
                    keyslist.set(j, temp);
                }
            }
        }

        // Print result
        for (Integer i : keyslist) {
            System.out.println(map.get(i) + " " + i);
            listmap.put(i,map.get(i));
        }

        System.out.println(listmap);
    }
}