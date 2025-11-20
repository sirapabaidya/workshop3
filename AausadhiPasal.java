import java.util.Scanner;

/**
 * This is a simple program of Aausadhi Pasal to make easier for the shopkeeper.
 *
 * @author (Sirapa Baidya)
 * @version (v1)
 */
public class AausadhiPasal
{
    public static void main(String[] args) {
    
        Scanner med = new Scanner(System.in);
        
        String med1="Cetamol";
        Double price1=55.0;
        int stock1= 100;
        boolean prescription1=false;
        
        String med2="Cetrizine";
        Double price2=80.0;
        int stock2= 150;
        boolean prescription2=true;
        
        
        String med3="Synex";
        Double price3=70.0;
        int stock3= 100;
        boolean prescription3=false;
        
        String med4="Rynex";
        Double price4=35.0;
        int stock4= 90;
        boolean prescription4=false;
        
        System.out.println("\t AAUSADHI PASAL REPORT");
        System.out.println("Medicine Name\tPrice(NPR)\tStock\t\tprescription");
        
        System.out.println(med1+"\t\t"+price1+"\t\t"+stock1+"\t\t"+ (prescription1? "yes" : "No"));
        System.out.println(med2+"\t"+price2+"\t\t"+stock2+"\t\t"+ (prescription2? "yes" : "No"));
        System.out.println(med3+"\t\t"+price3+"\t\t"+stock3+"\t\t"+ (prescription3? "yes" : "No"));
        System.out.println(med4+"\t\t"+price4+"\t\t"+stock4+"\t\t"+ (prescription4? "yes" : "No"));
    
        System.out.print("Enter stock for medicine: ");
        int newStock=med.nextInt();
        
        med.nextLine();
        
        System.out.print("Enter medicine name: ");
        String newMed= med.nextLine();
        
        System.out.println("Enter price for another medicine: ");
        double newPrice = med.nextDouble();
        
        System.out.println("You entered: "+ newMed + " with stock " + newStock + "and the price is:" +newPrice);
        
    
    
    }
}