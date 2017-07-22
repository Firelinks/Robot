package robot;
import java.util.Scanner;

/* @author itvet */

public class Robot {
    
    public String person;

    public static void main(String[] args) {
        System.out.println("Hello, my name is Robodrinky. What is your name?");
        System.out.print("NAME: ");
        Scanner name = new Scanner (System.in);
        System.out.print (name.nextLine());
        
        System.out.println (", nice to meet you. I currently have three drinks ready to be served.");
        System.out.println ("1) Orange Juice");
        System.out.println ("2) Lime Juice");
        System.out.println ("3) Lemon Juice");
        
        System.out.println ("Please select the number beside one of the three drink choices we have available.");
        Scanner choice = new Scanner (System.in); 
        System.out.print ("CHOICE: ");
        int drink = choice.nextInt();    
        switch (drink) {
            case 1:
                System.out.println("You have selected orange juice, please wait...");
                OrangeJuice juice1 = new OrangeJuice();
                break;
            case 2:
                System.out.println("You have selected lime juice, please wait...");
                LimeJuice juice2 = new LimeJuice();
                break;
            case 3:
                System.out.println("You have selected lemon juice, please wait...");
                LemonJuice juice3 = new LemonJuice();
                break;
            default:
                System.out.println("Error, your selection is not on the list!");                
                break;
        }
        System.out.print("It was a pleasure serving you! Enjoy your drink.");
    
}
