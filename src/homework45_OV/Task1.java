package homework45_OV;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class Task1 {
    /*
    ** Задача 1 **
    Дан List<Integer>. Написать метод, который определит есть лм в этом списке такая пара чисел,
    которая в сумме даёт заданное число N.
    */

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(-1, 6, 5, 7, 4, 2, -1, 0));
        System.out.println(isPairEqualsNum(list, 7));
        System.out.println(isPairEqualsNum(list, 1));
        System.out.println(isPairEqualsNum(list, 16));
        System.out.println(isPairEqualsNum(list, -1));
        System.out.println("============================================");
        System.out.println(isPairEqualsNum4(list, 7));
        System.out.println(isPairEqualsNum4(list, 1));
        System.out.println(isPairEqualsNum4(list, 16));
        System.out.println(isPairEqualsNum4(list, -1));
    }

    public static boolean isPairEqualsNum(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == num) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isPairEqualsNum2(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;
        for (int i = 0; i < list.size() - 1; i++) {
            Integer pair = num - list.get(i);
            if (list.contains(pair)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isPairEqualsNum3(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;
        HashSet<Integer> wishNumberSet = new HashSet<>();
        for (Integer i : list) {
            if (wishNumberSet.contains(i)) {
                return true;
            } else {
                wishNumberSet.add(num - i);
            }
        }
        return false;
    }

    public static boolean isPairEqualsNum4(List<Integer> list, int num) {
        if (list == null || list.size() < 2) return false;
        list.sort((a, b) -> a - b);
        int lIndex = 0;
        int rIndex = list.size() - 1;

        while (lIndex < rIndex) {
            int sum = list.get(lIndex) + list.get(rIndex);
            if (sum == num) {
                return true;
            }
            if (sum < num) {
                lIndex++;
            } else {
                rIndex--;
            }
        }
        return false;
    }

}
