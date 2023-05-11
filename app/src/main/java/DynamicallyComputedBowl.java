import htw.berlin.wi.prog2.domain.Bowl;
import htw.berlin.wi.prog2.domain.Ingredient;
import jdk.dynalink.DynamicLinker;

import java.util.List;

public class DynamicallyComputedBowl implements Bowl {
    private List<Ingredient> ingredients;
    private double calculatePrice;
    private int calculateCalories;
    private List<String> getIngredientNames;

    public DynamicallyComputedBowl(List<Ingredient> ingredients){
        this.ingredients = ingredients;
    }
    @Override
    public double calculatePrice(){
        if (calculatePrice == 0){
            calculatePrice = calculateTotalPrice();
        }
        return calculatePrice;
    }
    @Override
    public int calculateCalories(){
        if (calculateCalories == 0){
            calculateCalories = calculateTotalCalories();
        }
        return calculateCalories;
    }
    @Override
    public List<String> getIngredientNames(){
        if( getIngredientNames == null){
            getIngredientNames = calculateIngredientNames();
        }
        return getIngredientNames;
    }

    private double calculateTotalPrice() {
        //Berechnung des Gesamtpreises
        return calculatePrice;
    }

    private int calculateTotalCalories() {
        //Berechnung der Gesamtkalorienzahl
        return calculateCalories;
    }

    private List<String> calculateIngredientNames() {
        //Berechnung der Zutatennamen
        return getIngredientNames;
    }
}


