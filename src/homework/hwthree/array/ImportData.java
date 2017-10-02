package homework.hwthree.array;

import java.util.Scanner;

public class ImportData {

    public static void main(String[] args) {

        System.out.println("Введите массив из 5 чисел: ");

        Scanner in = new Scanner(System.in);
        int[] nums = new int[5];
        for(int i=0;i < nums.length; i++){
            nums[i]=in.nextInt();
        }

        for(int i=0;i < nums.length; i++){
            System.out.print(nums[i]);
        }
        System.out.println();

        System.out.println("Введите число: ");

        Scanner inN = new Scanner(System.in);
        int N =inN.nextInt();


    }
}