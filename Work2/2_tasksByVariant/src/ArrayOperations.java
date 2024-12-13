import java.util.Random;

public class ArrayOperations {
    public static void main(String[] args) {
        int[] array = new int[20];
        Random random = new Random();

        // Заполнение массива случайными значениями от -99 до 99
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(199) - 99;
        }

        System.out.println("Исходный массив:");
        printArray(array);

        // Создание массива с обратными значениями
        double[] reciprocalArray = CreateReciprocalFraction(array);
        System.out.println("\nМассив с обратными значениями:");
        printArray(reciprocalArray);

        // Замена местами максимального и минимального элементов
        swapMaxAndMin(array);
        System.out.println("\nИзменённый массив:");
        printArray(array);
    }

    // Метод для создания массива с обратными значениями
    public static double[] CreateReciprocalFraction(int[] array) {
        double[] reciprocalArray = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            try {
                reciprocalArray[i] = 1.0 / array[i];
            } catch (ArithmeticException e) {
                reciprocalArray[i] = 0; // Обработка деления на ноль
                System.out.println("Ошибка: деление на ноль для элемента с индексом " + i);
            }
        }
        return reciprocalArray;
    }

    // Метод для замены местами максимального и минимального элементов
    public static void swapMaxAndMin(int[] array) {
        int maxIndex = 0, minIndex = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[maxIndex]) {
                maxIndex = i;
            }
            if (array[i] < array[minIndex]) {
                minIndex = i;
            }
        }

        // Замена местами
        int temp = array[maxIndex];
        array[maxIndex] = array[minIndex];
        array[minIndex] = temp;
    }

    // Метод для вывода массива
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Перегруженный метод для вывода массива типа double
    public static void printArray(double[] array) {
        for (double value : array) {
            System.out.printf("%.2f ", value);
        }
        System.out.println();
    }
}
