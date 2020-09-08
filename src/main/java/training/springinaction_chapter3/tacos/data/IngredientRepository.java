package training.springinaction_chapter3.tacos.data;

import training.springinaction_chapter3.tacos.Ingredient;

public interface IngredientRepository {
    Iterable<Ingredient> findAll();
    Ingredient findById(String id);
    Ingredient save(Ingredient ingredient);
}
