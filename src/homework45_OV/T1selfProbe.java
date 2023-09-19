package homework45_OV;

import java.util.*;

public class T1selfProbe {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-3, 1, 10, 5, 7, 18, 8, -4, 6, 20));

        System.out.println(findPairComposingNum(list, 18));
    }

    public static boolean findPairComposingNum(Collection<Integer> collection, int num) {
        boolean isPairPresent = false;
        if (collection == null || collection.size() < 2) return false;
        Set<Integer> pairSet = new HashSet<>();

        for (Integer n : collection) {
            isPairPresent = pairSet.contains(n) || pairSet.add(num - n);
        }
        return isPairPresent;
    }
}

//            isPairPresent = pairSet.contains(n) ? true : pairSet.add(num - n);
            /*if (pairSet.contains(n)) {
                return true;
            } else {
                pairSet.add(num - n);
            }*/