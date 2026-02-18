public class QuestionService {

  Question[] question = new Question[5];

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

  public void displayQuestions() {
    for (Question q : question)
      System.out.println(q);
  }

}
