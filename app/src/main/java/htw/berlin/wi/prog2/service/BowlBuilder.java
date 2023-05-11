package htw.berlin.wi.prog2.service;

import htw.berlin.wi.prog2.domain.Ingredient;
import htw.berlin.wi.prog2.domain.DummyBowlImpl;
import htw.berlin.wi.prog2.domain.Bowl;
import htw.berlin.wi.prog2.DynamicallyComputedBowl;
import htw.berlin.wi.prog2.PrecomputedBowl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BowlBuilder{
    private List<Ingredient> ingredients = new ArrayList<>();

    public List<String> getIngredientNames(List<Ingredient> ingredients) {
        return ingredients.stream()
                .map(Ingredient::getName)
                .collect(Collectors.toList());
    }
        public BowlBuilder add(Ingredient ingredient) {
        // TODO hier die Annahme von Zutaten implementieren
            ingredients.add(ingredient);
            return this; // die Rückgabe von this sollte beibehalten bleiben (siehe Benutzung im BowlBuilderTest)
    }

    public Bowl buildPrecomputed() {
        // TODO hier stattdessen die neue Klasse PrecomputedBowl verwenden
        List<String> ingredientsNames = getIngredientNames(ingredients);
        int totalCalories = ingredients.stream().mapToInt(Ingredient::getCalories).sum();
        double totalPrice = ingredients.stream().mapToDouble(Ingredient::getPrice).sum();
        return new PrecomputedBowl(ingredients, totalPrice, totalCalories, ingredientsNames);
    }

    public Bowl buildDynamicallyComputed() {
        // TODO hier stattdessen die neue Klasse DynamicallyComputedBowl verwenden
        return new DynamicallyComputedBowl(ingredients);
    }
    public List<Ingredient> getIngredients(){
        return ingredients;
    }

    public void setIngredients(List<Ingredient> ingredients) {
        this.ingredients = ingredients;
    }
}
