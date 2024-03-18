import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Vitaj v aplikácií Aj Ty v IT Kalkulačka :)");

        do {
            String answer = loadUserChoice();
            Scanner userInputNumbers = new Scanner(System.in);
            System.out.println("Zadaj prvé číslo: ");
            int firstNumber = userInputNumbers.nextInt();
            System.out.println("Zadaj druhé číslo: ");
            int secondNumber = userInputNumbers.nextInt();
            mathOperations(answer, firstNumber, secondNumber);

        } while (wantToCountAgain());

    }

    public static boolean isChoiceValid(String answer) {
        return answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d");
    }
    public static String  loadUserChoice (){
        System.out.println("Zvoľ akú operáciu chceš vykonať:");
        System.out.println("a) sčítanie");
        System.out.println("b) odčítanie");
        System.out.println("c) násobenie");
        System.out.println("d) delenie");
        System.out.println("Zadaj svoju voľbu: ");
        Scanner userChoice = new Scanner(System.in);
        String answer;
            do {
                answer = userChoice.nextLine();
                if (isChoiceValid(answer)) {
                    return answer;
                }
                System.out.println("Takáto možnosť nie je. Skús to ešte raz.");
            } while (true);



    }
    public  static boolean wantToContinueValidation(String answer) {
        return answer.equals("a") || answer.equals("b");
    }
    public static String loadUserAnswer (){
        Scanner userInput = new Scanner(System.in);
        String answer;
            do {
                answer = userInput.nextLine();
                if (wantToContinueValidation (answer)) {
                    return answer;
                }
                System.out.println("Takáto možnosť nie je skús to prosím znova.");
            }while (true);

    }
    public static boolean wantToCountAgain () {
        System.out.println("Chceš pokračovať v počítaní? ");
        System.out.println("a) áno");
        System.out.println("b) nie");
        System.out.println("Zadaj svoju voľbu: ");
        String answer = loadUserAnswer();
            if (answer.equals("b")) {
                System.out.println("Aplikácia kalkulačka sa teraz ukončí.");
                return false;
            }
        return true;
    }

    public static double division(int number1, int number2) {
        return (double) number1 / (double) number2;

    }
    public static void mathOperations (String answer, int firstNumber, int secondNumber) {
        switch (answer) {
            case "a":
                System.out.println("Výsledok sčítania je : " + Integer.sum(firstNumber, secondNumber));
                break;
            case "b":
                System.out.println("Výsledok odčítania je: " + Math.subtractExact(firstNumber, secondNumber));
                break;
            case "c":
                System.out.println("Výsledok násobenia je : " + Math.multiplyExact(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Výsledok delenia je : " + division(firstNumber, secondNumber));
        }
    }

}







