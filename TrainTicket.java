
package trainticket;
import java.util.Scanner;
import static java.lang.System.out;
import java.time.LocalDate;
import java.time.LocalTime;


public class TrainTicket { 
   static double[] prices = {15.00 , 21.50 , 28.60};
   
    public static int destination(String name,int age){
    
    Scanner sc = new Scanner(System.in);
    out.println("Please choose the destination you would like to go to\n"
            + "1: floobtown\n"
            + "2: floobeansCity\n"
            + "3: sixtynineNice\n");
    
    String f = sc.nextLine();
    
    int x = Integer.parseInt(f);

    switch(x){
        case 1:
            if (age < 18) {
            prices[0] *= 0.7;
            out.println("That will be " + prices[0] + ", your ticket will be printed now");
            //call print method
            Printmethod(name,age,x);
            } else {
            out.println("That will be " + prices[0] + ", your ticket will be printed now");
            //call print method
            Printmethod(name,age,x);
            }
            
        case 2:
             if (age < 18) {
            prices[1] *= 0.7;
            out.println("That will be " + prices[1] + ", your ticket will be printed now");
            //call print method
            Printmethod(name,age,x);
            } else {
            out.println("That will be " + prices[1] + " your ticket will be printed now");
            //call print method
            Printmethod(name,age,x);
            }
                
        case 3:
             if (age < 18) {
            prices[2] *= 0.7;
            out.println("That will be " + prices[2] + ", your ticket will be printed now");
            //call print method
            Printmethod(name,age,x);
            } else {
            out.println("That will be " + prices[2] + " your ticket will be printed now");
            //call print method
            Printmethod(name,age,x);
            }
             
        default :
            break;        
    }
    return x;
    }
    
    public static void Printmethod(String name, int age, int x){
        out.println("--------------------------------------------------------");
    out.println("Hi " + name);
       switch (x) {
           case 1:
               out.println("You have selected to go to floobtown");
               break;
           case 2:
               out.println("You have selected to go to floobeans town");
               break;
           case 3:
               out.println("You have selected to go to sixtynineNice town");
               break;
           default:
               break;
       }
    
       switch (x) {
           case 1:
               out.println("You have paid R" + prices[0]);
               break;
           case 2:
               out.println("You have paid R" + prices[1]);
               break;
           case 3:
               out.println("You have paid R" + prices[2]);
               break;
           default:
               break;
       }
       
     LocalDate obj = LocalDate.now();
     out.println(obj);
     LocalTime obj1 = LocalTime.now();
     out.println(obj1);
     out.println("--------------------------------------------------------");
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.println("please enter your name");
        String name = sc.nextLine();
try{
        out.println("please enter your age");
        int age = sc.nextInt();

        
        destination(name,age);
} catch (Exception e) {
out.println("Please enter a valid age");
}
    }
    
}
