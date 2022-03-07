package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`

    public void testAddingDog(){

        //Given
        Integer iD = 1234;
        String catName = "Todd";
        Date birth = new Date(2020, 11, 03);

        //When
        Dog dogTodd = new Dog(catName,birth,iD);
        DogHouse.add(dogTodd);
        int expectedDogAmnt = 1;

        //Then

        int actualDogAmnt = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expectedDogAmnt,actualDogAmnt);
        System.out.println(actualDogAmnt);
        //Clear

        DogHouse.clear();

///Test runs fine indivually but when I try to run them all at once, some fail. Even tried building a new instance of the CatHouse but did not work.

    }

    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }
}
