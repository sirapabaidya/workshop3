import java.util.Scanner;

/**
 * Write a description of class q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q2
{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks= input.nextInt();
        System.out.println("your marks is :" + marks);
        
        String isValid= (marks >= 40 )? "your grade is: \npassed" : "Your grade is: \nfailed";
        System.out.println(isValid);
    
    
    
    
    }
}