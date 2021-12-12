package com.josullivan.basicshapesofgeometryteachersedition;

import android.graphics.Color;
import android.util.TypedValue;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class QuestionManager {

    private TextView correctText, incorrectText1, incorrectText2, reportTest, someText;
    private Button correctButton, incorrectButton1, incorrectButton2, textFieldSubmitButton, tableBtn;
    private EditText answerTest;


    public QuestionManager(TextView correctText, TextView incorrectText1, TextView incorrectText2, Button correctButton, Button incorrectButton1, Button incorrectButton2) {
        this.correctText = correctText;
        this.incorrectText1 = incorrectText1;
        this.incorrectText2 = incorrectText2;
        this.correctButton = correctButton;
        this.incorrectButton1 = incorrectButton1;
        this.incorrectButton2 = incorrectButton2;
    }

    public QuestionManager(EditText answerTest, TextView reportTest, Button textFieldSubmitButton) {

        this.answerTest = answerTest;
        this.reportTest=reportTest;
        this.textFieldSubmitButton=textFieldSubmitButton;

    }

    public QuestionManager(TextView resultText, Button buttonClicked1, Button buttonClicked2) {

        this.reportTest = resultText;
        this.correctButton = buttonClicked1;
        this.incorrectButton1 = buttonClicked2;

    }

    public QuestionManager(Button buttonClicked, TextView someText) {
        this.someText = someText;
        this.tableBtn = buttonClicked;
    }

    public void correctAnswer() {
        String correctAddOn = " Correct!";
        correctText.append(correctAddOn);
        correctText.setTextColor(Color.GREEN);
        incorrectText1.setTextColor(Color.GRAY);
        incorrectText2.setTextColor(Color.GRAY);
        correctButton.setEnabled(false);
        incorrectButton1.setEnabled(false);
        incorrectButton2.setEnabled(false);
    }

    public void incorrectAnswer(Button incorrectButton1, TextView incorrectText1) {

        String addOn = " Incorrect!";

        incorrectText1.append(addOn);
        incorrectText1.setTextColor(Color.RED);
        incorrectButton1.setEnabled(false);

    }

    public void checkTextfieldAnswer(Float givenAnswerTest, Float answer, TextView reportTest, Button textFieldSubmitButton) {


        Boolean checking = (givenAnswerTest.equals(answer));
        if ((checking == true )){
            reportTest.setText("Correct!");
            reportTest.setTextColor(Color.GREEN);
            reportTest.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            textFieldSubmitButton.setEnabled(false);
        } else {
            reportTest.setText("Incorrect!");
            reportTest.setTextColor(Color.RED);
            reportTest.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        }
    }

    public void checkTextfieldRangeAnswer(float givenAnswerTest, float answer, TextView reportTest, Button textFieldSubmitButton) {
        float rangeLimitCheck = givenAnswerTest - answer;
        if (rangeLimitCheck <= 0.1f && rangeLimitCheck >= -0.1f){
            reportTest.setText("Correct!");
            reportTest.setTextColor(Color.GREEN);
            reportTest.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            textFieldSubmitButton.setEnabled(false);
        } else {
            reportTest.setText("Incorrect!");
            reportTest.setTextColor(Color.RED);
            reportTest.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        }
    }

    public void correctButtonClicked(TextView resultTextView, Button buttonClicked) {
        resultTextView.setText("Correct!");
        resultTextView.setTextColor(Color.GREEN);
        resultTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        buttonClicked.setEnabled(false);
    }

    public void correctTFButtonClicked(TextView resultTextView, Button correctButton, Button incorrectButton) {
        resultTextView.setText("Correct!");
        resultTextView.setTextColor(Color.GREEN);
        correctButton.setEnabled(false);
        incorrectButton.setEnabled(false);
        incorrectButton.setTextColor(Color.BLACK);
    }

    public void wrongButtonClicked(TextView resultTextView, Button buttonClicked) {
        resultTextView.setText("Incorrect!");
        resultTextView.setTextColor(Color.RED);
        buttonClicked.setEnabled(false);
        buttonClicked.setTextColor(Color.BLACK);
    }

    public void textfieldString(EditText answerGiven, String actualAnswer, TextView resultView, Button buttonClicked) {
        if (answerGiven.getText().toString().length() >0) {
            String actualAnswerHolder = actualAnswer.toLowerCase();
            String givenAnswerHolder = answerGiven.getText().toString().toLowerCase().trim();
            if (actualAnswerHolder.equals(givenAnswerHolder)) {
                resultView.setText("Correct!");
                resultView.setTextColor(Color.GREEN);
                resultView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
                buttonClicked.setEnabled(false);
            } else {
                resultView.setText("Incorrect! Check your spelling!");
                resultView.setTextColor(Color.RED);
                resultView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
            }
        } else {
            resultView.setText("Please enter your answer!");
            resultView.setTextColor(Color.RED);
            resultView.setTextSize(TypedValue.COMPLEX_UNIT_SP, 18);
        }

    }

}
