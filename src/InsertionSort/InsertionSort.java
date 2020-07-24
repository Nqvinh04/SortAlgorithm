package InsertionSort;

public class InsertionSort {
    public static double[] list1 = {1,9, 4.5, 6.6, 5.7, -4.5};
    public static void insertionSort1(double[] list) {
        for (int i = 1; i < list.length; i++) {
            double currentElement = list[i];
            int k;
            for (k = i - 1; k >= 0 && list[k] > currentElement; k--) {
                list[k + 1] = list[k];
            }
            list[k + 1] = currentElement;
        }
    }

    public static void main(String[] args) {
        insertionSort1(list1);
        for (int i = 0; i < list1.length;i++){
            System.out.println(list1[i] + " ");
        }

    }
}
