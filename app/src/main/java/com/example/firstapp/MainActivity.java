package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int t=(int)((Math.random() * (19)) + 1);
    public void funcb(View view){
        EditText nump=(EditText) findViewById(R.id.nump);
        String s=nump.getText().toString();
        int r=Integer.parseInt(s);
        String hj="The Number you entered is low,Please try again ";
        String hk="The Number you entered is high,Please try again ";
        String hl="Hoorah ! You have got it right!";
        if(r<t)
        {
            Toast.makeText(this,hj,Toast.LENGTH_SHORT).show();
        }
        else if(r>t)
        {
            Toast.makeText(this,hk,Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this,hl,Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}