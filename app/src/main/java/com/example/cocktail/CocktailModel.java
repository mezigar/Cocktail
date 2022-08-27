package com.example.cocktail;

import java.util.Arrays;

public class CocktailModel {
    private int idDrink;
    private String strDrink;
    private String strDrinkAlternate;
    private String strTags;
    private String strVideo;
    private String strCategory;
    private String strIBA;
    private String strAlcoholic;
    private String strGlass;
    private String strInstruction;
    private String strInstructionES;
    private String strInstructionDE;
    private String strInstructionFR;
    private String strInstructionIT;
    private String strInstructionZH_HANS;
    private String strInstructionZH_HANT;
    private String strDrinkThumb;
    private String[] strIngredients;
    private String[] strMeasure;
    private String strImageSource;
    private String strImageAttribution;
    private String strCreativeCommonsConfirmed;
    private String dateModified;

    public CocktailModel(int idDrink, String strDrink, String strDrinkAlternate, String strTags, String strVideo, String strCategory, String strIBA, String strAlcoholic, String strGlass, String strInstruction, String strInstructionES, String strInstructionDE, String strInstructionFR, String strInstructionIT, String strInstructionZH_HANS, String strInstructionZH_HANT, String strDrinkThumb, String[] strIngredients, String[] strMeasure, String strImageSource, String strImageAttribution, String strCreativeCommonsConfirmed, String dateModified) {
        this.idDrink = idDrink;
        this.strDrink = strDrink;
        this.strDrinkAlternate = strDrinkAlternate;
        this.strTags = strTags;
        this.strVideo = strVideo;
        this.strCategory = strCategory;
        this.strIBA = strIBA;
        this.strAlcoholic = strAlcoholic;
        this.strGlass = strGlass;
        this.strInstruction = strInstruction;
        this.strInstructionES = strInstructionES;
        this.strInstructionDE = strInstructionDE;
        this.strInstructionFR = strInstructionFR;
        this.strInstructionIT = strInstructionIT;
        this.strInstructionZH_HANS = strInstructionZH_HANS;
        this.strInstructionZH_HANT = strInstructionZH_HANT;
        this.strDrinkThumb = strDrinkThumb;
        this.strIngredients = strIngredients;
        this.strMeasure = strMeasure;
        this.strImageSource = strImageSource;
        this.strImageAttribution = strImageAttribution;
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
        this.dateModified = dateModified;
    }

    public CocktailModel() {

    }

    public int getIdDrink() {
        return idDrink;
    }

    public void setIdDrink(int idDrink) {
        this.idDrink = idDrink;
    }

    public String getStrDrink() {
        return strDrink;
    }

    public void setStrDrink(String strDrink) {
        this.strDrink = strDrink;
    }

    public String getStrDrinkAlternate() {
        return strDrinkAlternate;
    }

    public void setStrDrinkAlternate(String strDrinkAlternate) {
        this.strDrinkAlternate = strDrinkAlternate;
    }

    public String getStrTags() {
        return strTags;
    }

    public void setStrTags(String strTags) {
        this.strTags = strTags;
    }

    public String getStrVideo() {
        return strVideo;
    }

    public void setStrVideo(String strVideo) {
        this.strVideo = strVideo;
    }

    public String getStrCategory() {
        return strCategory;
    }

    public void setStrCategory(String strCategory) {
        this.strCategory = strCategory;
    }

    public String getStrIBA() {
        return strIBA;
    }

    public void setStrIBA(String strIBA) {
        this.strIBA = strIBA;
    }

    public String getStrAlcoholic() {
        return strAlcoholic;
    }

    public void setStrAlcoholic(String strAlcoholic) {
        this.strAlcoholic = strAlcoholic;
    }

    public String getStrGlass() {
        return strGlass;
    }

    public void setStrGlass(String strGlass) {
        this.strGlass = strGlass;
    }

    public String getStrInstruction() {
        return strInstruction;
    }

    public void setStrInstruction(String strInstruction) {
        this.strInstruction = strInstruction;
    }

    public String getStrInstructionES() {
        return strInstructionES;
    }

    public void setStrInstructionES(String strInstructionES) {
        this.strInstructionES = strInstructionES;
    }

    public String getStrInstructionDE() {
        return strInstructionDE;
    }

    public void setStrInstructionDE(String strInstructionDE) {
        this.strInstructionDE = strInstructionDE;
    }

    public String getStrInstructionFR() {
        return strInstructionFR;
    }

    public void setStrInstructionFR(String strInstructionFR) {
        this.strInstructionFR = strInstructionFR;
    }

    public String getStrInstructionIT() {
        return strInstructionIT;
    }

    public void setStrInstructionIT(String strInstructionIT) {
        this.strInstructionIT = strInstructionIT;
    }

    public String getStrInstructionZH_HANS() {
        return strInstructionZH_HANS;
    }

    public void setStrInstructionZH_HANS(String strInstructionZH_HANS) {
        this.strInstructionZH_HANS = strInstructionZH_HANS;
    }

    public String getStrInstructionZH_HANT() {
        return strInstructionZH_HANT;
    }

    public void setStrInstructionZH_HANT(String strInstructionZH_HANT) {
        this.strInstructionZH_HANT = strInstructionZH_HANT;
    }

    public String getStrDrinkThumb() {
        return strDrinkThumb;
    }

    public void setStrDrinkThumb(String strDrinkThumb) {
        this.strDrinkThumb = strDrinkThumb;
    }

    public String[] getStrIngredients() {
        return strIngredients;
    }

    public void setStrIngredients(String[] strIngredients) {
        this.strIngredients = strIngredients;
    }

    public String[] getStrMeasure() {
        return strMeasure;
    }

    public void setStrMeasure(String[] strMeasure) {
        this.strMeasure = strMeasure;
    }

    public String getStrImageSource() {
        return strImageSource;
    }

    public void setStrImageSource(String strImageSource) {
        this.strImageSource = strImageSource;
    }

    public String getStrImageAttribution() {
        return strImageAttribution;
    }

    public void setStrImageAttribution(String strImageAttribution) {
        this.strImageAttribution = strImageAttribution;
    }

    public String getStrCreativeCommonsConfirmed() {
        return strCreativeCommonsConfirmed;
    }

    public void setStrCreativeCommonsConfirmed(String strCreativeCommonsConfirmed) {
        this.strCreativeCommonsConfirmed = strCreativeCommonsConfirmed;
    }

    public String getDateModified() {
        return dateModified;
    }

    public void setDateModified(String dateModified) {
        this.dateModified = dateModified;
    }

    @Override
    public String   toString() {
        return "CocktailModel{" +
                "strDrink='" + strDrink + '\'' +
                ", strTags=" + strTags +
                ", strAlcoholic='" + strAlcoholic + '\'' +
                ", strGlass='" + strGlass + '\'' +
                ", strInstruction='" + strInstruction + '\'' +
                '}';
    }
}
