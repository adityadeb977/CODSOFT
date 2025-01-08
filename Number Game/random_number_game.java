import java.util.*;
public class random_number_game {
    public static void main(String [] args)
    {  
        Random random=new Random();//generating random number
        Scanner sc=new Scanner(System.in);
        boolean playAgain=true;
        while(playAgain){
        int min=1;
        int max=100;
        int random_number=random.nextInt(max-min+1)+min;
        // System.out.println("The random no generated is "+(random_number));
        System.out.println("Welcome to Number Game!");
        System.out.println("You only have 3 attempts to guess correct number");
        System.out.println("Please Enter guess for generated number ");
        int guess_number=sc.nextInt();
        int attempts=3;
        while(attempts!=0)
        {
           
        if(guess_number>random_number)
        {
            System.out.println("Guessed no is too high");
            attempts--;
            if(attempts==0){
                System.out.println("Game over");
                System.out.println("your score is 0");
                System.out.println("Correct number was "+ random_number);
            break;}
            else{
            System.out.println("you have "+attempts +" attempts remaining");
            System.out.println("Enter no again");  
            guess_number=sc.nextInt();
            }
            
        }
        else  if(guess_number<random_number)
        {
            System.out.println("Guessed no is too low");
            attempts--;
            if(attempts==0)
            {
                System.out.println("Game over");
                System.out.println("Your score is 0");
                System.out.println("Correct number was "+ random_number);
                break;
            }
            else{
            System.out.println("you have "+ attempts+" attempts remaining");
            System.out.println("Enter number again");
            guess_number=sc.nextInt();
            }
            
        }
        else{
            System.out.println("Correct guess you won");
            if(attempts==3)
            {
                System.out.println("Your score is 30");
            }
            else if(attempts==2)
            {
                System.out.println("Your score is 60");
            }
            else if(attempts==3)
            {
                System.out.println("Your score is 90");
            }
            break;
        }
        
        }
        
        System.out.println("Do you want to play again?");
        sc.nextLine();
        String response=sc.nextLine().trim().toLowerCase();
        if(response.equals("yes"))
        {
            playAgain=true;
            
            
        }
        else if(response.equals("no"))
        {
            System.out.println("thank you for playing the game");
            playAgain=false;
           
            
        }
        else
        {
            System.out.println("Invalid input");
            playAgain=false;
        }
    }
    sc.close();
    }
        
        
    }     
    

