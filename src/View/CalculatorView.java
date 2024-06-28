package View;

import Controller.ComplexNumberController;
import Model.ComplexNumber;

import java.util.Scanner;

public class CalculatorView {
    private ComplexNumberController controller = new ComplexNumberController();

    public void start() throws Exception {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("1 - Сумма");
            System.out.println("2 - Умножение");
            System.out.println("3 - Деление");
            System.out.println("4 - Выйти");

            switch (scanner.nextInt()) {
                case 1 -> sum(inputComplexNumber("первого"), inputComplexNumber("второго"));
                case 2 -> multiply(inputComplexNumber("первого"), inputComplexNumber("второго"));
                case 3 -> divide(inputComplexNumber("первого"), inputComplexNumber("второго"));
                case 4 -> System.exit(0);

                default -> System.out.println("Операция не поддерживается");
            }
        }
    }

    private ComplexNumber inputComplexNumber(String s) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите Real " + s + " числа");
        int aReal = scanner.nextInt();
        System.out.println("Введите Imag " + s + " числа");
        int aImag = scanner.nextInt();

        return new ComplexNumber(aReal, aImag);
    }

    private void sum(ComplexNumber a, ComplexNumber b) {
        System.out.println(controller.sum(a, b));
    }

    private void multiply (ComplexNumber a, ComplexNumber b) {
        System.out.println(controller.multiply(a, b));
    }

    private void divide (ComplexNumber a, ComplexNumber b) {
        System.out.println(controller.divide(a, b));
    }
}
