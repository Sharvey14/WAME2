package com.shannon.student.wame20;

import android.content.Intent;
import android.support.annotation.MainThread;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {

    private LinearLayout mLayout;
    private EditText mEditText;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        mLayout = (LinearLayout) findViewById(R.id.linearLayout);
        mEditText = (EditText) findViewById(R.id.editText);
        mButton = (Button) findViewById(R.id.button);
        mButton.setOnClickListener(onClick());
        TextView textView = new TextView(this);
        textView.setText("New text");
    }

    private View.OnClickListener onClick() {
        return new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent myIntent = new Intent(view.getContext(),MainActivity.class);
                myIntent.putExtra("mytext",mEditText.getText().toString());
                startActivity(myIntent);
            }
        };
    }
}
