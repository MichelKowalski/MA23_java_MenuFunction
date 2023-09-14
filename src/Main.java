import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        System.out.println("Vad vill du göra?");
        System.out.println("1. Addera två tal");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng");
        System.out.println("4. Summera alla tal i en sträng");
        System.out.println("5. Avsluta");

        menuSwitch();

    }

    static void menuSwitch() {
        Scanner sc = new Scanner(System.in);
        int pressedNumber = sc.nextInt();
        switch (pressedNumber) {
            case 1:
                System.out.println("Du ska få addera två tal");
                addingTwoNumbers();
                menuAfterAgame();
                break;
            case 2:
                System.out.println("Vi ska räkna bokstäver i en sträng");
                countingLetters();
                menuAfterAgame();
                break;
            case 3:
                System.out.println("Vi ska spegelvända en sträng");
                reversLetters();
                menuAfterAgame();
                break;
            case 4:
                System.out.println("Vi ska summera alla talen i en sträng");
                addingLettersInText();
                menuAfterAgame();
                break;
            case 5:
                System.out.println("Tack och hejdå");
                sc.close();
                break;
            default:
                System.out.println("Välj mellan 1-5");
                break;
        }
    }

    static void addingTwoNumbers() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv in två valfria tal: ");

        double pickedNumber = sc.nextDouble();
        double pickedSecondNumber = sc.nextDouble();
        double result = pickedNumber + pickedSecondNumber;

        System.out.println("Summan på dina tal blir " + result);
    }

    static void countingLetters() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Skriv ett valfritt ord: ");

        String lengthOfWord = sc.nextLine();
        String result = String.valueOf(lengthOfWord.length());

        System.out.println("Antalet bokstäver i ordet är " + result);
    }

    static void reversLetters() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Välj ett ord eller mening :) ");

        String pickedWord = sc.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(pickedWord);
        String reversedText = builder.reverse().toString();

        System.out.println("Det spegelvända ordet blev " + reversedText);
    }

    static void addingLettersInText() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Välj en sträng! ");

        String pickedWords = sc.nextLine();

        StringBuilder builder = new StringBuilder();
        builder.append(pickedWords);
        String summorizeStrings = String.valueOf(pickedWords.toString().length());

        System.out.println("Antalet bokstäver för dina ord blev " + summorizeStrings);
    }

    static void menuAfterAgame() {

        System.out.println("Vad vill du göra?");
        System.out.println("1. Addera två tal");
        System.out.println("2. Räkna bokstäver i en sträng");
        System.out.println("3. Spegelvänd en sträng");
        System.out.println("4. Summera alla tal i en sträng");
        System.out.println("5. Avsluta");

        menuSwitch();

    }
}


