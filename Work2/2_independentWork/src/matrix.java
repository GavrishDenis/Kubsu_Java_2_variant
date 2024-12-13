public class matrix {
import java.util.Random;

    public class matrix {

        public static void matrix(String[] args) {
            // Размер матрицы
            int n = 5;

            // Создаем квадратную матрицу размером n x n
            int[][] matrix = new int[n][n];
            Random rand = new Random();

            // Заполняем матрицу случайными числами от -10 до 10
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = rand.nextInt(21) - 10; // Случайное число от -10 до 10
                }
            }

            // Выводим матрицу
            System.out.println("Матрица:");
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Найдем элементы побочной диагонали и их индексы
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            int minIndex = -1;
            int maxIndex = -1;

            for (int i = 0; i < n; i++) {
                int value = matrix[i][n - i - 1]; // Элемент побочной диагонали
                if (value < min) {
                    min = value;
                    minIndex = i;
                }
                if (value > max) {
                    max = value;
                    maxIndex = i;
                }
            }

            // Выводим результат
            System.out.println("\nМинимальный элемент побочной диагонали: " + min + " (Индекс строки: " + minIndex + ")");
            System.out.println("Максимальный элемент побочной диагонали: " + max + " (Индекс строки: " + maxIndex + ")");
            System.out.println("\nСумма индексов минимального и максимального элемента: " + (minIndex + maxIndex));
        }
    }

