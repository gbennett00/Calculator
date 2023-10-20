import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class Main {
  public static void main(String[] args) {
    System.out.println("Enter a command");
    Calculator calculator = new Calculator();
    Scanner s = new Scanner(System.in);
    while (s.hasNextLine()) {
      String[] input = s.nextLine().split(" ");
      switch (input[0]) {
        case "add":
          System.out.println(calculator.add(parseInt(input[1]), parseInt(input[2])));
          break;
        case "subtract":
          System.out.println(calculator.subtract(parseInt(input[1]), parseInt(input[2])));
          break;
        case "multiply":
          System.out.println(calculator.multiply(parseInt(input[1]), parseInt(input[2])));
          break;
        case "divide":
          System.out.println(calculator.divide(parseInt(input[1]), parseInt(input[2])));
          break;
        case "fibonacci":
          System.out.println(calculator.fibonacciNumberFinder(parseInt(input[1])));
        case "binary":
          System.out.println(calculator.intToBinaryNumber(parseInt(input[1])));
      }
    }
  }
}
