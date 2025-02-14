import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String partyAff = "";
        System.out.println("D - Democrat \t R - Republican  \t I - Independent \n Choose  your party: ");

        partyAff = in.nextLine();

        if (partyAff.equalsIgnoreCase("D")) {
            System.out.println("you get a Democratic Donkey!");
        } else if (partyAff.equalsIgnoreCase("R")) {
            System.out.println("You get a Republican Elephant!");
        } else if (partyAff.equalsIgnoreCase("I")) {
            System.out.println("You get a Man for Independent!");
        } else {
            System.out.println("you get Other!");
        }

    }
}
