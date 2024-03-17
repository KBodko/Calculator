
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Vitaj v aplikácií Aj Ty v IT Kalkulačka :)");

        Scanner input = new Scanner(System.in);
        Scanner userChoice = new Scanner(System.in);
        String answer;
        int firstNumber;
        int secondNumber;

        for (int i= 1; i<100; i++) {

                while (true) {
                    calculator();
                    answer = input.nextLine();
                    if (isAnswerValid(answer)) {
                        break;
                    }
                    System.out.println("Takáto možnosť nie je. Skús to prosím znova.");
                }

                System.out.println("Zadaj prvé číslo:");
                firstNumber = input.nextInt();
                System.out.println("Zadaj druhé číslo");
                secondNumber = input.nextInt();

                mathOperations(answer, firstNumber, secondNumber);


                while (true) {
                    countAgain();
                    answer = userChoice.nextLine();
                    if (nextValidation(answer)) {
                        break;
                    }
                    System.out.println("Takáto možnosť nie je. Skús to prosím znova.");
                }
                if (answer.equals("nie")) {
                    System.out.println("Tento program sa teraz ukončí.");
                    break;
                }


        }






    }

    public static void mathOperations (String answer, int firstNumber, int secondNumber){
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
    public static boolean nextValidation (String answer){
        return answer.equals("áno") || answer.equals("nie");
    }
    public static void countAgain (){
        System.out.println("Chceš pokračovať v počítaní? ");
        System.out.println("áno");
        System.out.println("nie");
        System.out.println("Zadaj svoju voľbu: ");

    }
    public static double division(int number1, int number2) {
        return (double) number1 / (double) number2;

    }
    public static boolean isAnswerValid(String answer) {
        return answer.equals("a") || answer.equals("b") || answer.equals("c") || answer.equals("d");
    }

    public static void calculator() {
        System.out.println("Zvoľ akú operáciu chceš vykonať:");
        System.out.println("a) sčítanie");
        System.out.println("b) odčítanie");
        System.out.println("c) násobenie");
        System.out.println("d) delenie");
        System.out.println("Zadaj svoju voľbu: ");
    }
}
