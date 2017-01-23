package com.example.kiit.mypager;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by kiit on 23-11-2016.
 */
public class MainActivity1 extends AppCompatActivity{
    Button button;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      // button=(Button)findViewById(R.id.btn_stop);
        setContentView(R.layout.welcome);
      /*  button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent();
             //   i.putExtra("SAVE",1);
                setResult(RESULT_OK,i);



           finish();
            }
        });*/
    }
}
