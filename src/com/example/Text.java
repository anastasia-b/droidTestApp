package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.ToggleButton;

/**
 * Created by Anastasia Belozertseva
 */
public class Text extends Activity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.text);

        Button tryCom = (Button) findViewById(R.id.bCom);
        ToggleButton pass = (ToggleButton) findViewById(R.id.tbPassword);
        EditText inputText = (EditText) findViewById(R.id.etCommand);
        TextView outputText = (TextView) findViewById(R.id.tvResults);

    }
}
