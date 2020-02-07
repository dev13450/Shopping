package com.example.wall_e_mart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    String bun = "m";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void showFruit (View view){
        Intent intent = new Intent(this, Fruit.class);
        if (getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
    public void showVegetable (View view){
        Intent intent = new Intent(this, Vegetable.class);
        if (getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
    public void showMeat (View view){
        Intent intent = new Intent(this, Meat.class);
        if (getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
    public void showCheckOut (View view){
        Intent intent = new Intent(this, CheckOut.class);
        if (getIntent().getExtras() != null){
            Bundle bundle = getIntent().getExtras();
            intent.putExtras(bundle);
        }
        startActivity(intent);
    }
}
