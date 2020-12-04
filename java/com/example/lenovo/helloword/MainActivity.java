package com.example.lenovo.helloword;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Switch;


public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    private Button button1;
    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       button1=(Button)findViewById(R.id.button17);
       button2=(Button)findViewById(R.id.button18);
       button1.setOnClickListener(this);
       button2.setOnClickListener(this);

    }


    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.button17:
                button1.setText("第一个按钮已被点击?");
                break;
            case R.id.button18:
                button2.setText("第二个按钮已被点击？");
                break;


        }
    }
}
