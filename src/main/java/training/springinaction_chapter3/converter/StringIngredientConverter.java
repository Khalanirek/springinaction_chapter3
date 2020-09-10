package training.springinaction_chapter3.converter;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import training.springinaction_chapter3.tacos.Ingredient;
import training.springinaction_chapter3.tacos.data.IngredientRepository;

@Component
public class StringIngredientConverter implements Converter<String, Ingredient> {

    private IngredientRepository ingredientRepository;

    public StringIngredientConverter(IngredientRepository ingredientRepository) {
        this.ingredientRepository = ingredientRepository;
    }

    @Override
    public Ingredient convert(String s) {
        return ingredientRepository.findById(s).orElse(null);
    }
}
