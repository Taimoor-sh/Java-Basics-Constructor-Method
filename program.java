import java.util.Scanner;
/**
 * program
 */
public class program {

  public static void main(String[] args) {
    int x = 1 ; int y = 0 ;
    do {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Your Name :");
      String i = sc.nextLine(); 
      System.out.println("Enter Your Age :");
      int j = sc.nextInt(); 
       program num = new program(j, i);
    } while (x>y);
  }
  program(int i , String j){
    System.out.println("Your Name is : " + j );
    System.out.println("Your Age is : " + i );
  }
}
