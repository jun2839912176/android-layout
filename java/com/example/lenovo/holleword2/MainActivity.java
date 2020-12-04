package com.example.lenovo.holleword2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{
    private RadioButton radiobutton;
    private RadioButton radiobutton2;
    private TextView textView;
    private RadioGroup radioGroup;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radiobutton = (RadioButton) findViewById(R.id.nanxing);
        radiobutton2 = (RadioButton) findViewById(R.id.nvxing);
        textView=(TextView)findViewById(R.id.textview);
        radioGroup=(RadioGroup)findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int checkedId) {
                if (checkedId == R.id.nanxing) {
                    textView.setText("你的性别为男");
                } else {
                    textView.setText("你的性别为女");
                }
            }
        });

    }
}
