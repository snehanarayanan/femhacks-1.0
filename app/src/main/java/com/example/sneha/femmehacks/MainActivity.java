package com.example.sneha.femmehacks;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button family;
    Button chores;
    static final int NUMBER_CODE=12345;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        family=(Button)(findViewById(R.id.family));
        /*
        -weather
        -location services
        -animation
        -multiple pages

        -sound
        -moving background
        -rotational wheel
        -philly related
         */

        family.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentToOpen=new Intent(MainActivity.this,CreateFamily.class); //intent is what you want to do in the future
                //intentToOpen.putExtra("NAME",name.getText());
                startActivityForResult(intentToOpen, NUMBER_CODE); //start the OtherApp based on certain criteria created before
            }
        });
    }
/*
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) { //call back method and is used automatically when the OtherApp closes
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode==NUMBER_CODE){ //if intent coming back is the correct one and THEN result code=result ok
            resultCode=RESULT_OK;
        }

        gpa.setText(data.getExtras().get("GPA").toString());
        //Toast.makeText(this,data.getStringExtra(INTENT_CODE),Toast.LENGTH_SHORT).show();
    }
    }
    */
}
