import java.util.*;

public class QuestionService {

  Question[] question = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {
    question[0] = new Question(1, "size of int", "2", "4", "6", "8", "4");
    question[1] = new Question(2,
        "Which keyword is used to inherit a class?",
        "implement",
        "extends",
        "inherits",
        "super",
        "2");

    question[2] = new Question(3,
        "Which method is the entry point of Java program?",
        "start()",
        "main()",
        "run()",
        "init()",
        "2");

    question[3] = new Question(4,
        "Which package contains Scanner class?",
        "java.io",
        "java.util",
        "java.lang",
        "java.net",
        "2");

    question[4] = new Question(5,
        "Which data type is used to store true or false?",
        "int",
        "boolean",
        "char",
        "double",
        "2");

  }

  public void playQuiz() {
    int i = 0;
    for (Question q : question) {
      System.out.println("Question no." + q.getId());
      System.out.println(q.getQuestion());
      System.out.println(q.getOpt1());
      System.out.println(q.getOpt2());
      System.out.println(q.getOpt3());
      System.out.println(q.getOpt4());
      Scanner sc = new Scanner(System.in);
      selection[i++] = sc.nextLine();
    }
    System.out.println("The User Selected answers are: ");
    for (String s : selection) {
      System.out.println(s);
    }

  }

  public void printScore() {
    int score = 0;

    for (int i = 0; i < question.length; i++) {
      Question que = question[i];
      String actualAnswer = que.getAns();
      String userAnswer = selection[i];

      if (actualAnswer.equals(userAnswer))
        score++;

    }
    System.out.println("Your score is: " + score);
  }

}
