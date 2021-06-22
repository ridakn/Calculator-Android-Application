package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    private String removeTrailingZero(String formattingInput){
        if(!formattingInput.contains(".")){
            return formattingInput;
        }
        int dotPosition = formattingInput.indexOf(".");
        String newValue = formattingInput.substring(dotPosition, formattingInput.length());
        if(newValue.equals(".0")){
            return formattingInput.substring(0, dotPosition);
        }
        return formattingInput;
    }

    Button one, two, three, four, five, six, seven, eight, nine, zero;
    Button add, sub, mul, div, equal, dot, ac, percent, plusminus;

    EditText cEditText;
    TextView textView;

    float mValueOne, mValueTwo, temp, m, total;

    boolean addition, subtract, multiplication, division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        one = (Button) findViewById(R.id.one);
        two = (Button) findViewById(R.id.two);
        three = (Button) findViewById(R.id.three);
        four = (Button) findViewById(R.id.four);
        five = (Button) findViewById(R.id.five);
        six = (Button) findViewById(R.id.six);
        seven = (Button) findViewById(R.id.seven);
        eight = (Button) findViewById(R.id.eight);
        nine = (Button) findViewById(R.id.nine);
        zero = (Button) findViewById(R.id.zero);
        add = (Button) findViewById(R.id.add);
        sub = (Button) findViewById(R.id.sub);
        mul = (Button) findViewById(R.id.mul);
        div = (Button) findViewById(R.id.div);
        percent = (Button) findViewById(R.id.percent);
        plusminus = (Button) findViewById(R.id.plusminus);
        equal = (Button) findViewById(R.id.equal);
        dot = (Button) findViewById(R.id.dot);
        ac = (Button) findViewById(R.id.ac);
        cEditText = (EditText) findViewById(R.id.edt1);
        textView = (TextView) findViewById(R.id.textView1);

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "1";
                cEditText.setText(n);
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "2";
                cEditText.setText(n);
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "3";
                cEditText.setText(n);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "4";
                cEditText.setText(n);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "5";
                cEditText.setText(n);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "6";
                cEditText.setText(n);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "7";
                cEditText.setText(n);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "8";
                cEditText.setText(n);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "9";
                cEditText.setText(n);
            }
        });

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String n = cEditText.getText() + "0";
                cEditText.setText(n);
            }
        });



        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if(!addition && !subtract && !multiplication && !division) {
                    String t = cEditText.getText().toString();
                    if(t.matches("")|| t.contentEquals(".")) { mValueOne = 0; }
                    else {mValueOne = Float.parseFloat( t + "");}
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(addition) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne += temp;
                    String p = mValueOne + "";
                    String result = removeTrailingZero(p);
                    textView.setText(result);

                }

                if(subtract) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne -= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    subtract = false;
                }

                if(multiplication) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne *= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    multiplication = false;
                }

                if(division) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne /= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    division = false;
                }

                cEditText.setText(null);
                addition = true;

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!subtract && !addition && !multiplication && !division) {
                    String t = cEditText.getText().toString();
                    if(t.matches("")|| t.contentEquals(".")) { mValueOne = 0; }
                    else {mValueOne = Float.parseFloat( t + "");}
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(subtract) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne -= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(addition) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne += temp;
                    String p = mValueOne + "";
                    String result = removeTrailingZero(p);
                    textView.setText(result);
                    addition = false;
                }

                if(multiplication) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne *= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    multiplication = false;
                }

                if(division) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne /= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    division = false;
                }

                subtract = true;
                cEditText.setText(null);
            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!multiplication && !addition && !subtract && !division) {
                    String t = cEditText.getText().toString();
                    if(t.matches("")|| t.contentEquals(".")) { mValueOne = 0; }
                    else {mValueOne = Float.parseFloat( t + "");}
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(multiplication) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne *= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(addition) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne += temp;
                    String p = mValueOne + "";
                    String result = removeTrailingZero(p);
                    textView.setText(result);
                    addition = false;
                }

                if(subtract) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne -= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    subtract = false;
                }

                if(division) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne /= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    division = false;
                }

                multiplication = true;
                cEditText.setText(null);
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(!division && !addition && !subtract && !multiplication) {
                    String t = cEditText.getText().toString();
                    if(t.matches("")|| t.contentEquals(".")) { mValueOne = 0; }
                    else {mValueOne = Float.parseFloat( t + "");}
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(division) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne /= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                }

                if(addition) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne += temp;
                    String p = mValueOne + "";
                    String result = removeTrailingZero(p);
                    textView.setText(result);
                    addition = false;
                }

                if(subtract) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne -= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    subtract = false;
                }

                if(multiplication) {
                    temp = Float.parseFloat(cEditText.getText() + "");
                    mValueOne *= temp;
                    String s = mValueOne + "";
                    String result = removeTrailingZero(s);
                    textView.setText(result);
                    multiplication = false;
                }
                
                division = true;
                cEditText.setText(null);
            }
        });

        percent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = cEditText.getText().toString();
                if(t.matches("")|| t.contentEquals(".")) { mValueOne = 0; }
                else {mValueOne = Float.parseFloat( t + "");}
                float m = mValueOne / 100;
                String s = m + "";
                String result = removeTrailingZero(s);
                cEditText.setText(result);
            }
        });

        plusminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = cEditText.getText().toString();
                if(t.matches("")|| t.contentEquals(".")) { mValueOne = 0; }
                else {mValueOne = Float.parseFloat( t + "");}

                if(mValueOne > 0) {
                    float m = -mValueOne;
                    String s = m + "";
                    String result = removeTrailingZero(s);
                    cEditText.setText(result);
                }
                else {
                    float m = mValueOne;
                    String s = m + "";
                    String result = removeTrailingZero(s);
                    cEditText.setText(result);
                }
            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String t = cEditText.getText().toString();
                if(t.matches("") || t.contentEquals(".")) { mValueTwo = 0; }
                else {mValueTwo = Float.parseFloat( t + "");}

                if (addition) {

                    m = mValueOne + mValueTwo;
                    String s = m + "";
                    String result = removeTrailingZero(s);
                    cEditText.setText(result);
                    addition = false;
                }

                if (subtract) {
                    m = mValueOne - mValueTwo;
                    String s = m + "";
                    String result = removeTrailingZero(s);
                    cEditText.setText(result);
                    subtract = false;
                }

                if (multiplication) {
                    m = mValueOne * mValueTwo;
                    String s = m + "";
                    String result = removeTrailingZero(s);
                    cEditText.setText(result);
                    multiplication = false;
                }

                if (division) {
                    m = mValueOne / mValueTwo;
                    String s = m + "";
                    String result = removeTrailingZero(s);
                    cEditText.setText(result);
                    division = false;
                }

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cEditText.setText("");
                textView.setText(null);
                temp = 0;
                mValueOne = 0;
                addition = false;
                subtract = false;
                multiplication = false;
                division = false;

            }
        });

        dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String g = cEditText.getText() + ".";
                cEditText.setText(g);
            }
        });


    }
}


