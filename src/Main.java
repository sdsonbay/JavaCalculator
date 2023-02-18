import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int selection;
        String menu = "1- Summation\n"
                + "2- Subtraction\n"
                + "3- Multiplication\n"
                + "4- Division\n"
                + "5- Calculate Power\n"
                + "6- Calculate Factorial\n"
                + "7- Mode\n"
                + "8- Rectangle area and perimeter\n"
                + "0- Log Out";

        do{
            System.out.println(menu);
            System.out.println("Select an operation: ");
            selection = scanner.nextInt();
            switch(selection){
                case 1:
                    summation();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mode();
                    break;
                case 8:
                    rectangle();
                    break;
                case 0:
                    System.out.println("Logged Out!");
                    break;
                default:
                    System.out.println("Invalid Operation!");
                    break;
            }
        }while(selection != 0);
    }

    public static void summation(){
        Scanner scanner = new Scanner(System.in);
        int number, sum = 0;
        System.out.println("How many numbers do you want to sum: ");
        int count = scanner.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.println("Enter " + i + ". number: ");
            number = scanner.nextInt();
            sum += number;
        }
        System.out.println("Result: " + sum);
        System.out.println("--------------------------------");
    }
    public static void subtraction(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 0;
        System.out.println("How many numbers do you want to subtract: ");
        int count = scanner.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.println("Enter " + i + ". number: ");
            number = scanner.nextInt();
            result -= number;
        }
        System.out.println("Result: " + result);
        System.out.println("--------------------------------");
    }
    public static void multiplication(){
        Scanner scanner = new Scanner(System.in);
        int number, result = 1;
        System.out.println("How many numbers do you want to multiply: ");
        int count = scanner.nextInt();
        for(int i = 1; i <= count; i++){
            System.out.println("Enter " + i + ". number: ");
            number = scanner.nextInt();
            result *= number;
        }
        System.out.println("Result: " + result);
        System.out.println("--------------------------------");
    }
    public static void division(){
        Scanner scanner = new Scanner(System.in);
        int firstNumber, secondNumber;
        double result = 0D;
        System.out.println("Enter the first number: ");
        firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        secondNumber = scanner.nextInt();
        result = (double) firstNumber / secondNumber;
        System.out.println("Result: " + result);
        System.out.println("--------------------------------");
    }
    public static void power(){
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        System.out.println("Enter the power: ");
        int pow = scanner.nextInt();
        for(int i = 0; i < pow; i++){
            result *= number;
        }
        System.out.println("Result: " + result);
        System.out.println("--------------------------------");
    }
    public static void factorial(){
        int result = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        while(number > 0){
            result *= number;
            number--;
        }
        System.out.println("Result: " + result);
        System.out.println("--------------------------------");
    }
    public static void mode(){
        int result = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int secondNumber = scanner.nextInt();
        result = firstNumber % secondNumber;
        System.out.println("Result: " + result);
        System.out.println("--------------------------------");
    }
    public static void rectangle(){
        int area, perimeter;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first edge length: ");
        int firstEdge = scanner.nextInt();
        System.out.println("Enter the second edge length: ");
        int secondEdge = scanner.nextInt();
        area = firstEdge * secondEdge;
        perimeter = (firstEdge + secondEdge) * 2;
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Area: " + area);
        System.out.println("--------------------------------");
    }
}
