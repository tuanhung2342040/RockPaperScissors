import java.util.Random;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        int playerScore =0;
        int computerScore=0;
        boolean keepPlaying = true;
        String computer = "";
        String player ;
        int computerRan;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();        
       
        
        while(keepPlaying){ 
                System.out.println("--------------------------------------");
                System.out.println("Please enter Rock, Paper or Scissors");
                //get player input
                player = scan.nextLine();
                System.out.println("Player chooses: " + player);
                if(player.equals("x")){
                keepPlaying = false;              
                 }
                else{
                    // random computer 0, 1, 2
                    computerRan = random.nextInt(3);
                    // Convert 0, 1, 2 to Rock, Paper, and Scissors
                    if(computerRan == 0){
                        computer = "Rock";
                    }
                    else if(computerRan == 1){
                        computer = "Paper";
                    }
                    else if(computerRan == 2){
                        computer = "Scissors";
                    }
                    System.out.println("Computer chooses: " + computer);
                     // Using if Statements to compare who wins
                    
                    if(player.equals(computer)){
                        System.out.println("Ties");
                    }
                    else{
                        if(player.equals("Rock")){
                            if(computer.equals("Paper")){
                                System.out.println("Player loses");
                                computerScore++;
                            }
                            else{
                                System.out.println("Player wins");
                                playerScore++;
                            }
                        }
                        else if(player.equals("Paper")){
                            if(computer.equals("Rock")){
                                System.out.println("Player wins");
                                playerScore++;
                            }
                            else{
                                System.out.println("Player loses");
                                computerScore++;
                            }
                        }
                        else if(player.equals("Scissors")){
                            if(computer.equals("Rock")){
                                System.out.println("Player loses");
                                computerScore++;
                            }
                            else{
                                System.out.println("Player wins");
                                playerScore++;
                            }
                        }
                        // If player does not choose Rock, Paper or Scissors. 
                        // It wili print Please try again
                        else{
                            System.out.println("That's an invalid selecton!!!! Please try again");
                        }
                        //print computer's score and player's score
                        System.out.println("computerScore is: " + computerScore);
                        System.out.println("playerScore is " + playerScore);

                     }

               }
       
      }
   }

   
}
