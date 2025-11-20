
/**
 * Write a description of class tutorial4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class tutorial4
{
    int age; //instance variavle
    static int qnty; //static variable
    public static void main(String[] args)
    {
        int i= 10; //local variable
        System.out.println(i);
        
        //implicit typecasting
        
        double db=i;
        System.out.println(db);
        
        byte b = 2;
        float f=b;
        System.out.println(f);
        
        //explicit type casting
        
        double d= 10.7876736;
        int it=(int)d;
        System.out.println(it);
        
        //exception in arithmetic
        byte bt=10;
        byte btr=11;
        byte sum=(byte)(bt+btr);
        
        char a= 'A';
        char br='B';
        char s=(char)(br-a);
        System.out.println(s); //short
        
        //max,min,size and bytes
        
        System.out.println(Byte.MAX_VALUE); //RETURN MAX VALUE
        System.out.println(Byte.MIN_VALUE); //RETURN MIN VALUE
        System.out.println(Byte.SIZE); //return in bits 
        System.out.println(Byte.BYTES); //return in bytes
        
        //escape sequesnce
        
        System.out.println("Hello\nWorld"); //new line
        System.out.println("Hamro\tNepal"); //tab
        System.out.println("She said \"Hello\" "); //double quotation
        
        
        //unicode escape sequence
    
        System.out.println("\u2764");
        
        
        
        

     
    
    
    
    
    }
}