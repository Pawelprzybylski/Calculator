import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Witam w kalkulatorze!");
        Scanner scanner = new Scanner(System.in);
        boolean runApp;

        do {
            System.out.println("Wybierz jedną z opcji: ");
            System.out.println("+ Dodawanie ");
            System.out.println("- Odejmowanie ");
            System.out.println("* Mnożenie ");
            System.out.println("/ Dzielenie ");

            char option = scanner.nextLine().charAt(0);
            Calculator calculator = new Calculator();
            calculator.addOperation('+', new Addition());
            calculator.addOperation('-', new Substraction());
            calculator.addOperation('*', new Multiplication());
            calculator.addOperation('/', new Division());

            System.out.println("Wprowadź pierwszą liczbę: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Wprowadź drugą liczbę: ");
            int secondNumber = scanner.nextInt();

            double result = calculator.calculate(option, firstNumber, secondNumber);
            System.out.println(result);

            System.out.println(" Czy chcesz kontynuować?");
            System.out.println("1. Tak");
            System.out.println("2. Nie");
            int yesOrNo = scanner.nextInt();
            runApp = yesOrNo == 1;

        } while (runApp);

    }

}
