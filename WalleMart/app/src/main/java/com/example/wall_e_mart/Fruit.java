package com.example.wall_e_mart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Fruit extends AppCompatActivity {
    EditText apple;
    EditText strawberry;
    EditText blueberry;
    final static String app = "app";
    final static String straw = "straw";
    final static String blue = "blue";
    String bun = "f";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        apple = (EditText) findViewById(R.id.Apple);
        strawberry = (EditText) findViewById(R.id.Strawberry);
        blueberry = (EditText) findViewById(R.id.Blueberry);

        //Pulling and Assigning Intents
        /*Intent intent = getIntent();

        //Fruit Intents
        String fruit1 = intent.getStringExtra(Fruit.app);
        if (fruit1 != null) {
            apple.setText(fruit1);
        }
        String fruit2 = intent.getStringExtra(Fruit.straw);
        if (fruit2 != null) {
            strawberry.setText(fruit2);
        }
        String fruit3 = intent.getStringExtra(Fruit.blue);
        if (fruit3 != null) {
            blueberry.setText(fruit3);
        }*/
    }
    public void back (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    public void add(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        Bundle bundle = getIntent().getExtras();
        bundle.putAll(bundle);
        String fruit1 = apple.getText().toString();
        bundle.putString(app, fruit1);
        String fruit2 = strawberry.getText().toString();
        bundle.putString(straw, fruit2);
        String fruit3 = blueberry.getText().toString();
        bundle.putString(blue, fruit3);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void showCheckOut(View view) {
        Intent intent = new Intent(this, CheckOut.class);
        Bundle bundle = getIntent().getExtras();
        bundle.putAll(bundle);
        String fruit1 = apple.getText().toString();
        bundle.putString(app, fruit1);
        String fruit2 = strawberry.getText().toString();
        bundle.putString(straw, fruit2);
        String fruit3 = blueberry.getText().toString();
        bundle.putString(blue, fruit3);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
