import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        task1(nums);
    }

    public static void task1(List<Integer> nums) {
        for (Integer i : nums) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    public static void task2(List<Integer> nums) {
        Collections.sort(nums);
        int pNum = Integer.MIN_VALUE;

        for (Integer i : nums) {
            if (i % 2 != 0 && i != pNum) {
                System.out.println(i);
                pNum = i;
            }
        }
    }
}



