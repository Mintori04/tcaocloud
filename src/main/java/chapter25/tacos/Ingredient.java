package chapter25.tacos;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor(access= AccessLevel.PRIVATE, force = true)
@Document(collection = "ingredients")
public class Ingredient {
    @Id
    private String id;
    private String name;
    private Type type;

    public Type getType() { return type; }

    public static enum Type{
        WRAP, PROTEIN, VEGGIES, CHEESE, SAUCE
    }
}