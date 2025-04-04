import java.util.Scanner;

public class madLibs {
    public static void main(String[] arg){

        // MAD LIBS GAME

        Scanner scanner = new Scanner(System.in);

        String adjective;
        String noun;
        String adjective2;
        String verb;
        String adjective3;

        System.out.print("Enter an adjective (description): ");
        adjective = scanner.nextLine();
        System.out.print("Enter a noun (animal or person): ");
        noun = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective2 = scanner.nextLine();
        System.out.print("enter a verb and with -ing (action): ");
        verb = scanner.nextLine();
        System.out.print("Enter an adjective (description): ");
        adjective3 = scanner.nextLine();

        System.out.println("\nToday I went to a " +adjective + " zoo ");
        System.out.println("In the exhibit, I saw a " +noun +".");
        System.out.println( noun +" was "+ adjective2 + " and " +verb + "!");
        System.out.println("I was " + adjective3 +"!");

        scanner.close();

    }
}
