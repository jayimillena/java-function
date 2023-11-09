import java.util.Scanner;

public class JackEnPoy
{
  public static void main(String[] args)
  {
    System.out.println("Welcome to Jack En Poy Game! ");
    show_message();
  }

  public static void show_message()
  {
    Scanner input = new Scanner(System.in);
    System.out.print("What is your name? " );
    String name = input.nextLine();
    System.out.print("Hi "+ name);
  }
}