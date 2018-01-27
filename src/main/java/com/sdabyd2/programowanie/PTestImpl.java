package com.sdabyd2.programowanie;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class PTestImpl {

    public static String last(List<String> list) {
        return list.get(list.size()-1);
    }

    public static int length(List<Integer> list) {
        return list.size();
    }

    public static List<Integer> reverse(List<Integer> list) {
        ArrayList<Integer> reversedList = new ArrayList<Integer>(list);
        Collections.reverse(reversedList);
        return reversedList;
    }

    public static boolean isPalindrome(List<String> list) {
        ArrayList<String> palindrome = new ArrayList<String>(list);
        Collections.reverse(palindrome);
        return palindrome.equals(list);
    }

    public static Object[] removeAt(List<String> list, int elem) {
        ArrayList<String> returningList = new ArrayList<String>(list);
        String deletingElement = list.get(elem-1);
        returningList.remove(elem-1);
        Object[] result = new Object[2];
        result[0] = returningList;
        result[1] = deletingElement;
        return result;
    }

    public static List<String> randomSelect(List<String> list, int elements) {
        Random generator = new Random(System.currentTimeMillis());
        List<String> returningList = new ArrayList<>();
        for (int i = 0; i < elements; i++) {
            returningList.add(list.get(generator.nextInt(list.size())));
        }
        return returningList;
    }

    public static List<String> flatten(List<Object> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) instanceof String){
                result.add((String) list.get(i));
            } else {
                List<Object> innerList = (List<Object>) list.get(i);
                for (int j = 0; j < innerList.size(); j++) {
                    if (innerList.get(j) instanceof String) {
                        result.add((String) innerList.get(j));
                    } else {
                        List<String> innestList = (List<String>) innerList.get(j);
                        for (int k = 0; k < innestList.size(); k++) {
                            if (innestList.get(k) instanceof String) {
                                result.add((String) innestList.get(k));
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

/*    public static List<String> compress(List<String>) {
        Set<String> shortList = new LinkedHashSet<String>(list);
        List<String> target = new ArrayList<>(shortList);
        return target;
    }
*/}
