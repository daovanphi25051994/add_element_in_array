import java.util.Scanner;

public class AddElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter the size of array : ");
        int size = scanner.nextInt();

        if (size > 0) {
            int[] arrNumbers = new int[size];
            for (int i = 0; i < arrNumbers.length - 1; i++) {
                System.out.printf("arr[%d] = ", i);
                arrNumbers[i] = scanner.nextInt();
            }
            System.out.printf("Enter a number you want to add to array : ");
            int number = scanner.nextInt();
            System.out.printf("Enter index of array you want to add to array : ");
            int index = scanner.nextInt();
            addElementByIndex(arrNumbers, index, number);

            System.out.println("new array : ");
            for (int i = 0; i < arrNumbers.length; i++) {
                System.out.printf("arr[%d] = %d\n", i, arrNumbers[i]);
            }
        } else {
            System.out.println("invalid input !!");
        }
    }

    public static void addElementByIndex(int[] arrNumbers, int index, int value) {
        if (index >= 0 && index < arrNumbers.length) {
            int step = arrNumbers[index];
            arrNumbers[index] = value;
            for (int i = index; i < arrNumbers.length - 1; i++) {
                int step1 = arrNumbers[i + 1];
                arrNumbers[i + 1] = step;
                step = step1;
            }
        }else {
            System.out.println("invalid input !!");
        }
    }
}
