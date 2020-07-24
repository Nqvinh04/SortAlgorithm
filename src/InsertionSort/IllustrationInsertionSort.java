package InsertionSort;

import java.util.Scanner;

public class IllustrationInsertionSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter list size: ");
        int size = sc.nextInt();
        int[] array  =  new int[size];
        for (int i = 0; i < array.length;i++){
            System.out.println("Entry " + i + "value:" );
            array[i] = sc.nextInt();
        }
        System.out.print("Your input list: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        insertionSort(array);
    }

    public static void insertionSort(int[] list){
        for (int i = 1; i < list.length; i++){
            int currentElement = list[i];
            int k;
            for (k = i -1; k >= 0 && list[k] > currentElement; k--){
                System.out.println("Swap " + list[k] + " with " + list[k + 1]);
                list[k + 1] = list[k];
            }
            list[ k + 1 ] = currentElement;
            System.out.print("List after the " + i + " sort: ");
            for (int j = 0; j < list.length; j++) {
                System.out.print(list[j] + "\t");
            }
            System.out.println();
        }
    }
}
