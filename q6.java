import java.util.Scanner;

/**
 * Write a description of class q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q6
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter water level in litres");
        int waterLevel= input.nextInt();
        System.out.println("your water level is :" + waterLevel);
        
        String isValid= (waterLevel <= 1000)? "Status:Normal" : "Water level has reached 1000L or more!";
        System.out.println(isValid);

        
    
    
    
    }
}