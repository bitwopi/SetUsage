import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> strings = new ArrayList<>(Arrays.asList("1", "1", "2", "3", "4", "4", "5", "5", "6", "7"));
        printEvenNumbers(nums);
        System.out.println();
        printOddNumbers(nums);
        System.out.println();
        printDublicates(strings);
        System.out.println();
        printNumberOfDublicates(strings);
    }

    public static void printEvenNumbers(List<Integer> nums) {
        Set<Integer> numsSet = new HashSet<>(nums);
        numsSet.removeIf(i -> i % 2 != 0);
        numsSet.forEach(System.out::println);
    }

    public static void printOddNumbers(List<Integer> nums) {
        Set<Integer> numsSet = new HashSet<>(nums);
        numsSet.removeIf(i -> i % 2 == 0);
        numsSet.forEach(System.out::println);
    }

    public static void printDublicates(List<String> strings) {
        Set<String> stringSet = new HashSet<>(strings);
        stringSet.forEach(System.out::println);
    }

    public static void printNumberOfDublicates(List<String> strings) {
        Set<String> stringSet = new HashSet<>(strings);
        for (String dublicate : stringSet) {
            int counter = 0;
            for (String string : strings) {
                if (string.equals(dublicate)) counter++;
            }
            System.out.println(counter);
        }
    }
}