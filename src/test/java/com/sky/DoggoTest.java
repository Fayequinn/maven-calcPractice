package com.sky;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DoggoTest {

    @Test
     void isCorrectLength(){
        Assertions.assertEquals(99,Doggo.listOfPlacements(4).size());
    }

    @Test
    void is2ndPlaceNotInList(){
        Assertions.assertEquals(false, Doggo.listOfPlacements(2).contains("2nd"));
    }

    @Test
    void is3rdPlaceInList(){
        Assertions.assertEquals(true, Doggo.listOfPlacements(5).contains("3rd"));
    }
}
