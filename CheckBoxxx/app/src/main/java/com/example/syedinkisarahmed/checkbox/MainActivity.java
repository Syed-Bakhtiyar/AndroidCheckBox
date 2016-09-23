package com.example.syedinkisarahmed.checkbox;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void function(View v){
        CheckBox ch=(CheckBox) findViewById(R.id.check);
        if(ch.isChecked()){
            ch.setText("Syed");
        }
        else {
            ch.setText("Bakhtiyar");
        }
    }
}
