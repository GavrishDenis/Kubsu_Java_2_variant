import java.util.ArrayList;
import java.util.Arrays;

public class ArrayProcessing {
    public static void main(String[] args) {
        // Исходный массив a
        int[] a = {1, -4, 5, 0, -3, 9, 2};

        System.out.println("Исходный массив a: " + Arrays.toString(a));

        // Создаем массив b, содержащий положительные элементы массива a, умноженные на 3
        int[] b = createArrayWithPositiveTripled(a);
        System.out.println("Массив b (положительные элементы, умноженные на 3): " + Arrays.toString(b));

        // Сортировка массива методом выбора
        selectionSort(b);
        System.out.println("Отсортированный массив b: " + Arrays.toString(b));
    }

    // Метод для создания массива с положительными элементами, умноженными на 3
    public static int[] createArrayWithPositiveTripled(int[] a) {
        ArrayList<Integer> tempList = new ArrayList<>();
        for (int value : a) {
            if (value > 0) {
                tempList.add(value * 3);
            }
        }

        // Преобразуем ArrayList в массив
        int[] b = new int[tempList.size()];
        for (int i = 0; i < tempList.size(); i++) {
            b[i] = tempList.get(i);
        }

        return b;
    }

    // Метод сортировки массива методом выбора
    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            // Меняем местами текущий элемент и минимальный элемент
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
    }
}
