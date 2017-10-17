package homework.hwthree.array;

import java.util.Arrays;

/**
 * Created by polosatik on 02.10.17.
 */
public class ArrayN {
    int[] nums = new int[5];
    int N;

    public ArrayN() {
    }

    public ArrayN(int[] nums, int N) {
        this.nums = nums;
        this.N = N;
    }


    @Override
    public String toString() {
        return "ArrayN{" +
                "nums=" + Arrays.toString(nums) +
                ", N=" + N +
                '}';
    }
}
