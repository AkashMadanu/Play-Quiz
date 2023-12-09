package Projece1;

import java.util.Scanner;

public class QuestionService {
    
    Question[] questions = new Question[5];
Scanner input = new Scanner(System.in);
int score = 0;
    public QuestionService()
    {
        questions[0] = new Question(1,"What is the old name of JAVA","Java","Oak","AVAJ","None","Oak");
        questions[1] = new Question(2,"Size of int","1","4","2","3","4");
        questions[2] = new Question(3,"Java is ___ programming language","OOP's","Structured","Not OOP's","None","OOP's");
        questions[3] = new Question(4,"Java is Created in year","2000","1999","1998","1995","1995");
        questions[4] = new Question(5,"Java is ","Popular","useless","worst","None","Popular");
    }
  
    public void displayQuestions()
    {
        // questions[0] = new Question(1); // this is the object creation
        // System.out.println(questions[0].getQuestion()); // this is the reference
        /*
        for(int i=0;i<5;i++)
        {
            System.out.println(questions[i].getQuestion());
            System.out.println("Enter your Answer");
            System.out.println("- " + questions[i].getOpt1());
            System.out.println("- " + questions[i].getOpt2());
            System.out.println("- " + questions[i].getOpt3());
            System.out.println("- " + questions[i].getOpt4());
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(questions[i].getAnswer())) {
                System.out.println("Correct Answer!");
                score++;
            }else{
                System.out.println("Oops...");
            }

        }
        */

        // datatype variable : array
        for(Question q : questions)
        {
            System.out.println(q.getQuestion());
            System.out.println("Enter your Answer");
            System.out.println("- " + q.getOpt1());
            System.out.println("- " + q.getOpt2());
            System.out.println("- " + q.getOpt3());
            System.out.println("- " + q.getOpt4());
            String answer = input.nextLine();
            if (answer.equalsIgnoreCase(q.getAnswer())) {
                System.out.println("Correct Answer!");
                score++;
            }else{
                System.out.println("Oops...");
            }

        }
     

        System.out.println("Your Score is " + score);
    }
}
