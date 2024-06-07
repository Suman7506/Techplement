import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Question {
    String quest;
    List<String> options;
    int Answer;

    public Question( String  quest , List<String> options , int Answer) {


        this.quest = quest;
        this.options = options;
        this.Answer = Answer;
    }
}


public class QuizGenerator {

    List<Question> questions;
    Scanner scanner;

    public QuizGenerator(){

        this.questions = new ArrayList<>();
        this.scanner =  new Scanner(System.in);

    }


    public void addquiz(){

        System.out.println("Enter the number of questions");
        int num = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0 ; i < num; i++){
            System.out.println("Enter question" + (i+1) + ":");
            String quest = scanner.nextLine();
        

        List <String> options = new ArrayList<>();
        for (int j = 0; j<4; j++){
            System.out.println("Enter option" + (j+1) + ":");
            options.add(scanner.nextLine());


        }

        System.out.println("Enter the corret answer (1-4):");
        int Answer = scanner.nextInt();
        scanner.nextLine();
        questions.add(new Question(quest, options, Answer));

    }
}


public void Quiz(){
    int score = 0;
    for (Question question : questions){
        System.out.println(question.quest);
        for(int i = 0 ;i < question.options.size(); i++){
            System.out.println((i+1) + "." + question.options.get(i));
        }

        System.out.println("Enter your answer (1-4)");
        int userAnswer = scanner.nextInt();
        scanner.nextLine();

        if (userAnswer == question.Answer) {
            score++;
            System.out.println("correct");
        }else {
            System.out.println("Incorrect. The correct answer is " + question.Answer);

            }
        }

            System.out.println("Your final score is " + score + " out of " + questions.size());
            
            if (score == questions.size()) {
                System.out.println("Congratulations! You got a perfect score!");
            } else if (score >= questions.size() * 0.8) {
                System.out.println("Great job! You scored above 80%.");
            } else if (score >= questions.size() * 0.5) {
                System.out.println("You passed! You scored above 50%.");
            } else {
                System.out.println("Better luck next time. You scored below 50%.");
            }
    }

    public static void main(String[] args) {
        QuizGenerator quizGenerator = new QuizGenerator();
        quizGenerator.addquiz();
        quizGenerator.Quiz();
    }
}



