package com.example.wall_e_mart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.math.BigDecimal;
import java.math.RoundingMode;

import static com.example.wall_e_mart.Fruit.app;
import static com.example.wall_e_mart.Fruit.blue;
import static com.example.wall_e_mart.Fruit.straw;
import static com.example.wall_e_mart.Meat.bee;
import static com.example.wall_e_mart.Meat.chick;
import static com.example.wall_e_mart.Meat.lam;
import static com.example.wall_e_mart.Vegetable.be;
import static com.example.wall_e_mart.Vegetable.car;
import static com.example.wall_e_mart.Vegetable.tom;

public class CheckOut extends AppCompatActivity {

    TextView Apple;
    TextView Strawberry;
    TextView Blueberry;
    TextView Carrot;
    TextView Tomato;
    TextView Bell;
    TextView Beef;
    TextView Lamb;
    TextView Chicken;
    TextView AppleP;
    TextView StrawberryP;
    TextView BlueberryP;
    TextView CarrotP;
    TextView TomatoP;
    TextView BellP;
    TextView BeefP;
    TextView LambP;
    TextView ChickenP;
    TextView Sub;
    TextView Tax;
    TextView Total;
    Button Finish;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_check_out);


        /*intent.putExtra(bun, bundle);
        String value1 = bundle.getString("straw");
        if (value1 != null){
            intent.putExtra("straw", value1);
        }*/

        //Fruit
        Apple = (TextView) findViewById(R.id.apple);
        Strawberry = (TextView) findViewById(R.id.starwberry);
        Blueberry = (TextView) findViewById(R.id.blueberry);
        AppleP = (TextView) findViewById(R.id.appleP);
        StrawberryP = (TextView) findViewById(R.id.strawberryP);
        BlueberryP = (TextView) findViewById(R.id.blueberryP);

        //Vegetable
        Carrot = (TextView) findViewById(R.id.carrot);
        Tomato = (TextView) findViewById(R.id.tomato);
        Bell = (TextView) findViewById(R.id.bell);
        CarrotP = (TextView) findViewById(R.id.carrotP);
        TomatoP = (TextView) findViewById(R.id.tomatoP);
        BellP = (TextView) findViewById(R.id.bellP);

        //Meat
        Beef = (TextView) findViewById(R.id.beef);
        Lamb = (TextView) findViewById(R.id.lamb);
        Chicken = (TextView) findViewById(R.id.chicken);
        BeefP = (TextView) findViewById(R.id.beefP);
        LambP = (TextView) findViewById(R.id.lambP);
        ChickenP = (TextView) findViewById(R.id.chickenP);

        //Prices
        Sub = (TextView) findViewById(R.id.sub);
        Tax = (TextView) findViewById(R.id.tax);
        Total = (TextView) findViewById(R.id.total);

        //Pulling and Assigning Intents
        Intent intent = getIntent();
        Bundle bundle = getIntent().getExtras();
        //bundle = intent.getExtras().getBundle();

        //Fruit Intents
        String fruit1 = bundle.getString(app);
        if (fruit1 != null) {
            Apple.setText(fruit1);
        }
        String fruit2 = bundle.getString(straw);
        if (fruit2 != null) {
            Strawberry.setText(fruit2);
        }
        String fruit3 = bundle.getString(blue);
        if (fruit3 != null) {
            Blueberry.setText(fruit3);
        }

        //Vegetable Intents
        String vegetable1 = bundle.getString(car);
        if (vegetable1 != null) {
            Carrot.setText(vegetable1);
        }
        String vegetable2 = bundle.getString(tom);
        if (vegetable2 != null) {
            Tomato.setText(vegetable2);
        }
        String vegetable3 = bundle.getString(be);
        if (vegetable3 != null) {
            Bell.setText(vegetable3);
        }

        //Meat Intents
        String meat1 = bundle.getString(bee);
        if (meat1 != null) {
            Beef.setText(meat1);
        }
        String meat2 = bundle.getString(lam);
        if (meat2 != null) {
            Lamb.setText(meat2);
        }
        String meat3 = bundle.getString(chick);
        if (meat3 != null) {
            Chicken.setText(meat3);
        }

        //Setting Fruit Prices
        double app =  Integer.parseInt(Apple.getText().toString());
        double ApplePP=(app*2.49);
        round(ApplePP,2);
        AppleP.setText("$"+ApplePP);
        double straw =  Integer.parseInt(Strawberry.getText().toString());
        double StrawberryPP=(straw*7.99);
        round(StrawberryPP,2);
        StrawberryP.setText("$"+StrawberryPP);
        double blue =  Integer.parseInt(Blueberry.getText().toString());
        double BlueberryPP=(blue*4.99);
        round(BlueberryPP,2);
        BlueberryP.setText("$"+BlueberryPP);

        //Setting Vegetable Prices
        double car =  Integer.parseInt(Carrot.getText().toString());
        double CarrotPP=(car*3.49);
        round(CarrotPP,2);
        CarrotP.setText("$"+CarrotPP);
        double tom =  Integer.parseInt(Tomato.getText().toString());
        double TomatoPP=(tom*8.99);
        round(TomatoPP,2);
        TomatoP.setText("$"+TomatoPP);
        double bell =  Integer.parseInt(Bell.getText().toString());
        double BellPP=(bell*5.99);
        round(BellPP,2);
        BellP.setText("$"+BellPP);

        //Setting Meat Prices
        double beef =  Integer.parseInt(Beef.getText().toString());
        double BeefPP=(beef*7.49);
        round(BeefPP,2);
        BeefP.setText("$"+BeefPP);
        double lamb =  Integer.parseInt(Lamb.getText().toString());
        double LambPP=(lamb*11.99);
        round(LambPP,2);
        LambP.setText("$"+LambPP);
        double chick =  Integer.parseInt(Chicken.getText().toString());
        double ChickenPP=(chick*9.99);
        round(ChickenPP,2);
        ChickenP.setText("$"+ChickenPP);

        //Adding up Prices
        double price = ApplePP +StrawberryPP +BlueberryPP +CarrotPP
                +TomatoPP +BellPP +BeefPP +LambPP +ChickenPP;
        round(price,2);
        Sub.setText("$"+price);
        double t = price * 0.10;
        round(t,2);
        Tax.setText("$"+ t);
        double T = price + t;
        round(T,2);
        Total.setText("$"+T);
    }
    public void checkout (View view){
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra(app, "0");
        intent.putExtra(straw, "0");
        intent.putExtra(blue, "0");
        intent.putExtra(car, "0");
        intent.putExtra(tom, "0");
        intent.putExtra(be, "0");
        intent.putExtra(bee, "0");
        intent.putExtra(lam, "0");
        intent.putExtra(chick, "0");
        startActivity(intent);
    }
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = BigDecimal.valueOf(value);
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
