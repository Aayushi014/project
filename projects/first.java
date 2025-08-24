package projects;
import java.util.Scanner;
import java.util.Random;
public class first {
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       Random random = new Random();
       System.out.println("Welcome to Rock,Paper,Scissors!");
       String[] choices = {"rock","paper","scissor"};
      while(true){
        System.out.println("Enter your choices(rock,paper,scissor) or quit");
       String usermove = sc.nextLine().toLowerCase();
       if(usermove.equals("quit")){
         System.out.println("Thanks for playing");
         break;
       }
       boolean isValidMove = false;
       for(String choice:choices){
           if(usermove.equals(choice)){
              isValidMove = true;
              break;
           }
       }
       if(!isValidMove){
          System.out.println("Invalid move.Please enter rock,paper or scissor.");
          continue;
       }
       String computermove = choices[random.nextInt(choices.length)];
       System.out.println("computer move :" + computermove);
       if(usermove.equals(computermove)){
          System.out.println("Tie!");
       }else if(usermove.equals("rock") && computermove.equals("scissor") ||
             usermove.equals("paper") && computermove.equals("rock") ||
             usermove.equals("scissor") && computermove.equals("paper")
             ){
                System.out.println("You win!");
            }else{
                System.out.println("You loss!");
             }
        }
        sc.close();
    }
}
