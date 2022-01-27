import java.util.*;
import java.util.Random;

public class RPS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        
        int cpu_score = 0;
        int player_score = 0;
        
        while (true) {
            
            int computer = random.nextInt(3);
            
            String cpu_choice = "";
        
            if (computer == 0) {
                cpu_choice += "rock";
            }
            else if (computer == 1) {
                cpu_choice += "paper";
            }
            else {
                cpu_choice += "scissor";
            }
            
            System.out.println("Please enter your choice");
            System.out.println("Enter rock || paper || scissor || end ||");
            String player = sc.next();
            
            if (player.equals(cpu_choice)) {
                System.out.println("It's Draw");
            }
            
            else if (player.equals("rock")) {
                if (cpu_choice.equals("paper")) {
                    System.out.println("CPU Wins...");
                    cpu_score += 1;
                }
                else {
                    System.out.println("Player Wins...");
                    player_score += 1;
                }
            }
            
            else if (player.equals("paper")) {
                if (cpu_choice.equals("rock")) {
                    System.out.println("Player Wins...");
                    player_score += 1;
                }
                else {
                    System.out.println("CPU Wins...");
                    cpu_score += 1;
                }
            }
            
            else if (player.equals("scissor")) {
                if (cpu_choice.equals("paper")) {
                    System.out.println("Player Wins...");
                    player_score += 1;
                }
                else {
                    System.out.println("CPU Wins...");
                    cpu_score += 1;
                }
            }
            else if (player.equals("end")) {
                System.out.println("The final scores are as follows : ");
                System.out.println("CPU Score : "+ cpu_score);
                System.out.println("Player Score : " + player_score);
                System.out.println("Thanks for playing my game.");
                break;
            }
            
        }
      
    }
}
