import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // create a input
        String computer = "";
        String player;
        int computerInt;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter Rock, Paper or Scissors");
        //get player input
        player = scan.nextLine();
        System.out.println("Player chooses: " + player);
        // random computer's play 0, 1, 2
        computerInt = random.nextInt(3);
        // Convert 0, 1, 2 to Rock, Paper, and Scissors
        if(computerInt == 0)
            computer = "Rock";
        else if(computerInt == 1)
            computer = "Paper";
        else if(computerInt == 2)
            computer = "Scissors";
        System.out.println("Computer chooses: " + computer);
        // Using if Statements to compare who wins

        if(player.equals(computer)){
            System.out.println("Ties");
        }
        else{
            if(player.equals("Rock")){
                if(computer.equals("Paper")){
                    System.out.println("Player loses");
                }
                else{
                    System.out.println("Player wins");
                }
            }
            else if(player.equals("Paper")){
                if(computer.equals("Rock")){
                    System.out.println("Player wins");
                }
                else{
                    System.out.println("Player loses");
                }
            }
            else if(player.equals("Scissors")){
                if(computer.equals("Rock")){
                    System.out.println("Player loses");
                }
                else{
                    System.out.println("Player wins");
                }
            }
            else{
                System.out.println("Please try again");
            }

        }

    }
}
