package com.example.administrator.androidevent;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn1 = (Button)findViewById(R.id.btn1);
        ButtonListener mListener = new ButtonListener();
        btn1.setOnClickListener(mListener);
    }

    class ButtonListener implements View.OnClickListener {
        public void onClick(View v) {
            TextView txtView = (TextView) findViewById(R.id.tv1);
            txtView.setText("Good Afternoon");
        }
    }
}