package chapter25.tacos.data;

import chapter25.tacos.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
