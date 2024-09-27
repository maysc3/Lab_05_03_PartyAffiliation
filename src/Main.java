import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAfil = "";
        System.out.print("Enter your political party affiliation [D,R,I]: ");
        if (in.hasNextLine())
        {
            partyAfil = in.next();
            if (partyAfil.equalsIgnoreCase("D"))
            {
                System.out.println("You chose " + partyAfil + " You get a Democratic Donkey.");
            }
            else if (partyAfil.equalsIgnoreCase("R"))
            {
                System.out.println("You chose " + partyAfil + " You get a Republican Elephant.");
            }
            else if (partyAfil.equalsIgnoreCase("I"))
            {
                System.out.println("You chose " + partyAfil + " You get an Independent Man.");
            }
            else{
                System.out.println("You chose " + partyAfil + " this is not a valid party, please enter [D,R,I] and restart the program.");
            }
        }
    }
}
