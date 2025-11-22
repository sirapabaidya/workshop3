import java.util.Scanner;

/**
 * Write a description of class q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q4
{
    public static void main (String[] args)
    {
    Scanner input = new Scanner(System.in);
    
    System.out.println("enter your name");
    String Name= input.nextLine();
    System.out.println("student's name is " +Name);
    
    System.out.println("enter your age");
    String age= input.nextLine();
    System.out.println("student's age is " +age);
    
    System.out.println("enter your gpa");
    String gpa= input.nextLine();
    System.out.println("student's gpa is " +gpa);
    
    int a=16;
    int b=9;
    System.out.println(a++ - ++a);
    System.out.println(a);

    System.out.println(b++ + b++);
    System.out.println(b);
    }
}