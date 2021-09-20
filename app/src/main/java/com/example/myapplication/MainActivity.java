package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    int num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToAddition(View view) {
        EditText n1 = (EditText) findViewById(R.id.intOne);
        String textOne = n1.getText().toString();
        int num1 = new Integer(textOne).intValue();

        EditText n2 = (EditText) findViewById(R.id.intTwo);
        String textTwo = n2.getText().toString();
        int num2 = new Integer(textTwo).intValue();

        num3 = num1 + num2;
        displayOutput(num3);
    }

    public void goToSubtraction(View view) {
        EditText n1 = (EditText) findViewById(R.id.intOne);
        String textOne = n1.getText().toString();
        int num1 = new Integer(textOne).intValue();

        EditText n2 = (EditText) findViewById(R.id.intTwo);
        String textTwo = n2.getText().toString();
        int num2 = new Integer(textTwo).intValue();

        num3 = num1 - num2;
        displayOutput(num3);
    }

    public void goToMultiplication(View view) {
        EditText n1 = (EditText) findViewById(R.id.intOne);
        String textOne = n1.getText().toString();
        int num1 = new Integer(textOne).intValue();

        EditText n2 = (EditText) findViewById(R.id.intTwo);
        String textTwo = n2.getText().toString();
        int num2 = new Integer(textTwo).intValue();

        num3 = num1 * num2;
        displayOutput(num3);
    }

    public void goToDivision(View view) {
        EditText n1 = (EditText) findViewById(R.id.intOne);
        String textOne = n1.getText().toString();
        int num1 = new Integer(textOne).intValue();

        EditText n2 = (EditText) findViewById(R.id.intTwo);
        String textTwo = n2.getText().toString();
        int num2 = new Integer(textTwo).intValue();

        num3 = num1 / num2;
        displayOutput(num3);
    }

    public void displayOutput(int i){
        Integer num = (Integer) i;
        String str = num.toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", str);
        startActivity(intent);
    }
}