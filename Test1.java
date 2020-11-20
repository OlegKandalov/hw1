package ForGit;

import java.util.Arrays;

public class Test1 {
    public static void main(String[] args) {
        int[] arrayOfNum = {2,3,1,7,11};
        Arrays.sort(arrayOfNum);
        for (int i = 0; i < arrayOfNum.length / 2; i++) {
            int temp = arrayOfNum[i];
            arrayOfNum[i] = arrayOfNum[arrayOfNum.length - i - 1];
            arrayOfNum[arrayOfNum.length - i - 1] = temp;
        }
    }
    public static int sumOfPos(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static int average(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
           sum += arr[i];
        }
        return sum / arr.length;
    }

    public static int[] result(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]){
                    arr[j] = 0;
                }
            }
        }
        return arr;
    }
}
