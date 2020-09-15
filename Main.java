import java.util.Scanner;
/**
 *
 * @author Gavin Sandhar
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // detirmine the greater number

    // Create a scanner for user input
    Scanner input = new Scanner(System.in);
    
    // ask user to enter two numbers
    System.out.print("Please enter a number:");
    int number1 = input.nextInt();

    System.out.print("Please enter another number:");
    int number2 = input.nextInt();

    // determine which number is greater    
    if(number1>number2){
      // tell them if the number is greater
      System.out.print(number1 + "is greater" );
    }else if(number1==number2){
      // tell them the numbers are equal
      System.out.print(number1 + "and" + number2 + "are equal");
    }else {
      // or if the other number is greater
      System.out.println(number2 + "is greater");
    }

  
    
  }
}
