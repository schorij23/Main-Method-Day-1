import java.util.Scanner;

// Main Method
// Scanner Class
// System.out.println Statements
// if/else statements


class Main {
  public static void main(String[] args) {
    System.out.println("please input number :");

    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    if (number > 0) {
      System.out.println("you input a positive number!");
    } else {
      System.out.println("you input a negative number!!!");
    }
  }
}

