public class Sum {
    public static void main(String[] args) {
        if (args.length == 2) {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int sum = num1 + num2;
                System.out.println(num1 + " + " + num2 + " = " + sum);
            } catch (NumberFormatException e) {
                System.out.println("Оба параметра должны быть целыми числами");
            }
        } else {
            System.out.println("Неверное количество параметров");
        }
    }
}
