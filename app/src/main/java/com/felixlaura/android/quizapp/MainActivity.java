package com.felixlaura.android.quizapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textFirstName, textLastName, textEmail, textPhone;
    String sexSelected;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public String orderMessage(){

        textFirstName = findViewById(R.id.editTextFirstName);
        textLastName = findViewById(R.id.editTextLastName);
        textEmail = findViewById(R.id.editTextEmail);
        textPhone = findViewById(R.id.editTextPhone);

        String message="";

            message = "First Name: " + textFirstName.getText();
            message += "\nLast Name: " + textLastName.getText();
            message += "\nEmail: " + textEmail.getText();
            message += "\nPhone: " + textPhone.getText();
            message += "\nSex: " + sexSelected;

            return message;

    }


    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();

        // Check which radio button was clicked
        switch(view.getId()) {
            case R.id.radio_male:
                if (checked)
                    sexSelected ="Male";
                    break;
            case R.id.radio_female:
                if (checked)
                    sexSelected = "Female";
                    break;
        }
    }

    public void submit(View view){
        TextView message = findViewById(R.id.textViewDisplay);
        message.setText(orderMessage());

        Intent intent = new Intent(this, QuestionActivity.class);
        intent.putExtra("NAME_VALUE", textFirstName.getText().toString());
        startActivity(intent);

    }
}
