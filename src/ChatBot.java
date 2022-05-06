import java.util.Scanner;

public class ChatBot {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String greetUser = greet();
        System.out.println(greetUser);

        System.out.println("Let's play a little game.");
        System.out.println("I'll see if I can guess your age with a little math trick.");
        System.out.println("Follow along with each prompt.");
        String userAge = guessAge();
        System.out.println(userAge);

        System.out.println("Did you know that I'm a fast counter?");
        System.out.println("Pick a number and watch how fast I count!");
        String countNum = fastCount();
        System.out.println(countNum);

        System.out.println("Now it's time for a programming question!");
        System.out.println("Answer the question I ask and let's see if you've been paying attention.");
        question();
    }

    public static String greet() {
        System.out.println("Hi there! What's your name?");
        scanner.nextLine();
        System.out.println("I'm sorry, can you repeat your name?");
        String username = scanner.nextLine();
        return "Nice to meet you " + username + " ! ";
    }

    public static String guessAge() {
        while (true) {
            System.out.println("Please pick a number between 1 and 9");
            int answer1 = Integer.valueOf(scanner.nextLine());
            if (answer1 < 1 || answer1 > 9) {
                System.out.println("Number not in range!");
                continue;
            }
            System.out.println("Multiply your number by 2.");
            scanner.nextLine();
            System.out.println("Add 5.");
            scanner.nextLine();
            System.out.println("Multiply by 50.");
            scanner.nextLine();
            System.out.println("Add 1772.");
            scanner.nextLine();
            System.out.println("Subtract the number with the year you were born.");
            scanner.nextLine();
            System.out.println("Subtract 1 if you haven't had your birthday yet this year.");
            System.out.println("Otherwise, input the last two values of your number.");
            int age = Integer.valueOf(scanner.nextLine());
            return "Your age is " + age;
        }
    }
    public static String fastCount() {
        int num = Integer.valueOf(scanner.nextLine());
        if (num > 0) {
            for (int i = 0; i <= num; i++) {
                System.out.println(i);
            }
        } else {
            for (int i = 0; i >= num; i--) {
                System.out.println(i);
            }
        }
        return "I'm fast as hecc boiiiiii.";
    }
    public static void question() {
        boolean correctAnswer = false;
        String s = System.lineSeparator();
        while (correctAnswer == false) {
            System.out.println("Where do comments fit in the discipline of clean code?" + s + 
            "A. They should be included in most areas to give greater clarification and explanation on everything" + s + 
            "B. They are used sparingly because your code should be written to be clean, expressive, and self-explanatory" + s + 
            "C. They should only be used on variables to explain what they are" + s + 
            "D. They should never be used because it clutters up the codespace");
            String answer = scanner.nextLine();
            if (answer.equalsIgnoreCase("B")) {
                correctAnswer = true;
                System.out.println("Correct! Keep up the good work!");;
            } else {
                System.out.println("Try again!");;
            }
        }
    }
    
}