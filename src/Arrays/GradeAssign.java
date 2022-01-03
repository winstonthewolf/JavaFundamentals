/*
* (Assign grades) Write a program that reads student scores, gets the best score, and
then assigns grades based on the following scheme:
Grade is A if score is >= best -5
Grade is B if score is >= best -10;
Grade is C if score is >= best -15;
Grade is D if score is >= best -20;
Grade is F otherwise.
		 The program prompts the user to enter the total number of students, and then
prompts the user to enter all of the scores, and concludes by displaying the grades.
* */
import java.util.Scanner;

public class GradeAssign {
    public static void main (String [] args){

        Scanner input = new Scanner(System.in);
        int students =0;
        double [] scores;

        System.out.println("Num of students: ");
        students = input.nextInt();
        scores = new double [students];
        System.out.println("Enter scores: ");
        for(int i = 0; i < scores.length; i++ ){
            scores[i] = input.nextDouble();
        }

        //below can be its own method with the parameter being the array
        double best = 0;
        for(int i = 0; i < scores.length; i++){

            if(scores[i] > best){
                best = scores[i];
            }
        }
        System.out.println(best);

        for(int i =0; i< scores.length; i++){

            if (scores[i] < best-20)
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is F");
            else if (scores[i] >= best-20  && scores[i]  < best-15)
                    System.out.println("Student: "+i+" scored "+scores[i]+" and grade is D");
            else if (scores[i] >= best-15 && scores[i]  < best-10)
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is C");
            else if (scores[i] >= best-10  && scores[i]  < best-5)
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is B");
            else if (scores[i] >= best-5 )
                System.out.println("Student: "+i+" scored "+scores[i]+" and grade is A");
        }


    }
}
