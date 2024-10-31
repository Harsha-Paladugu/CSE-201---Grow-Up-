import java.util.Scanner;

public class Control {
    
    public int Prompt(String question, Player player) {
        
        // ask question and collect input
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            
            System.out.println(question + " Y/N: ");
            String answer = sc.next();
            
            // if yes return 1
            if(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("y")) {
                sc.close();
                return 1;
            } 
            
            // if no return 0
            else if(answer.equalsIgnoreCase("no") || answer.equalsIgnoreCase("n")) {
                sc.close();
                return 0;
            }
            
            // if menu, show menu and prompt again
            else if(answer.equalsIgnoreCase("menu") || answer.equalsIgnoreCase("m")) {
                player.menu.showStats(); 
            }
            
            // if input is invalid, prompt until a valid input is given
            else {
                System.out.println("Input not valid, please try again.");
            }
        }
    }
}
