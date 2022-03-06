package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`

    @Test
    public void newDogTest(){

        //Given
        String dogname = "Balto";
        Date birthday = new Date(2020,11,03);
        int iD = 4321;

        //When
        Dog dog1 = new Dog(dogname, birthday, iD);
        String expectName = "Balto";
        //Then
        String actual = dog1.getName();
        Assert.assertEquals(expectName, actual);

    }
    // TODO - Create tests for `speak`

    @Test
    public void speakTest(){

        //Given
        String dogname = "Balto";
        Date birthday = new Date(2020,11,03);
        int iD = 4321;

        //When
        Dog dog1 = new Dog(dogname, birthday, iD);
        String expectedSpeak = "bark!";

        //Then
        String actual = dog1.speak();
        Assert.assertEquals(expectedSpeak,actual);

    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void birthdayTest(){


        //Given
        String dogname = "Balto";
        Date birthday = new Date(2020,11,03);
        int iD = 4321;

        //When
        Dog dog1 = new Dog(dogname, birthday, iD);

        //Then
        Date actualBirthday = dog1.getBirthDate();
        Assert.assertEquals(birthday,actualBirthday);


    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eatTest(){

        //Given
        String dogname = "Balto";
        Date birthday = new Date(2020,11,03);
        int iD = 4321;

        //When
        Dog dog1 = new Dog(dogname,birthday,iD);
        Food chow = new Food();
        dog1.eat(chow);

        //Then
        int expectedFood = 1;
        int actualFood = dog1.getNumberOfMealsEaten();
        Assert.assertEquals(expectedFood, actualFood);

    }
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`


    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        Dog dog = new Dog(null, null, null);
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }
}
