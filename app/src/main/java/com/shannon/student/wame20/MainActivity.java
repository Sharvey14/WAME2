package com.shannon.student.wame20;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView = findViewById(R.id.text);

        Intent intent = getIntent();
        if(intent != null){
            mTextView.setText(intent.getStringExtra("mytext"));
        }
    }
    public void addEvent (View view){
        Intent i = new Intent(this, EventActivity.class);
        startActivity(i);
    }
}
