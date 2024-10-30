import java.util.*;

public class Main {
  public static void main(String[] args) {
    int choice=0;
    try {
      choice = getMenuChoice();
      System.out.println("Thankyou for choosing " + choice);
      }
    catch (IllegalMenuChoice e) {
      System.out.println("This is Illegal " + e.getMessage());
    }
    catch (IllegalArgumentException e) {
      System.out.println(e.getMessage());
//      e.printStackTrace();
      }
    
    
    
    }

    
  


public static int getMenuChoice() throws IllegalArgumentException {
  System.out.println("Choose a menu option");
  System.out.println("1: First");
  System.out.println("2: Second");
  System.out.println("3: Third");
  System.out.println("4: Quit");
  Scanner input = new Scanner(System.in);
  int choice = input.nextInt();
  input.close();
  if (choice < 1 || choice > 4) 
    throw new IllegalMenuChoice("Bad choice, bro");
  return choice;
}
}