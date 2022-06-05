package action_item;

public class Conditional_Statements {
    public static void main(String[] args) {
        int Grade = 75;

        //if grade is greater than or equal to 90 and less than/equal to 100 then print result as A
        //if grade is greater than or equal to 80 and less than/equal to 90 then print result as B
        //if grade is greater than or equal to 70 and less than/equal to 80 then print result as C
        //if grade is greater than or equal to 60 and less than/equal to 700 then print result as D
        //if grade is less than 60 than print result as F

        if (Grade >= 90 && Grade <=100){
            System.out.println("Print Grade is A");
        } else if(Grade >=80 && Grade <=90){
            System.out.println("Print Grade is B");
        } else if(Grade >=70 && Grade <=80){
            System.out.println("Print Grade is C");
        } else if(Grade >=60 && Grade <=70){
            System.out.println("Print Grade is D");
        } else if(Grade < 60){
            System.out.println("Print Grade is F");
        }//end of condition

    }//end of main
}//end of action item
