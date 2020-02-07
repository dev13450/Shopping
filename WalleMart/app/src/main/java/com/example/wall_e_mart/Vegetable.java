package com.example.wall_e_mart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Vegetable extends AppCompatActivity {
    EditText carrot;
    EditText tomato;
    EditText bell;
    final static String car = "car";
    final static String tom = "tom";
    final static String be = "be";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetable);
        carrot = (EditText) findViewById(R.id.Carrot);
        tomato = (EditText) findViewById(R.id.Tomato);
        bell = (EditText) findViewById(R.id.Bell);

        //Pulling and Assigning Intents
        Intent intent = getIntent();

        //Vegetable Intents
        String vegetable1 = intent.getStringExtra(Vegetable.car);
        if (vegetable1 != null) {
            carrot.setText(vegetable1);
        }
        String vegetable2 = intent.getStringExtra(Vegetable.tom);
        if (vegetable2 != null) {
            tomato.setText(vegetable2);
        }
        String vegetable3 = intent.getStringExtra(Vegetable.be);
        if (vegetable3 != null) {
            bell.setText(vegetable3);
        }
    }
    public void back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void add(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = getIntent().getExtras();
        bundle.putAll(bundle);
        String vegetable1 = carrot.getText().toString();
        bundle.putString(car, vegetable1);
        String vegetable2 = tomato.getText().toString();
        bundle.putString(tom, vegetable2);
        String vegetable3 = bell.getText().toString();
        bundle.putString(be, vegetable3);
        intent.putExtras(bundle);
        startActivity((intent));
    }

    public void showCheckOut(View view) {
        Intent intent = new Intent(this, CheckOut.class);
        Bundle bundle = getIntent().getExtras();
        bundle.putAll(bundle);
        String vegetable1 = carrot.getText().toString();
        bundle.putString(car, vegetable1);
        String vegetable2 = tomato.getText().toString();
        bundle.putString(tom, vegetable2);
        String vegetable3 = bell.getText().toString();
        bundle.putString(be, vegetable3);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
