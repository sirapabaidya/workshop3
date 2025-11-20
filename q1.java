
/**
 * Write a description of class q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class q1
{
    public static void main(String[] args){
        //arithmetic add
        int a = 5;
        int b= 8;
        int s=a+b;
        System.out.println(s);
        
        //subtract
        int c=7;
        int d=9;
        int sub=a-b;
        System.out.println(sub);
        
        //multiply
        int e=8;
        int f=6;
        int mul=e*f;
        System.out.println(mul);
        
        //divide
        int g=10;
        int h=5;
        int div=10/5;
        System.out.println(div);
        
        
        
        
        
        //post unary
        int u=6;
        System.out.println(u);
        int post= u++;
        int pre =++u;
        System.out.println(u);
        
        //assignment
        int i=7;
        int j=4;
        int assign=i+j;
        
        //relational
        int k=78;
        int l=89;
        System.out.println(k==l);
        System.out.println(k!=l);
        System.out.println(k<l);
        System.out.println(k>l);
        System.out.println(k<=l);
        System.out.println(k>=l);
        
        //logical
        int age=16;
        String isValid= (age >= 18)? "you are eligible to vote" : "you are not eligible to vote";
        System.out.println(isValid);
        
        //ternary
        int m=67;
        int n=87;
        int max =(m>n)? m:n;
        System.out.println(max);
        
        
    
    
    
    
    
    
    
    
    }
}