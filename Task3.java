import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Party;
        System.out.print("Enter your party affiliation: ");
        System.out.print("D - Democrat ");
        System.out.print("R - Republican ");
        System.out.print("I - Independent ");
        Party = input.nextLine();

        if (Party.equals("D")) {
            System.out.print("You get a Democratic Donkey!!!");
        } else if (Party.equals("R")) {
            System.out.print("You get a Republic Elephant!!!");
        } else if (Party.equals("I")) {
            System.out.print("You get an Independent Person!!!");
        }
        else {
            System.out.print("You get Other!!!");
        }
    }
}
