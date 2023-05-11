package htw.berlin.wi.prog2;

import htw.berlin.wi.prog2.domain.Bowl;
import htw.berlin.wi.prog2.domain.Ingredient;

import java.util.List;

public class PrecomputedBowl implements Bowl {

    public double calculatePrice;
    public int calculateCalories;
    public List<String> getIngredientNames;
    public List<Ingredient> ingredients;

    public PrecomputedBowl(List<Ingredient> ingredients, double calculatePrice, int calculateCalories, List<String> getIngredientNames) {
        this.ingredients = ingredients;
        this.calculatePrice = calculatePrice;
        this.calculateCalories = calculateCalories;
        this.getIngredientNames = getIngredientNames;
    }

    @Override
    public double calculatePrice() {
        return calculatePrice;
    }

    @Override
    public int calculateCalories() {
        return calculateCalories;
    }

    @Override
    public List<String> getIngredientNames() {
        return getIngredientNames;
    }


    public List<Ingredient> ingredients() {
        return ingredients;
    }
}
