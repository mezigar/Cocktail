package com.example.cocktail;

import android.content.Context;

import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class randomCocktailService {
    public static final String QUERY_FOR_RANDOM_COCKTAIL = "https://www.thecocktaildb.com/api/json/v1/1/random.php";

    Context context;

    public randomCocktailService(Context context) {
        this.context = context;
    }

    public interface RandomCocktailListener {
        void onResponse(CocktailModel cocktailModel);

        void onError(String message);
    }

    public void getRandomCocktail(RandomCocktailListener randomCocktailListener) {
        JsonObjectRequest request = new JsonObjectRequest(QUERY_FOR_RANDOM_COCKTAIL, new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                CocktailModel randomCocktail = new CocktailModel();
                try {
                    JSONArray drinks = response.getJSONArray("drinks");

                    JSONObject drinkFromAPI = (JSONObject) drinks.get(0);

                    CocktailModel randromCocktail = new CocktailModel();

                    randomCocktail.setIdDrink(drinkFromAPI.getInt("idDrink"));
                    randomCocktail.setStrDrink(drinkFromAPI.getString("strDrink"));
                    randomCocktail.setStrDrinkThumb(drinkFromAPI.getString("strDrinkThumb"));
                    randomCocktail.setStrInstruction(drinkFromAPI.getString("strInstructions"));
                    // считать и установить 15 ингредиентов + 15 объемов
                    String[] ingredients = new String[15];
                    String[] measures = new String[15];
                    for (int i = 1; i < 16; i++) {
                        String tmpIngredient = drinkFromAPI.getString("strIngredient" + i);
                        String tmpMeasure = drinkFromAPI.getString("strMeasure" + i);
                        if (tmpIngredient != null && tmpMeasure != null)  {
                            ingredients[i - 1] = tmpIngredient;
                            measures[i - 1] = tmpMeasure;
                        } else {
                            break;
                        }

                    }
                    randomCocktail.setStrIngredients(ingredients);
                    randomCocktail.setStrMeasure(measures);
                    // где-то ниже опечатка
                    randomCocktail.setStrDrinkAlternate(drinkFromAPI.getString("strDrinkAlternate"));
                    randomCocktail.setStrTags(drinkFromAPI.getString("strTags"));
                    randomCocktail.setStrVideo(drinkFromAPI.getString("strVideo"));
                    randomCocktail.setStrCategory(drinkFromAPI.getString("strCategory"));
                    randomCocktail.setStrIBA(drinkFromAPI.getString("strIBA"));
                    randomCocktail.setStrAlcoholic(drinkFromAPI.getString("strAlcoholic"));
                    randomCocktail.setStrGlass(drinkFromAPI.getString("strGlass"));
                    randomCocktail.setStrInstructionES(drinkFromAPI.getString("strInstructionES"));
                    randomCocktail.setStrInstructionDE(drinkFromAPI.getString("strInstructionDE"));
                    randomCocktail.setStrInstructionFR(drinkFromAPI.getString("strInstructionFR"));
                    randomCocktail.setStrInstructionIT(drinkFromAPI.getString("strInstructionIT"));
                    randomCocktail.setStrInstructionZH_HANS(drinkFromAPI.getString("strInstructionZH_HANS"));
                    randomCocktail.setStrInstructionZH_HANT(drinkFromAPI.getString("strInstructionZH_HANT"));
                    randomCocktail.setStrImageSource(drinkFromAPI.getString("strImageSource"));
                    randomCocktail.setStrImageAttribution(drinkFromAPI.getString("strImageAttribution"));
                    randomCocktail.setStrCreativeCommonsConfirmed(drinkFromAPI.getString("strCreativeCommonsConfirmed"));
                    randomCocktail.setDateModified(drinkFromAPI.getString("dateModified"));


                } catch (JSONException e) {
                    e.printStackTrace();
                }
                randomCocktailListener.onResponse(randomCocktail);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {

            }
        });
        MySingleton.getInstance(context).addToRequestQueue(request);
    }

}
