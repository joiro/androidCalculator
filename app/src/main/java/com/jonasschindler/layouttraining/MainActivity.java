package com.jonasschindler.layouttraining;

import android.app.Activity;
import android.util.Log;
import android.view.View.OnClickListener;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity implements OnClickListener {

    private Button zero, one, two, three, four, five, six, seven, eight, nine, delete, divided, plus, minus, times, equals;
    private TextView resultField, enterField;
    private String enteredNumbers, method;
    private String firstNumber;
    private String secondNumber;
    private String thirdNumber;
    private int first, second, third, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        zero = (Button) findViewById(R.id.button0);
        one = (Button) findViewById(R.id.button1);
        one.setOnClickListener(this);
        two = (Button) findViewById(R.id.button2);
        two.setOnClickListener(this);
        three = (Button) findViewById(R.id.button3);
        three.setOnClickListener(this);
        four = (Button) findViewById(R.id.button4);
        four.setOnClickListener(this);
        five = (Button) findViewById(R.id.button5);
        five.setOnClickListener(this);
        six = (Button) findViewById(R.id.button6);
        six.setOnClickListener(this);
        seven = (Button) findViewById(R.id.button7);
        seven.setOnClickListener(this);
        eight = (Button) findViewById(R.id.button8);
        eight.setOnClickListener(this);
        nine = (Button) findViewById(R.id.button9);
        nine.setOnClickListener(this);
        delete = (Button) findViewById(R.id.buttonDel);
        delete.setOnClickListener(this);
        divided = (Button) findViewById(R.id.buttonDivided);
        divided.setOnClickListener(this);
        times = (Button) findViewById(R.id.buttonTimes);
        times.setOnClickListener(this);
        plus = (Button) findViewById(R.id.buttonPlus);
        plus.setOnClickListener(this);
        minus = (Button) findViewById(R.id.buttonMinus);
        minus.setOnClickListener(this);
        equals = (Button) findViewById(R.id.buttonEquals);
        equals.setOnClickListener(this);
        enterField = (TextView) findViewById(R.id.enterField);
        resultField = (TextView) findViewById(R.id.resultField);

        zero.setOnClickListener(this);

        delete.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                enterField.setText("");
                resultField.setText("");
                return false;
            }
        });


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button0:
                enterField.append("0");
                if (firstNumber == null) {
                    firstNumber = "0";
                }
                else {
                    secondNumber = "0";
                }
                break;
            case R.id.button1:
                enterField.append("1");
                if (firstNumber == null) {
                    firstNumber = "1";
                }
                else {
                    secondNumber = "1";
                }
                break;
            case R.id.button2:
                enterField.append("2");
                if (firstNumber == null) {
                    firstNumber = "2";
                }
                else {
                    secondNumber = "2";
                }
                break;
            case R.id.button3:
                enterField.append("3");
                if (firstNumber == null) {
                    firstNumber = "3";
                }
                else {
                    secondNumber = "3";
                }
                break;
            case R.id.button4:
                enterField.append("4");
                if (firstNumber == null) {
                    firstNumber = "4";
                }
                else {
                    secondNumber = "4";
                }
                break;
            case R.id.button5:
                enterField.append("5");
                if (firstNumber == null) {
                    firstNumber = "5";
                }
                else {
                    secondNumber = "5";
                }
                break;
            case R.id.button6:
                enterField.append("6");
                if (firstNumber == null) {
                    firstNumber = "6";
                }
                else {
                    secondNumber = "6";
                }
                break;
            case R.id.button7:
                enterField.append("7");
                if (firstNumber == null) {
                    firstNumber = "7";
                }
                else {
                    secondNumber = "7";
                }
                break;
            case R.id.button8:
                enterField.append("8");
                if (firstNumber == null) {
                    firstNumber = "8";
                }
                else {
                    secondNumber = "8";
                }
                break;
            case R.id.button9:
                enterField.append("9");
                if (firstNumber == null) {
                    firstNumber = "9";
                }
                else {
                    secondNumber = "9";
                }
                break;
            case R.id.buttonDel:
                enteredNumbers = enterField.getText().toString();
                Log.d("calculator", "enteredNumbers: " + enteredNumbers);
                resultField.setText("");
                if (! enteredNumbers.isEmpty()) {
                    String newEnteredNumbers = enteredNumbers.substring(0, enteredNumbers.length() - 1);
                    enterField.setText(newEnteredNumbers);
                } else {
                    Log.d("calculator", "enteredNumbers is empty!");
                }
                break;
            case R.id.buttonDivided:
                enterField.append("÷");
                method = "divided";
                break;
            case R.id.buttonTimes:
                enterField.append("×");
                method = "times";
                break;
            case R.id.buttonPlus:
                enterField.append("+");
                method = "plus";
                break;
            case R.id.buttonMinus:
                enterField.append("-");
                method = "minus";
                break;
            case R.id.buttonEquals:
                calculate(method);
                break;
        }
    }

    public void calculate(String method) {
        Log.d("calculator", "method: "+method);
        Log.d("calculator", "1.No: "+firstNumber);
        Log.d("calculator", "2.No: "+secondNumber);
        first = Integer.parseInt(firstNumber);
        second = Integer.parseInt(secondNumber);
        Log.d("calculator", "first: "+first);
        Log.d("calculator", "second: "+second);
        if (method == "plus") {
            result = first + second;
        }
        if (method == "minus") {
            result = first - second;
        }
        if (method == "times") {
            result = first * second;
        }
        if (method == "divided") {
            result = first / second;
        }
        Log.d("calculator", "result: "+result);
        resultField.setText(Integer.toString(result));
    }
}