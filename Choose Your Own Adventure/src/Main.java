import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
public static void main(String[] args) throws Exception {
    boolean biOrHexCorrect = false;
    Scanner responder = new Scanner(System.in);
    System.out.println("Welcome to \033[3mThe Game.\033[0m\nInput your desired Username to Begin.");
    String username = responder.nextLine();
    System.out.println("Well then, " + username + ", let's begin.");
    System.out.println("You've been transported into the digital world and must find a way to escape.");
    System.out.println("Okay, " + username + ", will you go to the left or to the right? (left/right)");
    String biOrHex = responder.nextLine();
    if (biOrHex.toLowerCase() == "l"){
        System.out.println("You go left. You see an on signal and an off signal. Which signal will you follow? (On/Off)");
        String bin = responder.nextLine();
        if (bin.toLowerCase().equals("on")){
            System.out.println("You follow the On signal.");
            System.out.println("");
        }
        if (bin.toLowerCase().equals("off")){
            System.out.println("You follow the Off signal.");
            System.out.println("You suddenly turn into a circle  ");

        }
    }
    if (biOrHex.toLowerCase().equals("r")){
        System.out.println("You see 16 characters, 0-9, and A-F. Which will you choose?");
        String hex = responder.nextLine();
        if (hex.equals("a") || hex.equals("b") || hex.equals("c") || hex.equals("d") || hex.equals("e") || hex.equals("f")){
            System.out.println("Excellent choice. Would you prefer the Night Vision Goggles or 3 pennies? (goggles/pennies)");
            String gp = responder.nextLine();
            if (gp.toLowerCase().equals("goggles")){
                System.out.println("Phew. Almost thought you would choose the pennies. Left or right? (l/r)");
                String lrs = responder.nextLine();}
            if (gp.toLowerCase().equals("pennies")){
                System.out.println("I mean not my choice, but you do you.");}
        }
        if (hex.equals("0") || hex.equals("1") || hex.equals("2") || hex.equals("3") || hex.equals("4") || hex.equals("5") || hex.equals("6") || hex.equals("7") || hex.equals("8") || hex.equals("9") ){
            System.out.println("Respectable Decision. Will you be taking the Jetpack or the Laser Sword? (jetpack/lasersword");
            String jls = responder.nextLine();
            if (jls.toLowerCase().equals("jetpack")){System.out.println("Good on you, flyboy.");}
            if (jls.toLowerCase().equals("lasersword")){}
        }
    }
    responder.close();
    }
    
}