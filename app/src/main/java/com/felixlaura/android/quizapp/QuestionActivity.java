package com.felixlaura.android.quizapp;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;


public class QuestionActivity extends AppCompatActivity {

    int point = 0;
    String message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question);

    }

    /*
* 
* Question 1
* */
    public void onRadioButtonQuestion1(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question1_b:
                if (checked) {
                    point = point + 1;
                    message = "1. Good Answer!\n";
                }
                break;
            case R.id.question1_a:
            case R.id.question1_c:
            case R.id.question1_d:
                if (checked) {
                    point = point + 0;
                    message = "1. Fail! Correct Answer is: util\n";
                }
                break;
        }
    }


    /*
*
* Question 2
* */
    public void onRadioButtonQuestion2(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        if (view.getId() == R.id.question2_a) {
            if (checked) {
                point = point + 1;
                message = message + "2. Good Answer!\n";
            }
        }
        if (view.getId() == R.id.question2_b) {
            if (checked) {
                point = point + 0;
                message = message + "2. Fail! Correct Answer is: Yes\n";
            }

        }

    }

    /*
    * 
    * Question 3
    * */
    public void onRadioButtonQuestion3(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question3_c:
                if (checked) {
                    point = point + 1;
                    message = message + "3. Good Answer!\n";
                }
                break;
            case R.id.question3_a:
            case R.id.question3_b:
            case R.id.question3_d:
                if (checked) {
                    point = point + 0;
                    message = message + "3. Fail! Correct Answer is: java.io\n";
                }
                break;
        }
    }


    /*
    *
    * Question 4
    * */
    public void onRadioButtonQuestion4(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question4_b:
                if (checked) {
                    point = point + 1;
                    message = message + "4. Good Answer!\n";
                }
                break;
            case R.id.question4_a:
            case R.id.question4_c:
            case R.id.question4_d:
                if (checked) {
                    point = point + 0;
                    message = message + "4. Fail! Correct Answer is: all constructor are method\n";
                }
                break;
        }
    }


    /*
   *
   * Question 5
   * */
    public void onRadioButtonQuestion5(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question5_b:
                if (checked) {
                    point = point + 1;
                    message = message + "5. Good Answer!\n";
                }
                break;
            case R.id.question5_a:
            case R.id.question5_c:
            case R.id.question5_d:
                if (checked) {
                    point = point + 0;
                    message = message + "5. Fail! Correct Answer is: clone()\n";
                }
                break;
        }
    }


    /*
 *
 * Question 6
 * */
    public void onRadioButtonQuestion6(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question6_a:
                if (checked) {
                    point = point + 1;
                    message = message + "6. Good Answer!\n";
                }
                break;
            case R.id.question6_b:
            case R.id.question6_c:
            case R.id.question6_d:
                if (checked) {
                    point = point + 0;
                    message = message + "6. Fail! Correct Answer is: public\n";
                }
                break;
        }
    }


    /*
 *
 * Question 7
 * */
    public void onRadioButtonQuestion7(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question7_c:
                if (checked) {
                    point = point + 1;
                    message = message + "7. Good Answer!\n";
                }
                break;
            case R.id.question7_a:
            case R.id.question7_b:
            case R.id.question7_d:
                if (checked) {
                    point = point + 0;
                    message = message + "7. Fail! Correct Answer is: 17, int\n";
                }
                break;
        }
    }

    /*
 *
 * Question 8
 * */
    public void onRadioButtonQuestion8(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {
            case R.id.question8_b:
                if (checked) {
                    point = point + 1;
                    message = message + "8. Good Answer!\n";
                }
                break;
            case R.id.question8_a:
            case R.id.question8_c:
            case R.id.question8_d:
                if (checked) {
                    point = point + 0;
                    message = message + "8. Fail! Correct Answer is: double\n";
                }
                break;
        }
    }


    public String orderingAnswer() {
        String pointsAndAnswer = "Your score is " + point + " of 8\n";
        pointsAndAnswer += "\nAnswer:\n" + message;

        return pointsAndAnswer;
    }

    public void submitAnswers(View view) {

        Intent myIntent = getIntent();
        String nameValue = myIntent.getStringExtra("NAME_VALUE");

        String greeting = "Hi, " + nameValue;

        TextView textView = findViewById(R.id.textViewDataUser);
        textView.setText(greeting);



        TextView answers = findViewById(R.id.textViewDisplayAnswers);
        answers.setTextColor(Color.parseColor("#1a237e"));
        answers.setText(orderingAnswer());
    }


}