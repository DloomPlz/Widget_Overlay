package com.example.widgetflottant;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void toast_fct(View view){
        Toast toast = Toast.makeText(this, "Bienvenue sur mon application :)", Toast.LENGTH_LONG);
        View toastview = toast.getView();
        toast.setGravity(Gravity.TOP|Gravity.LEFT, 150 , 150);

        TextView tv = (TextView) toastview.findViewById(android.R.id.message);
        tv.setTextSize(25);
        tv.setTextColor(Color.parseColor("#22222222"));
        tv.setCompoundDrawablePadding(15);
        toastview.setBackgroundColor(Color.parseColor("#990000"));


        toast.show();
    }
}
