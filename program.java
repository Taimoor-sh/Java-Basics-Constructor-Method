import java.util.Scanner;
/**
 * program
 */
public class program {

  public static void main(String[] args) {
    int x = 1 ; int y = 0 ;
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Please Enter the number :");
      int i = sc.nextInt(); 
       program num = new program(i);  
       num.sqrt(i);
    } while (x>y);
  }
  program(int i){
    System.out.println("You have Entered The Number : " + i );
  }
  public static void sqrt(int i) {
    System.out.println("Square Root of Entered Number is : " + Math.sqrt(i) );
  }
}
