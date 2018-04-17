package workshop.testing.data.model;
import org.junit.Test;


import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by soraw on 17-Apr-18.
 */
public class RecipeTest {

    @Test
    public void i_can_read_data_from_water(){
        //Arrange
        InputStream inputStream = RecipeTest.class.getResourceAsStream("/recipes/water.txt");

        //Action
        Recipe recipe = Recipe.readFromStream(inputStream);

        //Assert
        assertNotNull(recipe);
    }

}