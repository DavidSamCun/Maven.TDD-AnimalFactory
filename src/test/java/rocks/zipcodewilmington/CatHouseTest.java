package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test // TODO - Create tests for `void add(Cat cat)`
    public void testAddingCats(){
                    //super(String name,Date birthDate,Integer id);



        //Given
        //AnimalFactory cat1 = new AnimalFactory.createCat("Joe", 2010,07,12, 1231);
        String expectedName = "Rusty";
        Date expectedbirth = new Date();
        Integer expectediD = 57;

        //When
        Cat cat2 = new Cat(expectedName, expectedbirth, expectediD);

        //Then
        //Assert.assertEquals(expected, actual);

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveCat(){

        //Given

        //When

        //Then


    }
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
