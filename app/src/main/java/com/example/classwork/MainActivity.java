package com.example.classwork;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.nfc.Tag;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText et;
    private TextView t3,t4,t5,t6,t7,t8,t9,t10;
    private CharSequence temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et = (EditText)findViewById(R.id.et);
        t3 = (TextView)findViewById(R.id.textView3);
        t4 = (TextView)findViewById(R.id.textView4);
        t5 = (TextView)findViewById(R.id.textView5);
        t6 = (TextView)findViewById(R.id.textView6);
        t7 = (TextView)findViewById(R.id.textView7);
        t8 = (TextView)findViewById(R.id.textView8);
        t9 = (TextView)findViewById(R.id.textView9);
        t10 = (TextView)findViewById(R.id.textView10);
        et.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                temp = s;
            }

            @Override
            public void afterTextChanged(Editable s) {
//                editstart = et.getSelectionStart();
//                editend = et.getSelectionEnd();

                if(temp.length() != 0 && check(temp)){
                    t3.setText("这是第" + temp + "句话");
                    t4.setText("这是第1" + temp + "句话");
                    t5.setText("这是第2" + temp + "句话");
                    t6.setText("这是第3" + temp + "句话");
                    t7.setText("这是第4" + temp + "句话");
                    t8.setText("这是第5" + temp + "句话");
                    t9.setText("这是第6" + temp + "句话");
                    t10.setText("这是第7" + temp + "句话");
                }else{
                    t3.setText(" ");
                    t4.setText(" ");
                    t5.setText(" ");
                    t6.setText(" ");
                    t7.setText(" ");
                    t8.setText(" ");
                    t9.setText(" ");
                    t10.setText(" ");
                }

            }
        });
    }
    private boolean check(CharSequence x){

        for(int i=0;i<temp.length();i++){
            if(x.charAt(i)<'0' || x.charAt(i)>'9'){
                return false;
            }
        }
        return true;
    }

}