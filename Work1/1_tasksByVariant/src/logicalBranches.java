public class logicalBranches {
        public static void main(String[] args) {
            if (args.length != 2) {
                System.out.println("Использование: java ProcessNumbers <x> <y>");
                return;
            }

            try {
                double x = Double.parseDouble(args[0]);
                double y = Double.parseDouble(args[1]);

                // Находим меньшее число
                double smaller = Math.min(x, y) / 10;

                // Выводим результат
                System.out.println("Меньшее число, делённое на 10: " + smaller);
            } catch (NumberFormatException e) {
                System.out.println("Пожалуйста, введите два числа в качестве аргументов.");
            }
        }
    }
