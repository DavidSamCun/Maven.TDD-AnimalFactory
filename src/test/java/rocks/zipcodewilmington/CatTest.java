package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {

    // TODO - Create tests for `void setName(String name)`
    @Test
    public void testsetName(){

        //Given
        Date birth = new Date(2005, 11, 05);
        Integer iD = 1234;
        String catName = "Zula";

        //When
        Cat catLeon = new Cat(catName, birth, iD);
        String expected = "Zula";

        //Then
        String output = catLeon.getName();
        Assert.assertEquals(expected,output);
        System.out.println(output);

    }

    // TODO - Create tests for `speak`

    @Test
    public void testSpeak(){

        //Given
        Date birth = new Date(2005, 11, 05);
        Integer iD = 1234;
        String catName = "Zula";

        //When
        Cat catLeon = new Cat("Zula", birth, 1234);
        String expected = "meow!";

        //Then
        String output = catLeon.speak();
        Assert.assertEquals(expected, output);
        System.out.println(output);


    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDate() {

        //Given
        Integer iD = 1234;
        String catName = "Leon";

        //When
        Date birth = new Date(2005, 11, 05);
        Cat catLeon = new Cat("catName", birth, 1234);
        Date expected = new Date(2005, 11, 05);

        //Then
        Date output = catLeon.getBirthDate();
        Assert.assertEquals(expected, output);


    }



    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void testCatEat(){

        //Given
        Integer iD = 1234;
        String catName = "Todd";
        Date birth = new Date(2020, 11, 03);


        //When
        Cat catTodd = new Cat(catName, birth, iD);
        Food chow = new Food();
        catTodd.eat(chow);
        int expectedFoodEaten = 1;

        //Then
        int actual = catTodd.getNumberOfMealsEaten();
        Assert.assertEquals(expectedFoodEaten, actual);


        //Assert.assertEquals();


    }

    // TODO - Create tests for `Integer getId()`
    @Test
    public void getIntId(){

        //Given
        Integer iD = 1234;
        String catName = "Todd";
        Date birth = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat("Todd", birth, iD);
        int expectedId = 1234;


        //Then
        int actualId = catTodd.getId();
        Assert.assertEquals(expectedId,actualId);


    }


    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`

    @Test
    public void testAnimalInheritance(){

        //Given
        Integer iD = 1234;
        String catName = "Todd";
        Date birth = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat(catName, birth, iD);
        boolean expected = true;

        //
        boolean actual = catTodd instanceof Animal;
        Assert.assertEquals(expected, actual);
    }


    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void testMammalInheritance(){
        //Given
        Integer iD = 1234;
        String catName = "Todd";
        Date birth = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat(catName, birth, iD);
        boolean expected = true;

        //
        boolean actual = catTodd instanceof Mammal;
        Assert.assertEquals(expected, actual);


    }
    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
