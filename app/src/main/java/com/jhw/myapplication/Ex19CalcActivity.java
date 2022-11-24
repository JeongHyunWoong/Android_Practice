package com.jhw.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Ex19CalcActivity extends AppCompatActivity {

    EditText resultNum;

    //누적되서 보여주는 스트링변수
    String number1="", number2="";
    //계산해야할 변수
    int su1, su2;
    //연산자선택시 저장
    String yon="";
    boolean first=true;//첫번째수냐 두번째수냐
    boolean btnUse=false;//버튼사용중?
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22_calc_sylas);

        resultNum = (EditText) findViewById(R.id.resultNum);

        findViewById(R.id.btn1).setOnClickListener(mClick);
        findViewById(R.id.btn2).setOnClickListener(mClick);
        findViewById(R.id.btn3).setOnClickListener(mClick);
        findViewById(R.id.btnP).setOnClickListener(mClick);
        findViewById(R.id.btn4).setOnClickListener(mClick);
        findViewById(R.id.btn5).setOnClickListener(mClick);
        findViewById(R.id.btn6).setOnClickListener(mClick);
        findViewById(R.id.btnM).setOnClickListener(mClick);
        findViewById(R.id.btn7).setOnClickListener(mClick);
        findViewById(R.id.btn8).setOnClickListener(mClick);
        findViewById(R.id.btn9).setOnClickListener(mClick);
        findViewById(R.id.btnS).setOnClickListener(mClick);
        findViewById(R.id.btnC).setOnClickListener(mClick);
        findViewById(R.id.btn0).setOnClickListener(mClick);
        findViewById(R.id.btnE).setOnClickListener(mClick);
        findViewById(R.id.btnStar).setOnClickListener(mClick);
    }
    View.OnClickListener mClick = new View.OnClickListener()
    {
        public void onClick(View v)
        {
            switch(v.getId()) {
                case R.id.btn1:btnUse=true;
                    if(first==true){ firstNumber("1");}
                    else {secondNumber("1");}
                    break;
                case R.id.btn2:btnUse=true;
                    if(first==true){ firstNumber("2");}
                    else {secondNumber("2");}
                    break;
                case R.id.btn3:btnUse=true;
                    if(first==true){ firstNumber("3");}
                    else {secondNumber("3");}
                    break;
                case R.id.btn4:btnUse=true;
                    if(first==true){ firstNumber("4");}
                    else {secondNumber("4");}
                    break;
                case R.id.btn5:btnUse=true;
                    if(first==true){ firstNumber("5");}
                    else {secondNumber("5");}
                    break;
                case R.id.btn6:btnUse=true;
                    if(first==true){ firstNumber("6");}
                    else {secondNumber("6");}
                    break;
                case R.id.btn7:btnUse=true;
                    if(first==true){ firstNumber("7");}
                    else {secondNumber("7");}
                    break;
                case R.id.btn8:btnUse=true;
                    if(first==true){ firstNumber("8");}
                    else {secondNumber("8");}
                    break;
                case R.id.btn9:btnUse=true;
                    if(first==true){ firstNumber("9");}
                    else {secondNumber("9");}
                    break;
                case R.id.btn0:btnUse=true;
                    if(first==true){ firstNumber("0");}
                    else {secondNumber("0");}
                    break;
                case R.id.btnP:if(btnUse==false) su1 = Integer.parseInt(resultNum.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="+";
                    resultNum.setText("");
                    break;
                case R.id.btnM:if(btnUse==false) su1 = Integer.parseInt(resultNum.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="-";
                    resultNum.setText("");
                    break;
                case R.id.btnStar:if(btnUse==false) su1 = Integer.parseInt(resultNum.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="*";
                    resultNum.setText("");
                    break;
                case R.id.btnS:if(btnUse==false) su1 = Integer.parseInt(resultNum.getText().toString());
                    first=false;//두번째수입력으로 바뀌기위해서..
                    yon="/";
                    resultNum.setText("");
                    break;
                case R.id.btnE:
                    resultNum.setText("");
                    result();
                    break;
                case R.id.btnC:
                    //초기화
                    //실제수계산하는거, 표여주는수,첫번째체크변수
                    su1=0;
                    su2=0;
                    number1="";
                    number2="";
                    first=true;
                    btnUse=false;
                    resultNum.setText("");
                    break;
            }
        }
    };

    void firstNumber(String number1)
    {
        resultNum.setText("");

        this.number1 += number1;
        su1 = Integer.parseInt(this.number1);
        resultNum.setText(this.number1);
    }
    void secondNumber(String number2)
    {
        resultNum.setText("");
        this.number2 += number2;
        su2 = Integer.parseInt(this.number2);
        resultNum.setText(this.number2);
    }
    void result()
    {
        if(btnUse==false) {su2 = Integer.parseInt(resultNum.getText().toString());}

        if(yon.equals("+"))
        {
            int result = su1+su2;
            resultNum.setText(result+"");
        }
        else if(yon.equals("-"))
        {
            int result = su1-su2;
            resultNum.setText(result+"");
        }
        else if(yon.equals("*"))
        {
            int result = su1*su2;
            resultNum.setText(result+"");
        }
        else if(yon.equals("/"))
        {
            int result = su1/su2;
            resultNum.setText(result+"");
        }
        //초기화
        //실제수계산하는거, 표여주는수,첫번째체크변수
        su1=0;
        su2=0;
        number1="";
        number2="";
        first=true;
    }
}
