import java.util.*;
public class Daniel_Quizz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        class 



    Question {
    String category;
    String questionText;
    String[] options;
    char correctAnswer;
    Question(String category, String questionText, String[] options, char correctAnswer) {
        this.category = category;
        this.questionText = questionText;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    void displayQuestion() {
        System.out.println("Category: " + category);
        System.out.println(questionText);
        for (String opt : options) {
            System.out.println(opt);
        }
        System.out.print("Your answer: ");
    }
}


        // Create a list of questions
        ArrayList<Question> questions = new ArrayList<>(Arrays.asList(
            new Question("Science", "What planet is known as the Red Planet?",
                new String[]{"A) Earth", "B) Mars", "C) Jupiter", "D) Saturn"}, 'B'),
            new Question("History", "Who was the first president of the USA?",
                new String[]{"A) George Washington", "B) Abraham Lincoln", "C) John Adams", "D) Thomas Jefferson"}, 'A'),
            new Question("Math", "What is 12 x 8?", 
                new String[]{"A) 96", "B) 86", "C) 108", "D) 98"}, 'A'),
            new Question("Sports", "How many players are on a soccer field per team?", 
                new String[]{"A) 9", "B) 10", "C) 11", "D) 12"}, 'C'),
            new Question("Geography", "What is the capital of France?", 
                new String[]{"A) London", "B) Paris", "C) Madrid", "D) Rome"}, 'B'),
            new Question("Computers", "What does 'CPU' stand for?", 
                new String[]{"A) Central Process Unit", "B) Central Processing Unit", "C) Computer Personal Unit", "D) Control Processing Unit"}, 'B'),
            new Question("Music", "Who is known as the King of Pop?", 
                new String[]{"A) Prince", "B) Michael Jackson", "C) Elvis Presley", "D) Justin Bieber"}, 'B'),
            new Question("Science", "Water boils at what temperature (Celsius)?", 
                new String[]{"A) 90", "B) 100", "C) 110", "D) 120"}, 'B'),
            new Question("Movies", "What movie features the quote 'I'll be back'?", 
                new String[]{"A) Terminator", "B) Predator", "C) Rambo", "D) Die Hard"}, 'A'),
            new Question("True/False", "The sun is a star. (A) True (B) False", 
                new String[]{}, 'A')
        ));


        int score = 0;
        int questionNumber = 1;

        System.out.println("Quiz Game!");
        System.out.println("You will get 10 questions!\n");

        for (Question q : questions) {
            System.out.println("Question " + questionNumber + ":");
            q.displayQuestion();

            char answer;
            while (true) {
                String input1 = input.nextLine();
                if (input1.length() == 1 && input1.charAt(0) >= 'A' && input1.charAt(0) <= 'D') {
                    answer = input1.charAt(0);
                    break;
                } else {
                    System.out.print("Invalid input! Please enter A, B, C, or D: ");
                }
            }

            if (answer == q.correctAnswer) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + q.correctAnswer + ".\n");
            }

            questionNumber++;
        }

        System.out.println("Quiz complete!");
        System.out.println("Your final score: " + score + "/" + questions.size());
    }
}


