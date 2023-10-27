import java.util.Arrays;
import java.util.Random;

public class Lesson09Program {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[random.nextInt(2) + 5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(9) + 1;
        }

        System.out.println(Arrays.toString(array));


        int leftCount = countMatches(array);

        int[] reverseArray = reverseArray(array);
        System.out.println(Arrays.toString(reverseArray));

        int rightCount = countMatches(reverseArray);
        if(leftCount > 1)
        System.out.println(leftCount );
        if (rightCount > 1) {
            System.out.println(rightCount);
        } else {
            System.out.println("No matches");
        }

//
//        int time = 0;
//        for (int i = 1; i <= 53 ; i++) {
//            time += 3* 60 + ( random.nextInt(23 + 23) - 23);
//            System.out.println("Customer time in queue in seconds = " + time);
//        }

//        int[] numbers = new int[100];
//        initializeNumbers(numbers);
//        System.out.println(Arrays.toString(numbers));
//
//        int countZero = 0;
//        int countPositive = 0;
//        int countNegative = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] < 0)
//                countNegative++;
//            else if (numbers[i] > 0) {
//                countPositive++;
//            } else {
//                countZero++;
//            }
//        }
//
//        System.out.println("Positive numbers = " + countPositive);
//        System.out.println("Negative numbers = " + countNegative);
//        System.out.println("Zero numbers = " + countZero);
//        InterestingNumber interestingNumber = new InterestingNumber();
//        System.out.println(interestingNumber.defaultNum);
//        interestingNumber.interestingDivide();
//
//        System.out.println(interestingNumber.defaultNum / interestingNumber.defaultNum
//         == interestingNumber.defaultNum / interestingNumber.defaultNum);

//        int sum = 0;
//        for (int i = 1; i <= 7; i++){
//            sum +=i;
//        }
//        System.out.println(sum);

        ///factorial 20 = 1 * 2 * 3 * 4...20

//        long factorial = 1;
//        for (int i = 1; i <= 20; i++) {
//            factorial *= i;
//            System.out.print(i + ":" + factorial + "; ");
//
//            if (i % 4 == 0) {
//                System.out.println();
//            }
//        }
//
//        System.out.println(factorial);
    }

    public static int[] reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i -1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }
    public static int countMatches(int[] array){
        int count = 1;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == array[i + 1]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }
    public static void initializeNumbers(int[] numbers) {
        Random random = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100) - 30;
        }
    }

//    public static void showItems(int a, byte b){
//        System.out.println(a + ": " + b);
//    }
//    public static void showItems(int a, int b){
//        System.out.println(a + ": " + b);
//    }
//
//
//    public static void showItems(long a, int b){
//        System.out.println(a + ": " + b);
//    }
//    public static void showItems(int a, long b){
//        System.out.println(a + ": " + b);
//    }
//    public static void showItems(byte a, int b){
//        System.out.println(a + ": " + b);
//    }
//    public static void showItems(short a, int b){
//        System.out.println(a + ": " + b);
//    }
}
