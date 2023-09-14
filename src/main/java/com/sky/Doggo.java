package com.sky;


import java.util.ArrayList;
import java.util.List;

public class Doggo {

    public static List<String> listOfPlacements(int place){
        List<String> output = new ArrayList<>();
        for (int i=1; i<=100; i++){
            if (i!=place){
                if (i%10 == 1 && i!=11){
                output.add(i+"st");}
                else if (i%10 == 2 && i!=12){
                    output.add(i+"nd");
                } else if (i%10 == 3 && i!=13) {
                    output.add(i+"rd");

                }else output.add(i+"th");

            }
        }
return output;
    }
}
