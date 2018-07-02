package com.qwersoft.notificationdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerReceiveActivity extends AppCompatActivity {

    private TextView tvAnswerReceiveText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer_receive);

        tvAnswerReceiveText = (TextView) findViewById(R.id.tvAnswerReceiveText);
        tvAnswerReceiveText.setText(getIntent().getAction());
    }
}
