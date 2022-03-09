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
    @Test
    public void testAddingDog(){

        //Given
        Integer iD = 1234;
        String dogName = "Todd";
        Date birth = new Date(2020, 11, 03);
        Dog dogTodd = new Dog(dogName,birth,iD);

        //When
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
    @Test
    public void removeId(){

        //Given
        Integer iD = 5678;
        String dogName = "Rusty";
        Date birth = new Date(2020, 11, 03);
        Dog dogRusty = new Dog(dogName,birth,iD);
        int expected = 0;

        //When
        DogHouse.add(dogRusty);
        DogHouse.remove(5678);
        int actualDogAmnt = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected,actualDogAmnt);
        DogHouse.clear();
    }


    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void removeDog(){

        //Given
        Integer iD = 1234;
        String dogName = "Rusty";
        Date birth = new Date(2020, 11, 03);
        Dog dogRusty = new Dog(dogName,birth,iD);
        int expected = 0;

        //When
        DogHouse.add(dogRusty);
        DogHouse.remove(dogRusty);
        int actualDogAmnt = DogHouse.getNumberOfDogs();

        //Then
        Assert.assertEquals(expected,actualDogAmnt);
        DogHouse.clear();
    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogByIdTest(){

        //Given
        Integer iD = 1234;
        String dogName = "Rusty";
        Date birth = new Date(2020, 11, 03);
        Dog dogRusty = new Dog(dogName,birth,iD);

        Integer iD2 = 4321;
        String dogName2 = "Meaner";
        Date birth2 = new Date(2020, 02, 03);
        Dog dogMeaner = new Dog(dogName2,birth2,iD2);
        //When

        DogHouse.add(dogMeaner);
        DogHouse.add(dogRusty);
        Dog actualDog = DogHouse.getDogById(iD2);
        Dog expected = dogMeaner;

        //Then
        Assert.assertEquals(expected,actualDog);

        //Clear
        DogHouse.clear();
    }


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

        //clear
        DogHouse.clear();
    }
}
