package com.example.corey.drink_vendor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class FindDrinkActivity extends AppCompatActivity {
    private DrinkExpert expert = new DrinkExpert();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_drink);





    }

    public void onClickFindDrink(View view){



        TextView brands = (TextView) findViewById(R.id.brands);


        Spinner color = (Spinner)findViewById(R.id.color);
        String drinkType = String.valueOf(color.getSelectedItem());
        List<String> brandsList = expert.getBrands(drinkType);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand:brandsList){
            brandsFormatted.append(brand).append('\n');
        }
brands.setText(brandsFormatted);
    }

}




