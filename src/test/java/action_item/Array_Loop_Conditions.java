package action_item;

import java.util.ArrayList;

public class Array_Loop_Conditions {
    public static void main(String[] args) {
            //create and array with cities and print only when city is Brooklyn or city is Manhattan
            ArrayList<String> cities = new ArrayList<>();
            cities.add("Brooklyn");
            cities.add("Manhattan");
            cities.add("Queens");
            cities.add("Bronx");


            for (int i = 0; i < cities.size(); i++){
                //with if conditions

                if(cities.get(i) == "Brooklyn"){
                    System.out.println("My city is " + cities.get(i));
                } else if(cities.get(i) == "Manhattan"){
                    System.out.println("My city is " + cities.get(i));
                }//with or operator

            }//end of for loop


        }//end of main method
}//end of action item

