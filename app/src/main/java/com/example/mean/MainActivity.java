package com.example.mean;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void five(View view)
    {
        Intent intent= new Intent(this,five.class);
        startActivity(intent);
    }

    public void six(View view)
    {
        Intent intent= new Intent(this,six.class);
        startActivity(intent);
    }

    public void seven(View view)
    {
        Intent intent= new Intent(this,seven.class);
        startActivity(intent);
    }

    public void eight(View view)
    {
        Intent intent= new Intent(this,eight.class);
        startActivity(intent);
    }

    public void ten(View view)
    {
        Intent intent= new Intent(this,ten.class);
        startActivity(intent);
    }

}
