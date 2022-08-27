package com.example.cocktail;

import android.app.Activity;
import android.app.ProgressDialog;
import android.hardware.Camera;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

public class randomActivity extends Activity{
    Button btn_new;
    TextView tv_name, tv_description;
    CardView cardView;
    ImageView image;
    ProgressBar progressBar;
    ListView lv_ingredients;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_random);
        btn_new = findViewById(R.id.btn_new);
        tv_name = findViewById(R.id.tv_name);
        tv_description = findViewById(R.id.tv_description);
        cardView = findViewById(R.id.card_view);
        image = findViewById(R.id.image);
        lv_ingredients = findViewById(R.id.lv_ingredients);

        final randomCocktailService randomCocktailService = new randomCocktailService(randomActivity.this);

        btn_new.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                randomCocktailService.getRandomCocktail(new randomCocktailService.RandomCocktailListener() {
                    @Override
                    public void onResponse(CocktailModel cocktailModel) {
                        tv_name.setText(cocktailModel.getStrDrink());
                        tv_description.setText(cocktailModel.getStrInstruction());
                            Picasso.with(randomActivity.this)
                                    .load(cocktailModel.getStrDrinkThumb())
                                    .into(image);

                        String [] clearedIngredients = removeNull(cocktailModel.getStrIngredients());
                        String [] clearedMeasures = removeNull(cocktailModel.getStrMeasure());
                        String [] mixed = mixIngredientsAndMeasures(clearedIngredients, clearedMeasures);
                        ArrayAdapter arrayAdapter = new ArrayAdapter(randomActivity.this, android.R.layout.simple_list_item_1, mixed);
                        lv_ingredients.setAdapter(arrayAdapter);
//                        Toast.makeText(randomActivity.this,mixed[0], Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onError(String message) {
                        Toast.makeText(randomActivity.this, "Something wrong", Toast.LENGTH_SHORT).show();
                    }
                });
            }
            private String[] removeNull(String[] data) {
                List<String> list = new ArrayList<String>();

                for(String s : data) {
                    if(s != "null" && s.length() > 0) {
                        list.add(s);
                    }
                }

                return list.toArray(new String[list.size()]);
            }

            private String[] mixIngredientsAndMeasures(String[] ingredients, String[] measures) {
                String [] mix = new String[measures.length];
                for (int i =0; i < measures.length; i++) {
                    mix[i] = ingredients[i] + " " + measures[i];
                }
                return  mix;
            }
        });
    }

//    private static void getPicture(final Activity activity, final String url, final PictureCallback pictureCallback )
}
