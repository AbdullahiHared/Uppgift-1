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

        
        System.out.println("What is 1 + 1");
        System.out.println("34, 3 or 2");
        int add = sc.nextInt();
        boolean additionAnswer = add == 2;






        System.out.println("What is 4-3");
        System.out.println("1, 3 or 2");
        int subtract = sc.nextInt();
        boolean subtractAnswer = subtract == 1;
        sc.nextLine();


        
        System.out.println("When did ww2 end");
        System.out.println("2034, 2023, 1945");
        int war = sc.nextInt();
        boolean ww2 = war == 1945;

        if (additionAnswer) {
            userPoints+=1;
        } else {
            System.out.println("Wrong");
            System.out.println("What is 1 + 1");
            System.out.println("34, 3 or 2");
            add = sc.nextInt();
        }

        if (subtractAnswer) {
            userPoints+=1;
        }  else {
             System.out.println("Wrong");
             System.out.println("What is 4-3");
             System.out.println("1, 3 or 2");
             add = sc.nextInt();
        }

        if (ww2) {
            userPoints+=1;
        } else {
            System.out.println("Wrong");
            System.out.println("When did ww2 end");
            System.out.println("2034, 2023, 1945");
            war = sc.nextInt();
        }

        
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

       System.out.println("Du fick " + userPoints + " poäng " + 8);
    }
}
