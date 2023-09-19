package homework46;

import java.util.*;

public class TaskForUsingStack {

    /*
    Дана скобочная последовательность (строка, состоящая из скобок (в реальной жизни между ними могут быть эл-ты,
    напр. мат. операции)): "{(()[[()] ()}". Надо проверить корректность последовательности: совпадение по виду,
    открытие-закрытие и не нарушать вложенности.

    1. Количество открывающих и закрывающих скобок должно быть равно (), {}
       Но: { ) ( } нам нужна последовательность, соответственно
    2. Надо создать стэк, чтобы можно было отследить порядок элементов.
    */
    public static void main(String[] args) {
        String symbolString = "{(()[[()] ()}";
        String symbolString1 = "{()[(asd)] (gfh)}";

        System.out.println(isSymbolSequenceCorrect(stringToList(symbolString)));
        System.out.println(isSymbolSequenceCorrect(stringToList(symbolString1)));
    }

    public static List<Character> stringToList(String string) {
        List<Character> symbolList = new ArrayList<>();
        for (Character ch : string.toCharArray()) {
            symbolList.add(ch);
        }
        return symbolList;
    }

    public static boolean isSymbolSequenceCorrect(List<Character> symbolList) {
        if (symbolList == null) return false;
        Deque<Character> pairSymbolsStack = new LinkedList<>();
        for (Character ch : symbolList) {
            switch (ch) {
                case '(' -> pairSymbolsStack.push(')');
                case '[' -> pairSymbolsStack.push(']');
                case '{' -> pairSymbolsStack.push('}');
                case ')', '}', ']' -> {
                    if (pairSymbolsStack.isEmpty() || ch != pairSymbolsStack.pop()) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
            /*switch (ch) {
                case '(': {
                    pairSymbolsStack.push(')');
                    break;
                }
                case '[': {
                    pairSymbolsStack.push(']');
                    break;
                }
                case '{': {
                    pairSymbolsStack.push('}');
                    break;
                }
                case ')', '}', ']': {
                    if (pairSymbolsStack.isEmpty() || ch != pairSymbolsStack.pop()) {
                        return false;
                    }
                }
            }*/

