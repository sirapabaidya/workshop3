import java.util.Scanner;

/**
 * Write a description of class AusadiPasal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AusadiPasal
{
    public static void main(String[] args){
    Scanner aausadhi= new Scanner(System.in);

    
    System.out.println("what medicine you want?");
    String Med = aausadhi.nextLine();
    System.out.println("your medicine is:" +Med);
    
    System.out.println("how much quantity?");
    String qnty = aausadhi.nextLine();
    System.out.println("you have ordered:" +qnty);
    
    System.out.println("The price of med");
    int price = aausadhi.nextInt();
    System.out.println("the price of med is:" +price);
    
    
    }
}