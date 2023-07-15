package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity {
TextView btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnM,btnA,btnS,btnD,result,show,show2;
ImageView btnC;
String total="",eqn="",showoff="";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0=findViewById(R.id.btn0);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);
        btn4=findViewById(R.id.btn4);
        btn5=findViewById(R.id.btn5);
        btn6=findViewById(R.id.btn6);
        btn7=findViewById(R.id.btn7);
        btn8=findViewById(R.id.btn8);
        btn9=findViewById(R.id.btn9);
        btnA=findViewById(R.id.btnA);
        btnM=findViewById(R.id.btnM);
        btnD=findViewById(R.id.btnD);
        btnS=findViewById(R.id.btnS);
        btnC=findViewById(R.id.btnC);
        result=findViewById(R.id.result);
        show=findViewById(R.id.show);
        show2=findViewById(R.id.show2);
        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"0";
                    eqn=total;
                    showoff=showoff+"0";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"1";
                    eqn=total;
                    showoff=showoff+"1";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"2";
                    eqn=total;
                    showoff=showoff+"2";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"3";
                    eqn=total;
                    showoff=showoff+"3";
                    show.setText(showoff);
                    check(eqn);
                }

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"4";
                    eqn=total;
                    showoff=showoff+"4";
                    show.setText(showoff);
                    check(eqn);
                }

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"5";
                    eqn=total;
                    showoff=showoff+"5";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"6";
                    eqn=total;
                    showoff=showoff+"6";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+7;
                    eqn=total;
                    showoff=showoff+"7";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"8";
                    eqn=total;
                    showoff=showoff+"8";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()<=24)
                {
                    total=total+"9";
                    eqn=total;
                    showoff=showoff+"9";
                    show.setText(showoff);
                    check(eqn);
                }
            }
        });
        btnA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(total.length()<=24)
                {
                    if(total.length()==0)
                    {
                        total="0";
                        showoff="0";
                    }
                    eqn=total;
                    replacel();
                    total=total+"+";
                    showoff=showoff+"+";
                    show.setText(showoff);
                }
            }
        });
        btnD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(total.length()<=24)
                {
                    if(total.length()==0)
                    {
                        total="0";
                        showoff="0";
                    }
                    eqn=total;
                    replacel();
                    total=total+"/";
                    showoff=showoff+"÷";
                    show.setText(showoff);
                }
            }
        });
        btnM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(total.length()<=24)
                {
                    if(total.length()==0)
                    {
                        total="0";
                        showoff="0";
                    }
                    eqn=total;
                    replacel();
                    total=total+"*";
                    showoff=showoff+"×";
                    show.setText(showoff);
                }
            }
        });
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                if(total.length()==0)
                {
                    total="0";
                    showoff="0";
                    show.setText(showoff);
                }
                if(total.length()<=24)
                {
                    eqn=total;
                    replacel();
                    total=total+"-";
                    showoff=showoff+"-";
                    show.setText(showoff);
                }
            }
        });
        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                check(eqn);
            }
        });
        btnC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(total.length()==1 ||total.length()==0)
                {
                    total="";
                    showoff="";
                    show.setText("");
                }
                else
                {
                    total=total.substring(0,total.length()-1);
                    showoff=showoff.substring(0,showoff.length()-1);
                    eqn=total;
                    show.setText(showoff);
                }
                if(total.endsWith("*") || total.endsWith("/") || total.endsWith("-") || total.endsWith("+"))
                {
                    eqn=total.substring(0,total.length()-1);
                }
                check(eqn);
                if(total.length()==0)
                {
                    show2.setText("0");
                }
            }
        });
    }
    public void replacel()
    {
        if(total.endsWith("*") || total.endsWith("/") || total.endsWith("-") || total.endsWith("+"))
        {
            total= total.substring(0,total.length()-1);
            showoff=showoff.substring(0,showoff.length()-1);
        }
    }
    public void check(String total)
    {
        Expression exp= new ExpressionBuilder(total).build();
        double data= exp.evaluate();
        String Checking= String.valueOf(data);
        if(Checking.endsWith(".0") )
        {
            int idata= (int) data;
            show2.setText("= "+String.valueOf(idata));
        }
        else
        {
            show2.setText("= "+String.valueOf(data));
        }
    }
}