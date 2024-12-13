public class mathFunction {
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Использование: java mathFunction <a> <b>");
                return;
            }

            try {
                double a = Double.parseDouble(args[0]);
                double b = Double.parseDouble(args[1]);

                // Вычисление max и min
                double max = Math.max(a, b + 2);
                double min = Math.min(1 - a, b);

                // Вычисление числителя и знаменателя
                double numerator = 5 * max - 4 * min;
                double denominator = 3 + (max / min);

                // Вычисление d
                double d = numerator / denominator;

                // Вывод результата
                System.out.println("Результат d: " + d);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите два числа в качестве аргументов.");
            } catch (ArithmeticException e) {
                System.out.println("Ошибка: деление на ноль в вычислении знаменателя.");
            }
        }
    }

