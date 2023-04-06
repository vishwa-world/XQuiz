package com.crio.xquiz;
 
import java.util.*;

public class Quiz{
    private String quizName;
    private List<Question> questions;
    private int finalScore;

    // TODO: Implement Quiz class constructor : public Quiz(String quizName);
        // Validate: If quizName is null or empty, else print “Quiz Name cannot be null or empty!”.
        // Note: The statement to be printed should be exactly same.

    //TODO: Create the getter method : public String getQuizName(), which returns the quizname

    //TODO: Create the getter method :public List<Question> getQuestions(), which returns the questions list

    //TODO: Create the getter method : public int getFinalScore(), which returns the final score

    //TODO: Create addQuestion() method:  public void addQuestion(Question question)
        // Validate: If question is Null, print “Question cannot be null!”.
         // If question is not null then add the question to list of questions



    public void attemptQuiz(){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<questions.size();++i){
            questions.get(i).display();
            int opt = sc.nextInt();
            if(opt<1 || opt>questions.get(i).getChoices().size()){
                System.out.println("Please choose a number between 1 and " + questions.get(i).getChoices().size());
                i--;
            } else if (questions.get(i).checkAnswer(questions.get(i).getChoices().get(opt-1))){
                finalScore++;
            }
        }
        sc.close();
    }
    
    public void revealAnswerKey(){
        // TODO: add loop for printing all the questions along with answers in the questions list.
        {
            System.out.println("Question no. " + (i+1) + " : " + questions.get(i).getQuestionText() +
                    "\nAnswer no. " + (i+1) + " : " + questions.get(i).getAnswer());
        }
    }
 

}

