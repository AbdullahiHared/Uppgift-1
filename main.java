import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userPoints = 0;
        String sports[] = {"Football", "Qatar", "Golf", "Archery", "Basketball"};
         
        System.out.println("What is the most known sport? ");
        String firstAnswer = sc.nextLine();
        boolean checkFirst = sports[0].equalsIgnoreCase(firstAnswer);
        sc.nextLine();

            
        System.out.println("Where was the last world cup held?");
        String secondAnswer = sc.nextLine();
        boolean checkSecond = sports[1].equalsIgnoreCase(secondAnswer );
        sc.nextLine();
            
        System.out.println("Which sport do women play?");
        String thirdAnswer = sc.nextLine();
        boolean checkThird = sports[2].equalsIgnoreCase(thirdAnswer );
        sc.nextLine();

            
        System.out.println("Which sport are the mongols known for?");
        String fourthAnswer = sc.nextLine();
        boolean checkFourth = sports[3].equalsIgnoreCase(fourthAnswer );
        sc.nextLine();

        System.out.println("My favorite sport?");
        String fifthAnswer  = sc.nextLine();
        boolean checkFifth = sports[4].equalsIgnoreCase(fifthAnswer );
        sc.nextLine();

        
       if (checkFirst) {
        userPoints+= 1;
       } if (checkSecond) {
        userPoints+= 1;
       } if (checkThird) {
        userPoints+=1;
       } if (checkFourth) {
        userPoints+= 1;
       } if (checkFifth) {
        userPoints+=1;
       } 

       System.out.println("Du fick " + userPoints + " poäng " + 5);
    }
}
