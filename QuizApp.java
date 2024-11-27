import java.util.Scanner;

public class QuizApp {

    static String[][] questions = new String[10][5];
    static String[][] answers = new String[10][2];
    static String[][] userAnswers = new String[10][1];
    static int score = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Quiz Application!");
        boolean playAgain;
        
        do {
            playAgain = false;
            // Populate questions and answers
            populateQuestionsAndAnswers();

            System.out.print("Enter your name: ");
            String name = scanner.nextLine();

            System.out.println("\nHello " + name + "! Let's start the quiz.\n");

            score = 0; // Reset score for each play

            for (int i = 0; i < 10; i++) {
                System.out.println("Question " + (i + 1) + ": " + questions[i][0]);
                System.out.println("1. " + questions[i][1]);
                System.out.println("2. " + questions[i][2]);
                System.out.println("3. " + questions[i][3]);
                System.out.println("4. " + questions[i][4]);
                System.out.print("Enter your choice (1-4): ");

                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                if (choice >= 1 && choice <= 4) {
                    userAnswers[i][0] = questions[i][choice];
                } else {
                    System.out.println("Invalid choice. No answer recorded for this question.");
                    userAnswers[i][0] = "";
                }
            }

            // Calculate score
            for (int i = 0; i < 10; i++) {
                if (userAnswers[i][0].equals(answers[i][1])) {
                    score += 10;
                }
            }

            System.out.println("\nThank you for playing, " + name + "!");
            System.out.println("Your score is: " + score + " out of 100.");

            // Play again option
            System.out.print("\nDo you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();
            if (response.equals("yes")) {
                playAgain = true;
            }

        } while (playAgain);

        System.out.println("\nThank you for using the Quiz Application!");
        scanner.close();
    }

    static void populateQuestionsAndAnswers() {
        // Computer Networks questions
        questions[0][0] = "Which protocol is used to send an email?";
        questions[0][1] = "HTTP";
        questions[0][2] = "SMTP";
        questions[0][3] = "FTP";
        questions[0][4] = "POP3";
        answers[0][1] = "SMTP";

        questions[1][0] = "What is the full form of IP?";
        questions[1][1] = "Internet Protocol";
        questions[1][2] = "Internal Program";
        questions[1][3] = "Internet Process";
        questions[1][4] = "Interface Program";
        answers[1][1] = "Internet Protocol";

        questions[2][0] = "Which layer in the OSI model is responsible for routing?";
        questions[2][1] = "Transport Layer";
        questions[2][2] = "Network Layer";
        questions[2][3] = "Session Layer";
        questions[2][4] = "Data Link Layer";
        answers[2][1] = "Network Layer";

        // Operating Systems questions
        questions[3][0] = "What is the main purpose of an operating system?";
        questions[3][1] = "Manage computer resources";
        questions[3][2] = "Run applications";
        questions[3][3] = "Perform computations";
        questions[3][4] = "Debug code";
        answers[3][1] = "Manage computer resources";

        questions[4][0] = "Which of the following is not an operating system?";
        questions[4][1] = "Linux";
        questions[4][2] = "MacOS";
        questions[4][3] = "Windows";
        questions[4][4] = "Oracle";
        answers[4][1] = "Oracle";

        questions[5][0] = "What is the scheduling policy in round-robin scheduling?";
        questions[5][1] = "Priority-based";
        questions[5][2] = "Time-sharing";
        questions[5][3] = "First-come-first-serve";
        questions[5][4] = "Shortest job first";
        answers[5][1] = "Time-sharing";

        // OOPs questions
        questions[6][0] = "Which OOP principle focuses on hiding implementation details?";
        questions[6][1] = "Inheritance";
        questions[6][2] = "Encapsulation";
        questions[6][3] = "Polymorphism";
        questions[6][4] = "Abstraction";
        answers[6][1] = "Encapsulation";

        questions[7][0] = "Which of the following is a blueprint for creating objects in OOP?";
        questions[7][1] = "Object";
        questions[7][2] = "Class";
        questions[7][3] = "Method";
        questions[7][4] = "Interface";
        answers[7][1] = "Class";

        questions[8][0] = "Which keyword is used to inherit a class in Java?";
        questions[8][1] = "implement";
        questions[8][2] = "extends";
        questions[8][3] = "inherits";
        questions[8][4] = "override";
        answers[8][1] = "extends";

        questions[9][0] = "Which type of polymorphism is supported by method overloading in Java?";
        questions[9][1] = "Runtime Polymorphism";
        questions[9][2] = "Compile-time Polymorphism";
        questions[9][3] = "Static Polymorphism";
        questions[9][4] = "Dynamic Polymorphism";
        answers[9][1] = "Compile-time Polymorphism";
    }
}
