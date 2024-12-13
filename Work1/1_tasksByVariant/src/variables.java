public class variables {
        public static void main(String[] args) {
            if (args.length != 1) {
                System.out.println("Использование: java CalculateYAndF <x>");
                return;
            }

            try {
                double x = Double.parseDouble(args[0]);
                double y, f;

                // Вычисление Y
                if (x <= -2) {
                    y = Math.pow(x, 5) - Math.tan(2 * x - 1);
                } else if (x > -2 && x <= 1) {
                    y = 3 * x * (1 + Math.exp(1));
                } else { // x > 1
                    y = Math.pow(Math.sin(x), 5);
                }

                // Вычисление F
                if (x <= -2) {
                    f = Math.pow(Math.E, Math.sin(x));
                } else if (x > -2 && x <= 1) {
                    f = Math.pow(x, 2);
                } else { // x > 1
                    if (Math.cos(x) == 0) {
                        throw new ArithmeticException("Ошибка: деление на 0 при вычислении F для x > 1.");
                    }
                    f = 1 / Math.sqrt(Math.cos(x));
                }

                // Вывод результата
                System.out.println("Результат Y: " + y);
                System.out.println("Результат F: " + f);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите число в качестве аргумента.");
            } catch (ArithmeticException e) {
                System.out.println(e.getMessage());
            }
        }
    }

