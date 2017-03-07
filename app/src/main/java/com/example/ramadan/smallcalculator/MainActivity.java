package com.example.ramadan.smallcalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    String sign=" ";
    public    double firstNumber ;
    String dott=" ";
    String total=" ";
    int indexOf;
    public  double secondNumber;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b0= (Button) findViewById(R.id.button0);
        Button b1= (Button) findViewById(R.id.button1);
        Button b2= (Button) findViewById(R.id.button2);
        Button b3= (Button) findViewById(R.id.button3);
        Button b4= (Button) findViewById(R.id.button4);
        Button b5= (Button) findViewById(R.id.button5);
        Button b6= (Button) findViewById(R.id.button6);
        Button b7= (Button) findViewById(R.id.button7);
        Button b8= (Button) findViewById(R.id.button8);
        Button b9= (Button) findViewById(R.id.button9);
        Button bequl= (Button) findViewById(R.id.buttonequal);
        Button bclear= (Button) findViewById(R.id.buttonclear);
        Button badd= (Button) findViewById(R.id.buttonadd);
        Button bsub= (Button) findViewById(R.id.buttonsub);
        Button bdiv= (Button) findViewById(R.id.buttondivide);
        Button bmul= (Button) findViewById(R.id.buttonmul);
        final Button bdot= (Button) findViewById(R.id.buttondot);
        Button bpower= (Button) findViewById(R.id.bpower);
        Button bfact= (Button) findViewById(R.id.bfact);
        Button bBye= (Button) findViewById(R.id.bBye);
        Button be= (Button) findViewById(R.id.be);


        final TextView result= (TextView) findViewById(R.id.textView);
      bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dott=".";
                result.append(dott);
            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                result.append("0");


            }
        });


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("1");
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("2");
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("5");
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.append("8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                result.append("9");
            }
        });


        bclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                result.setText(" ");
            }
        });
        badd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString().equals(" "))
                {
                    sign="+";
                    result.append(sign);

                }

                else if (result.getText().toString().equals(" +"))
                {
                    sign="+";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" ++"))
                {
                    sign="+";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" +++"))
                {
                    sign="+";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ++++"))
                {
                    sign="+";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" +++++"))
                {
                    sign="+";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ++++++"))
                {
                    sign="+";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" +++++++"))
                {
                    sign="+";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ++++++++"))
                {
                    sign="+";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" +++++++++"))
                {
                    sign="+";
                    result.append(sign);
                }
                else {
                    firstNumber = Double.parseDouble(result.getText().toString());
                    sign = "+";
                    result.append(sign);
                }

            }
        });

        bsub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString().equals(" "))
                {
                    sign="-";
                    result.append(sign);

                }
                else if (result.getText().toString().equals(" -"))
                {
                    sign="-";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" --"))
                {
                    sign="-";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ---"))
                {
                    sign="-";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ----"))
                {
                    sign="-";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" -----"))
                {
                    sign="-";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ------"))
                {
                    sign="-";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" -------"))
                {
                    sign="-";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" --------"))
                {
                    sign="-";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ---------"))
                {
                    sign="-";
                    result.append(sign);
                }
              else {
                    firstNumber = Double.parseDouble(result.getText().toString());
                    sign = "-";
                    result.append(sign);
                }
            }
        });
        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString().equals(" "))
                {
                    sign="*";
                    result.append(sign);

                }
                else if (result.getText().toString().equals(" *"))
                {
                    sign="*";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" **"))
                {
                    sign="*";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ***"))
                {
                    sign="*";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ****"))
                {
                    sign="*";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" *****"))
                {
                    sign="*";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ******"))
                {
                    sign="*";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" *******"))
                {
                    sign="*";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ********"))
                {
                    sign="*";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" *********"))
                {
                    sign="*";
                    result.append(sign);
                }
              else {
                    firstNumber = Double.parseDouble(result.getText().toString());
                    sign = "*";
                    result.append(sign);
                }
            }
        });
        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (result.getText().toString().equals(" "))
                {
                    sign="/";
                    result.append(sign);

                }
                else if (result.getText().toString().equals(" /"))
                {
                    sign="/";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" //"))
                {
                    sign="/";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ///"))
                {
                    sign="/";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ////"))
                {
                    sign="/";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" /////"))
                {
                    sign="/";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" //////"))
                {
                    sign="/";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" ///////"))
                {
                    sign="/";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ////////"))
                {
                    sign="/";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" /////////"))
                {
                    sign="/";
                    result.append(sign);
                }
             else {
                    firstNumber = Double.parseDouble(result.getText().toString());
                    sign = "/";
                    result.append(sign);
                }
            }
        });

        bpower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString().equals(" "))
                {
                    sign="^";
                    result.append(sign);

                }
                else if (result.getText().toString().equals(" ^"))
                {
                    sign="^";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" ^^"))
                {
                    sign="^";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ^^^"))
                {
                    sign="^";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ^^^^"))
                {
                    sign="^";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ^^^^^"))
                {
                    sign="^";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ^^^^^^"))
                {
                    sign="^";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" ^^^^^^^"))
                {
                    sign="^";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ^^^^^^^^"))
                {
                    sign="^";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ^^^^^^^^^"))
                {
                    sign="^";
                    result.append(sign);
                }
              else {

                    firstNumber = Double.parseDouble(result.getText().toString());

                    sign = "^";
                    result.append(sign);
                }


            }
        });
        bfact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (result.getText().toString().equals(" "))
                {
                    sign="!";
                    result.append(sign);

                }
                else if (result.getText().toString().equals(" !"))
                {
                    sign="!";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" !!"))
                {
                    sign="!";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" !!!"))
                {
                    sign="!";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" !!!!"))
                {
                    sign="!";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" !!!!!"))
                {
                    sign="!";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" !!!!!!"))
                {
                    sign="!";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" !!!!!!!"))
                {
                    sign="!";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" !!!!!!!!"))
                {
                    sign="!";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" !!!!!!!!!"))
                {
                    sign="!";
                    result.append(sign);
                }

              else {
                    firstNumber = Double.parseDouble(result.getText().toString());

                    sign = "!";
                    result.append(sign);
                }

            }
        });

        bBye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("3.14");
            }
        });

        be.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                result.append("2.7");

            }
        });




        bequl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sign=="+") {
                    total =result.getText().toString();
                     indexOf=total.indexOf("+");
                    secondNumber=Double.parseDouble(total.substring((indexOf+1)));
                    result.setText(Double.toString(firstNumber + secondNumber));
                }
                else if(sign=="-")
                {
                    total =result.getText().toString();

                    indexOf=total.indexOf("-");
                    secondNumber=Double.parseDouble(total.substring((indexOf+1)));



                    result.setText(Double.toString(firstNumber - secondNumber));
                }
                else if (sign=="*")
                {

                    total =result.getText().toString();

                    indexOf=total.indexOf("*");
                    secondNumber=Double.parseDouble(total.substring((indexOf+1)));
                    result.setText(Double.toString(firstNumber * secondNumber));
                }

                else if(sign=="/")
                {
                    total =result.getText().toString();

                    indexOf=total.indexOf("/");
                    secondNumber=Double.parseDouble(total.substring((indexOf+1)));

                    if(secondNumber==0)
                    {
                        result.setText("Couldn't divide by zero");
                    }
                   else {
                        result.setText(Double.toString(firstNumber / secondNumber));
                    }
                }
                else if(sign=="^")
                {
                    total =result.getText().toString();

                    indexOf=total.indexOf("^");
                    double f=1;
                    secondNumber=Double.parseDouble(total.substring((indexOf+1)));
                    for(int i=1;i<=secondNumber;i++)
                    {
                        f*=firstNumber;
                    }
                    result.setText(Double.toString(f));

                }
                else if(sign=="!")
                {
                  double f=1;
                    double n=firstNumber;
                    for(int i=1;i<=firstNumber;i++)
                    {
                        f*=n;
                        n--;
                    }
                    result.setText(Double.toString(f));
                }
                else if(result.getText().toString().equals(" "))
                {
                    sign="=";
                    result.append("=");
                }
                else if (result.getText().toString().equals(" ="))
                {
                    sign="=";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" =="))
                {
                    sign="=";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ==="))
                {
                    sign="=";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ===="))
                {
                    sign="=";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ====="))
                {
                    sign="=";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ======"))
                {
                    sign="=";
                    result.append(sign);
                }
                else if (result.getText().toString().equals(" ======="))
                {
                    sign="=";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ========"))
                {
                    sign="=";
                    result.append(sign);
                }  else if (result.getText().toString().equals(" ========="))
                {
                    sign="=";
                    result.append(sign);
                }

            }
        });
    }
}
