import java.util.Scanner;

class Prob1 {
  public static void main(String[] args) {

    char operator;
    Double a, b, result;

    Scanner scan = new Scanner(System.in);

    System.out.println("Choose an operator: +, -, *, or /");
    operator = scan.next().charAt(0);

    System.out.println("Enter a");
    a = scan.nextDouble();

    System.out.println("Enter b");
    b = scan.nextDouble();

    switch (operator) {

      case '+':
    	  result = a+ b;
          System.out.println("Addition of two entered number is : "+result);
       break;

      case '-':
    	  result = a - b;
          System.out.println("Subtraction of two entered number is : "+result);
        break;

      case '*':
    	  result = a * b;
          System.out.println("Multiplication of two entered number is : "+result);
        break;

      case '/':
    	  result = a / b;
        System.out.println("Division of two entered number is : "+result);
        break;

      default:
        System.out.println("Please load valid operator");
        break;
    }

    scan.close();
  }
}