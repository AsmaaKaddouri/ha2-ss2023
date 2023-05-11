package htw.berlin.wi.prog2;

import htw.berlin.wi.prog2.domain.Bowl;
import htw.berlin.wi.prog2.domain.Ingredient;

import java.util.List;
import java.util.stream.Collectors;

public class DynamicallyComputedBowl implements Bowl {

    private final List<Ingredient> ingredients;
    private double calculatePrice;
    private int calculateCalories;
    private List<String> ingredientNames;
}
    public DynamicallyComputedBowl(List<Ingredient> ingredients){
        this.Ingredient = ingredients();
        this.calculatePrice = calculateTotalPrice();
        this.calculateCalories = calculateTotalCalories();
    }
    @Override
    public double calculatePrice(){
        if (calculatePrice == 0) {
            calculatePrice = ingredients.stream()
                    .mapToDouble(Ingredient::getPricePer100g)
                    .sum() * 0.01;
        }
        return calculatePrice;
    }
    @Override
    public int calculateCalories(){
        if (calculateCalories == 0) {
            calculateCalories = ingredients.stream()
                    .mapToInt(Ingredient::getCaloriesPer100g)
                    .sum();
        }
        return calculateCalories;
    }
        @Override
        public List<String> getIngredientNames(){
            if( ingredientNames == null){
                ingredientNames = ingredients.stream()
                        .map(Ingredient::getName)
                        .collect(Collectors.toList());
        }
        return ingredientNames;

    }

    private int calculateTotalCalories() {
        return ingredients.stream()
                .mapToInt(Ingredient::getCaloriesPer100g)
                .sum() * ingredients.size() / 100;
    }

    private int calculateTotalCalories() {
        //Berechnung der Gesamtkalorienzahl
        return calculateCalories;
    }

    private List<String> calculateIngredientNames() {
        //Berechnung der Zutatennamen
        return ingredients.stream()
                .map(Ingredient::getName)
                .collect(Collectors.toList());
    }
}


