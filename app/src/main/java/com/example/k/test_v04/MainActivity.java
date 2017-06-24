package com.example.k.test_v04;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

//Button button1;

public class MainActivity extends Activity {
    EditText text1;
    String s1 = "llll";
    String s2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text1 = (EditText)findViewById(R.id.editText);
        Button button1 = (Button)findViewById(R.id.button);
        button1.setOnClickListener(v -> {
            Toast toast = Toast.makeText(getApplicationContext(),s1 + text1.getText().toString(), Toast.LENGTH_SHORT);
            toast.show();
        });



    }
}
