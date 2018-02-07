package com.example.sumit.twitter;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Twitter extends AppCompatActivity {
    TextView textView;
    EditText edittext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_twitter);
        Button changeTextButton = (Button) findViewById(R.id.changeText);
       Button openActivity2Button = (Button) findViewById(R.id.openActivity2);
         textView = (TextView)findViewById(R.id.textView);
         edittext = (EditText)findViewById(R.id.editText);

        changeTextButton.setOnClickListener(clickListener);
        openActivity2Button.setOnClickListener(newActivityClickListener);



    }


    View.OnClickListener clickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            String updatedText = edittext.getText().toString();
            textView.setText(updatedText);
        }
    };

    View.OnClickListener newActivityClickListener = new View.OnClickListener() {

        @Override
        public void onClick(View view) {
            Toast.makeText(Twitter.this, "Not implemented yet", Toast.LENGTH_LONG);
        }
    };

}




//
//
//         textView = (TextView) findViewById(R.id.textView);
//                 Button changeTextButton = (Button)findViewById(R.id.changeText);
//                 Button openActivity2 = (Button)findViewById(R.id.openActivity2);
//                 changeTextButton.setOnClickListener(changetextListener);
//                 openActivity2.setOnClickListener(openActivity2Listener);
//
//
//
//                 }
//
//                 View.OnClickListener changetextListener = new View.OnClickListener(){
//
//@Override
//public void onClick(View view) {
//        textView.setText("Hello World");
//        }
//        };
//
//        View.OnClickListener openActivity2Listener = new View.OnClickListener(){
//
//@Override
//public void onClick(View view) {
//        textView.setText("Not implemented yet");
//        Toast.makeText(MainActivity.this, "Not implemented yet", Toast.LENGTH_LONG).show();
//        }
//        };