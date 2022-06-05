package action_item;

import java.util.ArrayList;

public class Array_liner_forLoop {
    public static void main(String[] args) {
        //create an arrayList for country
        ArrayList<String> country = new ArrayList<>();
        country.add("Usa");
        country.add("Pakistan");
        country.add("India");
        country.add("Dubai");
        country.add("Bangladesh");

        //create a loop through all the value using for loop
        for(int i = 0; i < country.size(); i++) {
            System.out.println("My country is" + country.get(i));
            System.out.println("My country is " + i);

            }//end of the for loop


    }//end of main method


}//end of java class

