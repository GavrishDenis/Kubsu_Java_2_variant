public class ComplexNumber {
    private double real; // Действительная часть
    private double imaginary; // Мнимая часть

    // Конструктор
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Геттеры
    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    // Метод для вычитания комплексного числа
    public ComplexNumber subtract(ComplexNumber other) {
        return new ComplexNumber(this.real - other.real, this.imaginary - other.imaginary);
    }

    // Переопределение метода toString для удобного отображения
    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(4.0, 5.0);
        ComplexNumber num2 = new ComplexNumber(2.0, 3.0);

        ComplexNumber result = num1.subtract(num2);

        System.out.println("Результат вычитания: " + result);
    }
}

