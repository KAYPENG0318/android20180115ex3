package com.wanna.android20180115ex3;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void clickWrite(View v)
    {
        //SharedPreferences共享資訊
        SharedPreferences sp = getSharedPreferences("Mydata",MODE_PRIVATE);
        SharedPreferences.Editor editor = sp.edit();
        EditText ed = (EditText)findViewById(R.id.editText);
        editor.putString("data1",ed.getText().toString());
        editor.commit();//存入手機
    }
    public void clickRead(View v)
    {
        SharedPreferences sp = getSharedPreferences("Mydata",MODE_PRIVATE);
        String str = sp.getString("data1","");
        TextView tv = (TextView)findViewById(R.id.textView);
        tv.setText(str);
    }
}
