public class arrays {

        import java.util.Random;


        public static void arrays(String[] args) {
            // Размеры матрицы
            int rows = 5;
            int cols = 5;

            // Создаем матрицу
            int[][] matrix = new int[rows][cols];
            Random rand = new Random();

            // Заполняем матрицу случайными числами от -10 до 10
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix[i][j] = rand.nextInt(21) - 10; // Случайное число от -10 до 10
                }
            }

            // Выводим матрицу
            System.out.println("Матрица:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(matrix[i][j] + "\t");
                }
                System.out.println();
            }

            // Для каждого столбца вычисляем среднее арифметическое положительных элементов
            System.out.println("\nСреднее арифметическое положительных элементов в каждом столбце:");
            for (int j = 0; j < cols; j++) {
                int sum = 0;
                int count = 0;

                for (int i = 0; i < rows; i++) {
                    if (matrix[i][j] > 0) {
                        sum += matrix[i][j];
                        count++;
                    }
                }

                // Выводим результат для столбца
                if (count > 0) {
                    double average = (double) sum / count;
                    System.out.println("Столбец " + (j + 1) + ": " + average);
                } else {
                    System.out.println("Столбец " + (j + 1) + ": Нет положительных элементов");
                }
            }
        }
    }

