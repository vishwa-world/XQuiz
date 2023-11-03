package com.crio.xquiz;
import java.util.*;

public class Question{
    //TODO: Define the variable to store the question text
    public String questionText;
    //TODO: Define the variable to store the answer text
    private String correctAnswer;
    //TODO: Define the variable to store the list of text choices
    public List<String> choices;
    //

    // TODO: Create the Question class constructor 
    // use the  signature :  public Question(String questionText, List<String> choices, String answer)
    // Include the following validations
        // If QuestionText is null or empty, then print “Question text cannot be null or empty!”
        // If List of Choices is null or EmptyList, then print “Choices cannot be null or empty!”
        // If answer is null or Empty, then print “Answer cannot be null or empty!” 
        // If answer is not one of the choices in the List of choices, then print “Answer is not present among the choices!”
    // Note: The print statements should match exactly with the one specified above, since we have test cases designed on this
    // If the print statements do not match then the tests might fail, so be cautious
    public Question(String questionText, List<String> choices, String answer){
        if (questionText == null || questionText.isEmpty()) {
            System.out.println("Question text cannot be null or empty!");
        }
        if (choices == null || choices.isEmpty()) {
            System.out.println("Choices cannot be null or empty!");
        }
        if (answer == null || answer.isEmpty()) {
            System.out.println("Answer cannot be null or empty!");
        }
        if (!choices.contains(answer)) {
            System.out.println("Answer is not present among the choices!");
        } else {
            this.questionText = questionText;
            this.choices = choices;
            this.correctAnswer = answer;
        }
    }

    //TODO: Create the getter method : public String getAnswer(), which returns the answer
    public String getAnswer(){
        return correctAnswer;
    }

    //TODO: Create the getter method : public String getQuestionText(), which returns the questionText
    public String getQuestionText(){
        return questionText;
    }

    //TODO: Create the getter method : public List<String> getChoices(), which returns the choices
    public List<String> getChoices(){
        return choices;
    }
    //TODO: Create the method checkAnswer() with signature: public boolean checkAnswer(String answer)
        // Under this check If answer is correct. then return True
        // If answer is incorrect, then return False.
        public boolean checkAnswer(String answer){
            return answer.equals(correctAnswer);
        }

public void display(){
    System.out.println(getQuestionText());
    for(int i = 0; i < choices.size(); i++){
        int choiceNumber = i + 1;
        System.out.println(choiceNumber + ":" + choices.get(i));
    }
}

}

