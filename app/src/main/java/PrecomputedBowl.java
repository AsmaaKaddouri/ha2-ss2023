import htw.berlin.wi.prog2.domain.Bowl;

import java.util.List;

public class PrecomputedBowl implements Bowl {

    public double calculatePrice;
    public int calculateCalories;
    public List<String> getIngredientNames;

    public PrecomputedBowl(double calculatePrice, int calculateCalories, List<String> getIngredientNames) {
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
}
