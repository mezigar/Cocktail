package com.example.cocktail;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

public class MainActivity extends AppCompatActivity {

    Button btn_getRandomCocktail, btn_searchByName, btn_searchByIngredient;
    EditText et_datainput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //      assign values to the each control on the layout
        btn_getRandomCocktail = findViewById(R.id.btn_getRandomCocktail);
        btn_searchByName = findViewById(R.id.btn_searchByName);
        btn_searchByIngredient = findViewById(R.id.btn_searchByIngredient);

        et_datainput = findViewById(R.id.et_dataInput);
        //      click listeners to the  each button
        btn_getRandomCocktail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, randomActivity.class);
                startActivity(intent);
                // Instantiate the RequestQueue.
//                RequestQueue queue = Volley.newRequestQueue(MainActivity.this);
//                String url = "https://www.thecocktaildb.com/api/json/v1/1/random.php";
//
//                // Request a string response from the provided URL.
//                StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
//                        new Response.Listener<String>() {
//                            @Override
//                            public void onResponse(String response) {
//                                Toast.makeText(MainActivity.this, response, Toast.LENGTH_SHORT).show();
//
//                            }
//                        }, new Response.ErrorListener() {
//                    @Override
//                    public void onErrorResponse(VolleyError error) {
//                        Toast.makeText(MainActivity.this, "Error occured !", Toast.LENGTH_SHORT).show();
//
//                    }
//                });
//
//// Add the request to the RequestQueue.
//                queue.add(stringRequest);
//            }
//        });

            }
        });
    }
}