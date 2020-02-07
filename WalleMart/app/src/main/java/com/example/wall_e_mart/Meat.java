package com.example.wall_e_mart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Meat extends AppCompatActivity {
    EditText beef;
    EditText lamb;
    EditText chicken;
    final static String bee = "bee";
    final static String lam = "lam";
    final static String chick = "chick";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meat);
        beef = (EditText) findViewById(R.id.Beef);
        lamb = (EditText) findViewById(R.id.Lamb);
        chicken = (EditText) findViewById(R.id.Chicken);

        //Pulling and Assigning Intents
        Intent intent = getIntent();

        //Meat Intents
        String meat1 = intent.getStringExtra(Meat.bee);
        if (meat1 != null) {
            beef.setText(meat1);
        }
        String meat2 = intent.getStringExtra(Meat.lam);
        if (meat2 != null) {
            lamb.setText(meat2);
        }
        String meat3 = intent.getStringExtra(Meat.chick);
        if (meat3 != null) {
            chicken.setText(meat3);
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
        String meat1 = beef.getText().toString();
        bundle.putString(bee, meat1);
        String meat2 = lamb.getText().toString();
        bundle.putString(lam, meat2);
        String meat3 = chicken.getText().toString();
        bundle.putString(chick, meat3);
        intent.putExtras(bundle);
        startActivity(intent);
    }

    public void showCheckOut(View view) {
        Intent intent = new Intent(this, CheckOut.class);
        Bundle bundle = getIntent().getExtras();
        bundle.putAll(bundle);
        String meat1 = beef.getText().toString();
        bundle.putString(bee, meat1);
        String meat2 = lamb.getText().toString();
        bundle.putString(lam, meat2);
        String meat3 = chicken.getText().toString();
        bundle.putString(chick, meat3);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
