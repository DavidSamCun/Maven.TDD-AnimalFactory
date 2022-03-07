package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {

    @Test // TODO - Create tests for `void add(Cat cat)`
    public void testAddingCats(){

        //Given
        Integer iD = 1234;
        String catName = "Todd";
        Date birth = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat(catName,birth,iD);
        CatHouse.add(catTodd);
        int expectedCatAmnt = 1;

        //Then

        int actualtCatAmnt = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCatAmnt,actualtCatAmnt);

        //Clear
        CatHouse.clear();

///Test runs fine indivually but when I try to run them all at once, some fail. Even tried building a new instance of the CatHouse but did not work.

    }

    // TODO - Create tests for `void remove(Integer id)`

    @Test
    public void testRemoveCatById(){

        //Given
        Integer iD1 = 4321;
        String catName1 = "Todd";
        Date birth1 = new Date(2018, 06, 15);

        Integer iD2 = 5678;
        String catName2 = "Mean";
        Date birth2 = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat(catName1,birth1,iD1);
        Cat catMean = new Cat(catName2,birth2,iD2);
        CatHouse.add(catTodd);
        CatHouse.add(catMean);

        //Then
        CatHouse.remove(4321);
        int expectedCatAmnt = 1;
        int actualCatAmnt = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCatAmnt,actualCatAmnt);

        //Clear
        CatHouse.clear();



    }
    // TODO - Create tests for `void remove(Cat cat)`

    @Test
    public void testRemoveCat(){

        //Given
        Integer iD1 = 1234;
        String catName1 = "Todd";
        Date birth1 = new Date(2018, 06, 15);

        Integer iD2 = 4321;
        String catName2 = "Mean";
        Date birth2 = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat(catName1,birth1,iD1);
        Cat catMean = new Cat(catName2,birth2,iD2);
        CatHouse.add(catTodd);
        CatHouse.add(catMean);

        //Then
        CatHouse.remove(catTodd);
        int expectedCatAmnt = 1;
        int actualCatAmnt = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCatAmnt,actualCatAmnt);

        //Clear
        CatHouse.clear();



    }



    // TODO - Create tests for `Cat getCatById(Integer id)`

    @Test
    public void getCatByIdTest(){

        //Given
        Integer iD1 = 1234;
        String catName1 = "Todd";
        Date birth1 = new Date(2018, 06, 15);

        Integer iD2 = 4321;
        String catName2 = "Mean";
        Date birth2 = new Date(2020, 11, 03);

        //When
        Cat catTodd = new Cat(catName1,birth1,iD1);
        Cat catMean = new Cat(catName2,birth2,iD2);
        CatHouse.add(catTodd);
        CatHouse.add(catMean);

        //Then
        Cat expectedCat = catTodd;
        Cat actualCat = CatHouse.getCatById(1234);
        Assert.assertEquals(expectedCat,actualCat);

        //Clear
        CatHouse.clear();
    }




    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumOfCatsTest(){

        //Given
        Integer iD1 = 1234;
        String catName1 = "Todd";
        Date birth1 = new Date(2018, 06, 15);

        Integer iD2 = 4321;
        String catName2 = "Mean";
        Date birth2 = new Date(2020, 11, 03);

        Integer iD3 = 7890;
        String catName3 = "Totoro";
        Date birth3 = new Date(2015, 04, 017);

        //When
        Cat catTodd = new Cat(catName1,birth1,iD1);
        Cat catMean = new Cat(catName2,birth2,iD2);
        Cat catTotoro = new Cat(catName3,birth3,iD3);
        CatHouse.add(catTodd);
        CatHouse.add(catMean);
        CatHouse.add(catTotoro);

        //Then
        int expectedCatAmnt = 3;
        int actualCat = CatHouse.getNumberOfCats();
        Assert.assertEquals(expectedCatAmnt,3);

        //Clear
        CatHouse.clear();
    }



}

