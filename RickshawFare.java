import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (Sirapa)
 * @version (a version number or a date)
 */
public class RickshawFare
{
    public static void main(String[] args){
    Scanner input= new Scanner(System.in);
    
    int fare=50;
    int perKm=40;
    int perMin=10;
    int longDistance=25;
    int localDiscount=5;
    int nightCharge=20;
    
    
    System.out.println("Enter your distance (in km): ");
    int distance=input.nextInt();
    
    System.out.println("Enter your time (in min): ");
    int time=input.nextInt();
    
    
    System.out.println("Is the customer local?(yes/no): ");
    String Local=input.nextLine();
    
    System.out.println("Is it night time?(yes/no): ");
    String atNight=input.nextLine();
    
    boolean isLocal = input.equals("yes") ? true : false;
    boolean night = input.equals("yes")? true:false;
    
    int Tfare= fare+(perKm*distance)+(perMin*time);
    System.out.println("your total fare is :" + Tfare);

    if (isLocal && distance > longDistance) 
    {
            Tfare = Tfare - (fare * localDiscount);
        }
    
    
    System.out.println("Final Fare: Rs. " + Tfare);
    
    
    
    }
}